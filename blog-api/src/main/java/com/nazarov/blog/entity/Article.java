package com.nazarov.blog.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Builder

public class Article {

    private int id;
    private String title;
    private String content;
}
