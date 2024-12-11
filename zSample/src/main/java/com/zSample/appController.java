package com.zSample;

import java.awt.print.Book;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class appController {
	
	@GetMapping("home")
	public ResponseEntity<String> getHome(){
		return new ResponseEntity<String>("Home of Books",HttpStatus.OK);
	}
	@PostMapping("create")
	public ResponseEntity<String> createBook(@RequestBody Book book){
		return new ResponseEntity<String>("Home",HttpStatus.ACCEPTED);
	}
	@PutMapping("Update")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		return new ResponseEntity<String>("Home",HttpStatus.OK);
	}
	@DeleteMapping("remove/{id}")
	public ResponseEntity<String> removeBook(@PathVariable("id") int Id){
		return new ResponseEntity<String>("Home",HttpStatus.NOT_FOUND);
	}

}
