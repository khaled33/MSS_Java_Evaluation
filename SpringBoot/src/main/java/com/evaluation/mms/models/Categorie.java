package com.evaluation.mms.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Categorie  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected   Long id;
    @NotNull(message = "code est un champ obligations")
    private String code;
    @NotNull(message = "libelle est un champ obligations")
    private String libelle;
}
