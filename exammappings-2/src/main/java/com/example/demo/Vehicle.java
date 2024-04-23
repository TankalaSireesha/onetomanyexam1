package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer id;
	private String veh_name;
	private String veh_com;
	private Integer veh_no;
	public Vehicle(Integer id, String veh_name, String veh_com, Integer veh_no) {
		super();
		this.id = id;
		this.veh_name = veh_name;
		this.veh_com = veh_com;
		this.veh_no = veh_no;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVeh_name() {
		return veh_name;
	}
	public void setVeh_name(String veh_name) {
		this.veh_name = veh_name;
	}
	public String getVeh_com() {
		return veh_com;
	}
	public void setVeh_com(String veh_com) {
		this.veh_com = veh_com;
	}
	public Integer getVeh_no() {
		return veh_no;
	}
	public void setVeh_no(Integer veh_no) {
		this.veh_no = veh_no;
	}
	
}
