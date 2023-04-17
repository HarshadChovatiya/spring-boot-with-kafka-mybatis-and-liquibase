package com.kafka.demo.rest;

import com.kafka.demo.model.dto.CreateBlogDTO;
import com.kafka.demo.model.Blog;
import com.kafka.demo.service.BlogService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/blog", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Blog createBlog(@RequestBody CreateBlogDTO createBlogDTO) {
        return blogService.createBlog(createBlogDTO);
    }

}
