package com.kafka.demo.service;

import com.kafka.demo.dao.BlogDao;
import com.kafka.demo.model.dto.CreateBlogDTO;
import com.kafka.demo.model.AppUser;
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

    public Blog createBlog(CreateBlogDTO createBlogDTO) {
        Blog blog = new Blog();
        blog.setTitle(createBlogDTO.getTitle());

        AppUser appUser = new AppUser();
        appUser.setId(createBlogDTO.getUserId());

        blog.setAppUser(appUser);

        return blogDao.createBlog(blog);
    }

}
