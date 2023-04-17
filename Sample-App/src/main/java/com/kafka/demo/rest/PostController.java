package com.kafka.demo.rest;

import com.kafka.demo.model.Post;
import com.kafka.demo.model.dto.CreatePostDTO;
import com.kafka.demo.service.PostService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping(value = "/post", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Post createPost(@RequestBody CreatePostDTO createPostDTO) {
        return postService.createPost(createPostDTO);
    }

    @GetMapping(value = "/post", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Post> getAllPost() {
        return postService.getAllPost();
    }

}
