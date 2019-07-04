package br.com.alessanderleite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alessanderleite.domain.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
}
