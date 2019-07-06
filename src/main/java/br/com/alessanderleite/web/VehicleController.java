package br.com.alessanderleite.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alessanderleite.repository.VehicleRepository;

import static org.springframework.http.ResponseEntity.ok;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("v1/vehicles")
public class VehicleController {

	private VehicleRepository vehicles;

	public VehicleController(VehicleRepository vehicles) {
		this.vehicles = vehicles;
	}
	
	@GetMapping("")
	public ResponseEntity all() {
		return ok(this.vehicles.findAll());
	}
	
	@PostMapping("")
	public ResponseEntity save(@RequestBody VehicleForm form, HttpServletRequest request) {
		
	}
}
