package com.springblog.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.springblog.exceptions.NoCommentFoundException;
import com.springblog.model.Comment;
import com.springblog.model.Post;
import com.springblog.repository.Commentdao;
import com.springblog.repository.Postdao;

@Service
public class Commentserviceimpl implements Commentservice {
	
	@Autowired
	Commentdao commentdao;
	
	@Autowired
	Postdao postdao;
	
	@Override
	public List<Comment> getAllComments() throws NoCommentFoundException {
		List<Comment> list = commentdao.findAll();
		
		if(list!=null) {
			throw new NoCommentFoundException("No Comment found");
		}
		return list;
	}

	@Override
	public Post saveComment(Comment com, int id) {
		Optional<Post> post = postdao.findById(id);
		
		post.get().getComments().add(com);
		
		return post.get();
	}
	
	



}
