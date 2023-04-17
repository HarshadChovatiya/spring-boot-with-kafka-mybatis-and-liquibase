package com.kafka.demo.model.dto;

import java.util.List;

public class UserBlogPostDTO {

    private Integer id;
    private String firstName;
    private String lastName;
    private List<BlogPostDTO> blogList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<BlogPostDTO> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<BlogPostDTO> blogList) {
        this.blogList = blogList;
    }
}
