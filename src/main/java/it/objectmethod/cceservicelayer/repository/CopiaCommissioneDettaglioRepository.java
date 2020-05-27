package it.objectmethod.cceservicelayer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.cceservicelayer.domain.CopiaCommissioneDettaglioEntity;

@Repository
public interface CopiaCommissioneDettaglioRepository extends JpaRepository<CopiaCommissioneDettaglioEntity, Integer> {

	List<CopiaCommissioneDettaglioEntity> findAllByCopiaCommissioneId(Integer idComm);

}
