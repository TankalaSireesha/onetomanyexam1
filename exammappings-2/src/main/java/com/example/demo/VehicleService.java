package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
	@Autowired
	private VehicleRepository vr;
	
	public List<Vehicle>getAllVehicles(){
		return vr.findAll();
	}
	public Optional<Vehicle> getVehicleById(Integer id){
		return vr.findById(id);
	}
	public Vehicle create(Vehicle v) {
		return vr.save(v);
	}
	public Vehicle update(Vehicle v) {
		return vr.save(v);
	}
	public void delete(Integer id) {
		 vr.deleteById(id);;
	}
}
