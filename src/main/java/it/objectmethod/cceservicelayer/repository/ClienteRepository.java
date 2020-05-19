package it.objectmethod.cceservicelayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.objectmethod.cceservicelayer.domain.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

}
