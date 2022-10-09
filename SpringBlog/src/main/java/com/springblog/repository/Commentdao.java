package com.springblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springblog.model.Comment;

public interface Commentdao extends JpaRepository<Comment, Integer>{

}
