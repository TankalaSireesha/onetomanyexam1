package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
	@Autowired
	
	private VehicleService vs;
	
	@GetMapping("/user")
	public List<Vehicle>getAllVehicles(){
		return vs.getAllVehicles();
	}
	@GetMapping("/user/{id}")
	public Optional<Vehicle> getVehicleById1(@PathVariable int id){
		return vs.getVehicleById(id);
	}
	@PostMapping("/user")
	public Vehicle create(@RequestBody Vehicle u) {
		return vs.create(u);
	}
	@PutMapping("/user/{id}")
	public Vehicle update(@RequestBody Vehicle u) {
		return vs.update(u);
	}
	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable int id) {
		vs.delete(id);
	}
}
