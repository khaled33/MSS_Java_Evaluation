package com.evaluation.mms.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Client  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected   Long id;
    @NotNull(message = "code est un champ obligations")
    private String code;

    @NotNull(message = "nom est un champ obligations")
    private String nom;

    @NotNull(message = "prenom est un champ obligations")
    private String prenom;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @NotNull(message = "Date Naissance est un champ obligations")
    private LocalDate dateNaissance;

    @NotNull(message = "adresse est un champ obligations")
    private String adresse;

    @NotNull(message = "ville est un champ obligations")
    private String ville;

    @NotNull(message = "code Postal est un champ obligations")
    private Long codePostal;

    @NotNull(message = "tel est un champ obligations")
    private String tel;

    @NotNull(message = "fax est un champ obligations")
    private String fax;

    @NotNull(message = "gsm est un champ obligations")
    private String gsm;

    @NotNull(message = "emil est un champ obligations")
    private String emil;

    @OneToMany
    private List<Commande> commande;
}
