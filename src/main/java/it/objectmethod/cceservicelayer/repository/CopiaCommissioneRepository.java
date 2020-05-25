package it.objectmethod.cceservicelayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.cceservicelayer.domain.CopiaCommissioneEntity;

@Repository
public interface CopiaCommissioneRepository extends JpaRepository<CopiaCommissioneEntity, Integer> {

}
