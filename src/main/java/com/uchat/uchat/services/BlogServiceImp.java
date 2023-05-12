package com.uchat.uchat.services;

import com.uchat.uchat.model.Blog;
import com.uchat.uchat.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImp implements BlogService{

@Autowired
    private BlogRepository br;

    @Override
    public List<Blog> findAll() {
        List<Blog> post = new ArrayList<>();
        br.findAll().forEach(e-> post.add(e));

        return post;
    }
}
