package br.com.rotafood.api.domain.logistic.models;

import java.util.UUID;

import br.com.rotafood.api.domain.order.models.Order;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vrp_orders")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class VrpOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;  

    @ManyToOne
    @JoinColumn(name = "vrpRouteId")
    private VrpRoute vrpRoute;

    @Column
    private int index;
    
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;
    
    
}
