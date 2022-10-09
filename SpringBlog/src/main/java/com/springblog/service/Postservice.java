package com.springblog.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springblog.exceptions.NoPostfoundexception;
import com.springblog.model.Post;
import com.springblog.repository.Postdao;

@Component
public interface Postservice  {
	
	public Post savePost(Post post);
		
	public Post getPost(int id) throws  NoPostfoundexception;
	
	public List<Post> getAllPost() throws NoPostfoundexception;
}
