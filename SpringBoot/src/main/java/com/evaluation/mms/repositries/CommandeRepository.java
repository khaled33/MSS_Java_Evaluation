package com.evaluation.mms.repositries;

import com.evaluation.mms.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CommandeRepository extends JpaRepository<Commande,Long> {

}
