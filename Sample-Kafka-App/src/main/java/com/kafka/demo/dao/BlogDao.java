package com.kafka.demo.dao;

import com.kafka.demo.model.Blog;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BlogDao {

    private SqlSession sqlSession;

    public BlogDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<Blog> getAllBlogs() {
        return sqlSession.selectList("mappers.BlogMapper.get_all_blog");
    }

}
