package com.uchat.uchat.controller;

import com.uchat.uchat.model.Article;
import com.uchat.uchat.model.Blog;
import com.uchat.uchat.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
@Autowired
    private ArticleService as;

@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Article>> getAllArticle(){
        List<Article> posts =  as.findAll();
    return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    // localHost:8080/article/{idx}
@GetMapping(value = "/detail/{idx}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Article> findByIdxArticle(@PathVariable int idx){
        Article article = as.findArticleByIdx(idx);
    return new ResponseEntity<>(article,HttpStatus.OK);
}

@GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Article>> findArticleById(@PathVariable String id){
    List<Article> myArticles = as.findAllByWritter(id);


    return new ResponseEntity<>(myArticles,HttpStatus.OK);
}

@PostMapping(value="/add-post", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Article> setArticle(@RequestBody() Article article){
     as.save(article);
    return new ResponseEntity<>(article,HttpStatus.OK);
}

@PutMapping(value = "/{idx}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Article> updateArticle(@PathVariable int idx, @RequestBody Article article){
        as.updateById(idx,article);

    return new ResponseEntity<>(article,HttpStatus.OK) ;
}

@DeleteMapping(value = "/detail/{idx}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Void> deleteArticle(@PathVariable("idx") int idx){
    as.deleteArticleByIdx(idx);

    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
}






}
