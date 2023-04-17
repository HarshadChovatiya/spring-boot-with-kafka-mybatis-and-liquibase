package com.kafka.demo.rest;

import com.kafka.demo.model.dto.UpdateAppUser;
import com.kafka.demo.model.dto.UserBlogPostDTO;
import com.kafka.demo.model.dto.UserBlogsDTO;
import com.kafka.demo.model.AppUser;
import com.kafka.demo.service.AppUserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AppUserController {

    private AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @PostMapping(value = "/app-user", produces = {MediaType.APPLICATION_JSON_VALUE})
    public AppUser createAppUser(@RequestBody AppUser appUser) {
        return appUserService.createAppUser(appUser);
    }

    @PutMapping(value = "/app-user/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public AppUser updateAppUser(@PathVariable("id") Integer id, @RequestBody UpdateAppUser updateAppUser) {
        return appUserService.updateAppUser(id, updateAppUser);
    }

    @DeleteMapping(value = "/app-user/{id}")
    public String deleteAppUser(@PathVariable("id") Integer id) {
        appUserService.deleteAppUser(id);
        return "User deleted successfully";
    }

    @GetMapping(value = "/app-user/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public AppUser getAppUserById(@PathVariable("id") Integer id) {
        return appUserService.getAppUser(id);
    }

    @GetMapping(value = "/app-users", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<AppUser> getAllAppUsers() {
        return appUserService.getAllAppUser();
    }

    @GetMapping(value = "/user-blog", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<UserBlogsDTO> getUserBlogs() {
        return appUserService.getUsersAndBlogs();
    }

    @GetMapping(value = "/user-blog-post", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<UserBlogPostDTO> getUserBlogAndPost() {
        return appUserService.getUserBlogAndPosts();
    }

}
