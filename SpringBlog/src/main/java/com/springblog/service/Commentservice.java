package com.springblog.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springblog.exceptions.NoCommentFoundException;
import com.springblog.model.Comment;
import com.springblog.model.Post;
import com.springblog.repository.Commentdao;

@Component
public interface Commentservice {
		
	public List<Comment> getAllComments() throws NoCommentFoundException;
	
	public Post saveComment(Comment com, int id);
}
