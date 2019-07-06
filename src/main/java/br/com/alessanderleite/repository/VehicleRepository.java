package br.com.alessanderleite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.alessanderleite.domain.Vehicle;

@RepositoryRestResource(path = "vehicles", collectionResourceRel = "vehicles", itemResourceRel = "vehicle")
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
}
