package it.objectmethod.cceservicelayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.cceservicelayer.domain.ProdottoEntity;

@Repository
public interface ProdottoRepository extends JpaRepository<ProdottoEntity, Long> {

}
