package com.nazarov.blog.service;



import com.nazarov.blog.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> findAll();
}
