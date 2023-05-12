package com.uchat.uchat.repository;

import com.uchat.uchat.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article,Integer> {
    Article findArticleByIdx(int idx);
    List<Article> findAllByWritter(String id);
    void deleteArticleByIdx(int idx);


}
// save() 저장 findById