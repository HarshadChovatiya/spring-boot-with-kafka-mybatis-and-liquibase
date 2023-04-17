package com.kafka.demo.model.dto;

import java.util.List;

public class BlogPostDTO {

    private Integer blogId;
    private String title;
    private List<PostInfoDTO> postList;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<PostInfoDTO> getPostList() {
        return postList;
    }

    public void setPostList(List<PostInfoDTO> postList) {
        this.postList = postList;
    }
}
