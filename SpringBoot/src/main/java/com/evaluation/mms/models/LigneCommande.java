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

public class LigneCommande  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected   Long id;

    @NotNull(message = "quantité  est un champ obligations")
    private Long qte;

    @NotNull(message = "prix Unitaire est un champ obligations")
    private BigDecimal prixUnitaire;

    @NotNull(message = "prix Total est un champ obligations")
    private BigDecimal prixTotal;

    @NotNull(message = "etat est un champ obligations")
    private Long etat;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE})
    private Produit produit;


}
