package com.uchat.uchat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="blog")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog implements Serializable {

  private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idx;
    private String body;
    private String writter;
    private int likes;
    private int views;
    private String regDate;


}
