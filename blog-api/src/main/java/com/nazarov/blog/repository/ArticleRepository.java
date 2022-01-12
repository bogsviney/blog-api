package com.nazarov.blog.repository;

import com.nazarov.blog.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleRepository {
    List<Article> findAll();

}
