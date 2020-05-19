package it.objectmethod.cceservicelayer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.cceservicelayer.domain.ComuneEntity;

@Repository
public interface ComuneRepository extends JpaRepository<ComuneEntity, Integer> {
	List<ComuneEntity> findAllByProvincia(String nomProv);

	@Query("SELECT DISTINCT c.provincia FROM ComuneEntity c WHERE c.regione= ?1")
	List<String> findProvinceByRegione(String regione);

	@Query("SELECT DISTINCT c.regione FROM ComuneEntity c")
	List<String> getAllRegione();

}
