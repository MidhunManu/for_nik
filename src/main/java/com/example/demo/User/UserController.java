package com.example.demo.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
public class UserController {

	@PostMapping("/")
	public ResponseEntity<String> index(User user) {
		System.out.println(user);
		if(user != null) {
			return ResponseEntity.status(HttpStatus.OK).body("ok");
		}
		else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("not ok");
		}
	}
}
