package com.springblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springblog.model.Comment;
import com.springblog.model.Post;
import com.springblog.service.Commentservice;

@RestController
public class CommentController {
	
	@Autowired
	Commentservice commentservice;

	@PostMapping("/savecomment/{id}")
	public ResponseEntity<Post> saveComment(@PathVariable Integer id, @RequestBody Comment com){
		Post post  = commentservice.saveComment(com, id);
		return new ResponseEntity<Post>(post, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getallcomment")
	public ResponseEntity<List<Comment>> getallcomment(){
		List<Comment> list = commentservice.getAllComments();
		return new ResponseEntity<List<Comment>>(list, HttpStatus.ACCEPTED);
	}
}
