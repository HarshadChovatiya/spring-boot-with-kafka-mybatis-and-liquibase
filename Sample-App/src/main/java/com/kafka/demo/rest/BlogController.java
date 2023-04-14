package com.kafka.demo.rest;

import com.kafka.demo.model.Blog;
import com.kafka.demo.service.BlogService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BlogController {

    private BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping(value = "/blogs", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

}
