package com.example.demo;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class User {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		
		private Integer id;
		private String name;
		
		@OneToMany(cascade=CascadeType.ALL)
		@JoinColumn(name="user_veh_id")
		
		private List<Vehicle>v1;

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(Integer id, String name, List<Vehicle> v1) {
			super();
			this.id = id;
			this.name = name;
			this.v1 = v1;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Vehicle> getV1() {
			return v1;
		}

		public void setV1(List<Vehicle> v1) {
			this.v1 = v1;
		}
		
		
}
