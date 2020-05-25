package it.objectmethod.cceservicelayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.cceservicelayer.domain.LineaProdottoEntity;

@Repository
public interface LineaProdottoRepository extends JpaRepository<LineaProdottoEntity, Long> {

}
