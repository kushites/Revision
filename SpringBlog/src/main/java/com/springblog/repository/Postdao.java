package com.springblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springblog.model.Post;

public interface Postdao extends JpaRepository<Post, Integer> {

}
