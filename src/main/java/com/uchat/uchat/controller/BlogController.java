package com.uchat.uchat.controller;

import com.uchat.uchat.services.BlogService;
import com.uchat.uchat.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Blog>> getAllBlogs(){
        List<Blog> posts =  blogService.findAll();


        return new ResponseEntity<>(posts, HttpStatus.OK);
    }


}
