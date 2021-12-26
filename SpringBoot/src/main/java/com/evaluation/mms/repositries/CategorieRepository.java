package com.evaluation.mms.repositries;

import com.evaluation.mms.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
