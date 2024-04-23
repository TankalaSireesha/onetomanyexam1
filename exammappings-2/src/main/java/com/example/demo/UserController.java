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
public class UserController {
		@Autowired
		
		private UserService us;
		
		@GetMapping("/user")
		public List<User>getAllUSers(){
			return us.getAllUsers();
		}
		@GetMapping("/user/{id}")
		public Optional<User> getUserById1(@PathVariable int id){
			return us.getUserById(id);
		}
		@PostMapping("/user")
		public User create(@RequestBody User u) {
			return us.create(u);
		}
		@PutMapping("/user/{id}")
		public User update(@RequestBody User u) {
			return us.update(u);
		}
		@DeleteMapping("/user/{id}")
		public void delete(@PathVariable int id) {
			us.delete(id);
		}
		
}
