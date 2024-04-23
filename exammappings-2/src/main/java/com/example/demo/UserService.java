package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
		@Autowired
		private UserRepository ur;
		
		public List<User>getAllUsers(){
			return ur.findAll();
		}
		public Optional<User> getUserById(Integer id){
			return ur.findById(id);
		}
		public User create(User u) {
			return ur.save(u);
		}
		public User update(User u) {
			return ur.save(u);
		}
		public void delete(Integer id) {
			 ur.deleteById(id);;
		}
}

