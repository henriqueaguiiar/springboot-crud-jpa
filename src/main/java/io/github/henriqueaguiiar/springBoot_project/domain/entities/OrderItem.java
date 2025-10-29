package io.github.henriqueaguiiar.springBoot_project.domain.entities;

import io.github.henriqueaguiiar.springBoot_project.domain.entities.pk.OrderItemPk;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_order_items")
public class OrderItem implements Serializable {
    public static final long serialVersionUID = 1L;
    @Setter(AccessLevel.NONE)
    @EmbeddedId
    private OrderItemPk id;
    private Integer quantity;
    private Double price;

    public OrderItem(Order order, Product product,Double price, Integer quantity) {
        id.setProduct(product);
        id.setOrder(order);
        this.price = price;
        this.quantity = quantity;
    }

    public Order getOrder() {
        return id.getOrder();
    }
    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product) {
        id.setProduct(product);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
