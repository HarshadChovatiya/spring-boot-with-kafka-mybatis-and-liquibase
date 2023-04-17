package com.kafka.demo.dao;

import com.kafka.demo.model.Blog;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BlogDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogDao.class);

    private SqlSession sqlSession;

    public BlogDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<Blog> getAllBlogs() {
        return sqlSession.selectList("mappers.BlogMapper.get_all_blog");
    }

    public Blog createBlog(Blog blog) {
        this.sqlSession.insert("mappers.BlogMapper.insert_blog", blog);
        LOGGER.info("Blog with id : {} created successfully", blog.getId());
        return blog;
    }

}
