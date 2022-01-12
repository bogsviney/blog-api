package com.nazarov.blog.repository;

import com.nazarov.blog.entity.Article;
import com.nazarov.blog.repository.mapper.ArticleRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class JDBCArticleRepository implements ArticleRepository{

    private static final ArticleRowMapper ARTICLE_ROW_MAPPER = new ArticleRowMapper();

    private static final String FIND_ALL_SQL = "SELECT id, title, content FROM messages;";

    private final JdbcTemplate jdbcTemplate;

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<Article> findAll() {
        return jdbcTemplate.query(FIND_ALL_SQL, ARTICLE_ROW_MAPPER);
    }
}
