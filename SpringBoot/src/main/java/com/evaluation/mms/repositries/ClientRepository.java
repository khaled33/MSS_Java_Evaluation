package com.evaluation.mms.repositries;

import com.evaluation.mms.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ClientRepository extends JpaRepository<Client,Long> {

}
