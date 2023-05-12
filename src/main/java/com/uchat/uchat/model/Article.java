package com.uchat.uchat.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="article")
@Entity
public class Article {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String body;
    private String writter;
    @Temporal(TemporalType.TIMESTAMP)
   @CreationTimestamp
    private Date regdate;
    private int likes;
    private int view;
    private String img_url;

//    @OneToMany
//    @JoinColumn(name = "article_idx")
//    private List<ArticleImage> images = new ArrayList<>() {
//    };

}



//외래키 구조로 이루어진 모델 테이블을 매핑 하는 법.


