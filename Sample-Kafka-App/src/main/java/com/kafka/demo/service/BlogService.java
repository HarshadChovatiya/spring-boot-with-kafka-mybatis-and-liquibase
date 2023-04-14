package com.kafka.demo.service;

import com.kafka.demo.dao.BlogDao;
import com.kafka.demo.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private BlogDao blogDao;

    public BlogService(BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    public List<Blog> getAllBlogs() {
        return blogDao.getAllBlogs();
    }

}
