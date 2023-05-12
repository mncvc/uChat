package com.uchat.uchat;

import com.uchat.uchat.model.Article;
import com.uchat.uchat.repository.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
class UChatApplicationTests {


    @Autowired
    ArticleRepository ar;
    @Test
    void contextLoads() {
        ar.findAll();

    }

}
