package com.evaluation.mms.repositries;

import com.evaluation.mms.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProduitRepository extends JpaRepository<Produit,Long> {
     List<Produit> findByCategorieId(long CategorieId);


     @Query(nativeQuery = true, value = "SELECT * FROM Produit p WHERE p.categorie.id = :categorieId   DESC LIMIT 10")
      List<Produit> listProduitssimilaires(@Param("categorieId") long categorieId);

}
