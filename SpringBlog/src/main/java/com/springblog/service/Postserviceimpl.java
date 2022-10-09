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

import com.springblog.exceptions.NoPostfoundexception;
import com.springblog.model.Comment;
import com.springblog.model.Post;
import com.springblog.repository.Postdao;

@Service
public class Postserviceimpl implements Postservice {
	
	@Autowired
	Postdao postdao;

	@Override
	public Post getPost(int id) throws NoPostfoundexception {
	Optional<Post> post =	postdao.findById(id);
		if(post.isEmpty()) {
			throw new NoPostfoundexception("No Post found");
		}
		return post.get();
	}

	@Override
	public List<Post> getAllPost() throws NoPostfoundexception {
		List <Post> list = postdao.findAll();
		if(list==null) {
			throw new NoPostfoundexception("No Post found");
		}
		
		return list;
	}

	@Override
	public Post savePost(Post post) {
		return postdao.save(post);
		
	}

	

}
