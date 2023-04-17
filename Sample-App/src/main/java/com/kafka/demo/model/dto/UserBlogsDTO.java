package com.kafka.demo.model.dto;

import java.util.List;

public class UserBlogsDTO {

    private Integer id;
    private String firstName;
    private String lastName;
    private List<BlogIdTitle> blogIdTitles;

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

    public List<BlogIdTitle> getBlogIdTitles() {
        return blogIdTitles;
    }

    public void setBlogIdTitles(List<BlogIdTitle> blogIdTitles) {
        this.blogIdTitles = blogIdTitles;
    }
}
