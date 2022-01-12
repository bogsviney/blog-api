package com.nazarov.blog.repository.mapper;

import com.nazarov.blog.entity.Article;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleRowMapper implements RowMapper<Article> {

    public Article mapRow(ResultSet resultSet, int numRow) throws SQLException {
        int id = resultSet.getInt("id");
        String title = resultSet.getString("title");
        String content = resultSet.getString("content");

        Article article = Article.builder().

                id(id)
                .title(title)
                .content(content)
                .build();

        return article;

    }

}
