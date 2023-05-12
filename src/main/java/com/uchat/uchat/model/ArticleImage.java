package com.uchat.uchat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="article_image")
@Entity
class ArticleImage{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private Integer article_idx;// article의 idx 을 참조한다.
    private String img_url;
    private String regdate;

}