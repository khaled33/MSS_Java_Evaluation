package com.evaluation.mms.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Produit  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected   Long id;
    @NotNull(message = "code est un champ obligations")
    private String code;

    @NotNull(message = "marque est un champ obligations")
    private String marque;

    @NotNull(message = "modale est un champ obligations")
    private String modale;

    @NotNull(message = "caracteristiques est un champ obligations")
    private String caracteristiques;

    @NotNull(message = "prix Unitaire est un champ obligations")
    private BigDecimal prixUnitaire;

    @NotNull(message = "quantite est un champ obligations")
    private long quantite;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Categorie categorie;
}
