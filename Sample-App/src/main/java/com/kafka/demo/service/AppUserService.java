package com.kafka.demo.service;

import com.kafka.demo.dao.AppUserDao;
import com.kafka.demo.model.dto.FilterUserDTO;
import com.kafka.demo.model.dto.UpdateAppUser;
import com.kafka.demo.model.dto.UserBlogPostDTO;
import com.kafka.demo.model.dto.UserBlogsDTO;
import com.kafka.demo.model.AppUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {

    private AppUserDao appUserDao;

    public AppUserService(AppUserDao appUserDao) {
        this.appUserDao = appUserDao;
    }

    public AppUser createAppUser(AppUser appUser) {
        return appUserDao.saveAppUser(appUser);
    }

    public AppUser updateAppUser(Integer id, UpdateAppUser updateAppUser) {
        return appUserDao.updateAppUser(id, updateAppUser);
    }

    public void deleteAppUser(Integer id) {
        appUserDao.deleteAppUser(id);
    }

    public AppUser getAppUser(Integer id) {
        return appUserDao.getAppUser(id);
    }

    public List<AppUser> getAllAppUser() {
        return appUserDao.getAllAppUser();
    }

    public List<UserBlogsDTO> getUsersAndBlogs() {
        return appUserDao.getUsersAndBlogs();
    }

    public List<UserBlogPostDTO> getUserBlogAndPosts() {
        return appUserDao.getUserBlogAndPost();
    }

    public List<AppUser> getFilteredAppUsers(FilterUserDTO filterUserDTO) {
        return appUserDao.getFilteredAppUser(filterUserDTO);
    }
}
