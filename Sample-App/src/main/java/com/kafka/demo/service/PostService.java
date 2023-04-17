package com.kafka.demo.service;

import com.kafka.demo.dao.PostDao;
import com.kafka.demo.model.Blog;
import com.kafka.demo.model.Post;
import com.kafka.demo.model.dto.CreatePostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostDao postDao;

    public PostService(PostDao postDao) {
        this.postDao = postDao;
    }

    public Post createPost(CreatePostDTO createPostDTO) {
        Post post = new Post();
        post.setTitle(createPostDTO.getTitle());
        post.setContent(createPostDTO.getContent());

        Blog blog = new Blog();
        blog.setId(createPostDTO.getBlogId());
        post.setBlog(blog);

        return postDao.createPost(post);
    }

    public List<Post> getAllPost() {
        return postDao.getAllPost();
    }

}
