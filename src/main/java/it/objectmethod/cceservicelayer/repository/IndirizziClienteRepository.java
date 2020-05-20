package it.objectmethod.cceservicelayer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.cceservicelayer.domain.IndirizziClienteEntity;

@Repository
public interface IndirizziClienteRepository extends JpaRepository<IndirizziClienteEntity, Integer> {
	List<IndirizziClienteEntity> findAllByClienteId(int id);

}
