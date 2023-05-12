package com.uchat.uchat.services;

import com.uchat.uchat.model.Article;
import com.uchat.uchat.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImp implements ArticleService{

    @Autowired
    private ArticleRepository ar;

    @Override
    public List<Article> findAll() {
        List<Article> post = new ArrayList<>();
        ar.findAll().forEach(e-> post.add(e));

        return post;
    }

    @Override
    public Article findArticleByIdx(int idx) {
        Article post = ar.findArticleByIdx(idx);
        return post;
    }
    @Override
    public List<Article> findAllByWritter(String id) {
        List<Article> myArticles = ar.findAllByWritter(id);
        return myArticles;
    }

    @Override
    public void deleteArticleByIdx(int idx) {
        ar.deleteArticleByIdx(idx);
    }

    @Override
    public void save(Article article) {


        ar.save(article);
    }

    @Override
    public void updateById(int idx, Article article) {
        Article post = ar.findArticleByIdx(idx);
        post.setLikes(article.getLikes());
        post.setView(article.getView());
        post.setBody(article.getBody());
        post.setImg_url(article.getImg_url());

        ar.save(post);
    }



}
