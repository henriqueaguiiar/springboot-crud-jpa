LABEL authors="henriqueaguiiar"

ENTRYPOINT ["top", "-b"]
# Etapa 1: Build da aplicação (compilação com Maven)
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia os arquivos do Maven primeiro (para cachear dependências)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia o código-fonte e empacota a aplicação
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Imagem final (execução)
FROM eclipse-temurin:17-jdk-alpine

# Diretório onde o app vai rodar
WORKDIR /app

# Copia apenas o jar gerado da etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta padrão do Spring Boot
EXPOSE 8080

# Variáveis de ambiente (pode sobrescrever via docker-compose)
ENV SPRING_PROFILES_ACTIVE=prod

# Comando de inicialização
ENTRYPOINT ["java", "-jar", "app.jar"]
