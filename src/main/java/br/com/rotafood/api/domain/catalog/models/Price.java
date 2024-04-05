package br.com.rotafood.api.domain.catalog.models;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "prices")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Double value;
    private Double originalValue;

    @OneToMany(mappedBy = "price")
    private List<ScalePrice> scalePrices;

    @OneToOne
    @JoinColumn(name = "itemId", referencedColumnName = "id")
    private Item item;
}
