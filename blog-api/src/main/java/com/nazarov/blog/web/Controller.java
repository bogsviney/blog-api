package com.nazarov.blog.web;

import com.nazarov.blog.entity.Article;
import com.nazarov.blog.service.ArticleServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping(path = "/blog")
    @RequiredArgsConstructor

    public class Controller {

        Logger logger = LoggerFactory.getLogger(getClass());

        private final ArticleServiceImplementation articleServiceImplementationn;

        @GetMapping
        public List<Article> findAAll() {
            List<Article> articles = articleServiceImplementationn.findAll();
            logger.info("blog size{}", articles.size());
            logger.info("articles {}", articles);

            return articles;
        }

}
