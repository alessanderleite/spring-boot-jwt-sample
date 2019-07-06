package br.com.alessanderleite;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.alessanderleite.domain.Vehicle;
import br.com.alessanderleite.repository.VehicleRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

	@Autowired
	VehicleRepository vehicles;

	@Override
	public void run(String... args) throws Exception {
		log.debug("initializing vehicles data...");
		Arrays.asList("moto", "car").forEach(v -> this.vehicles.saveAndFlush(Vehicle.builder().name(v).build()));
		
		log.debug("printing all vehicles...");
		this.vehicles.findAll().forEach(v -> log.debug(" Vehicle :" + v.toString()));
	}
}
