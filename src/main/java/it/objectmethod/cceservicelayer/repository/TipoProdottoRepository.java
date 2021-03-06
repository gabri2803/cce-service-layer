package it.objectmethod.cceservicelayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.cceservicelayer.domain.TipoProdottoEntity;

@Repository
public interface TipoProdottoRepository extends JpaRepository<TipoProdottoEntity, Long> {

}
