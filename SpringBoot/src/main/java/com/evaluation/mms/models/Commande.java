package com.evaluation.mms.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Commande  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected   Long id;
    @NotNull(message = "numero est un champ obligations")
    private String numero;

    @NotNull(message = "date est un champ obligations")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate date;

    @NotNull(message = "prix Total est un champ obligations")
    private BigDecimal prixTotal;

    @NotNull(message = "etat est un champ obligations")
    private Long etat;

    @OneToMany(cascade = {CascadeType.MERGE})
    private  List<LigneCommande> ligneCommande;
    }
