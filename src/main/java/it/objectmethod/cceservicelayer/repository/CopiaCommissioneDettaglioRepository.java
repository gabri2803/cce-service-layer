package it.objectmethod.cceservicelayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.cceservicelayer.domain.CopiaCommissioneDettaglioEntity;

@Repository
public interface CopiaCommissioneDettaglioRepository extends JpaRepository<CopiaCommissioneDettaglioEntity, Integer> {

}
