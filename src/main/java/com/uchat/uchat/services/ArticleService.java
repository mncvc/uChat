package com.uchat.uchat.services;

import com.uchat.uchat.model.Article;

import java.util.List;

public interface ArticleService {

    List<Article> findAll();

    Article findArticleByIdx(int idx);
// 자주 들어가는 게시물을 로그로 나타낼 예정
    void save(Article article);

    void updateById(int idx, Article article);

    List<Article> findAllByWritter(String id);

    void deleteArticleByIdx(int idx);
}
