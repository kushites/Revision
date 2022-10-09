package com.springblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springblog.model.Post;
import com.springblog.service.Postservice;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class PostController {
	
	@Autowired
	Postservice postservice;
	
	@PostMapping("/savepost")
	public ResponseEntity<Post> savePost(@RequestBody Post post){
		Post pos =postservice.savePost(post);
		return new ResponseEntity<Post>(pos, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getpost/{id}")
	public ResponseEntity<Post> getpost(@PathVariable Integer id){
		Post post = postservice.getPost(id);
		return new ResponseEntity<Post>(post, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getallpost")
	public ResponseEntity<List<Post>> getallpost(){
		List<Post> list = postservice.getAllPost();
		return new ResponseEntity<List<Post>>(list, HttpStatus.ACCEPTED);
	}
	

}
