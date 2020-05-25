package it.objectmethod.cceservicelayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.cceservicelayer.domain.CondizioniPagamentoEntity;

@Repository
public interface CondizioniPagamentoRepository extends JpaRepository<CondizioniPagamentoEntity, Long> {

}
