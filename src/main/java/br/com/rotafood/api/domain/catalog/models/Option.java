package br.com.rotafood.api.domain.catalog.models;

import java.util.UUID;

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
@Table(name = "options")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String status;
    private Integer index;
    private UUID productId;
    private Double price;
    private String externalCode;

    @ManyToOne
    @JoinColumn(name = "optionGroupId", referencedColumnName = "id")
    private OptionGroup optionGroup;

}