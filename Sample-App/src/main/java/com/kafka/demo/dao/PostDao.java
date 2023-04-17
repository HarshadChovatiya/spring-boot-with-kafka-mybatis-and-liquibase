package com.kafka.demo.dao;

import com.kafka.demo.model.Post;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostDao {

    private SqlSession sqlSession;

    public PostDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Post createPost(Post post) {
        sqlSession.insert("mappers.PostMapper.insert_post", post);
        return post;
    }

    public List<Post> getAllPost() {
        return sqlSession.selectList("mappers.PostMapper.get_all_post");
    }

}
