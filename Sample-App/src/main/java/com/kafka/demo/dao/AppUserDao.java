package com.kafka.demo.dao;

import com.kafka.demo.dto.UpdateAppUser;
import com.kafka.demo.model.AppUser;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


@Component
public class AppUserDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppUserDao.class);

    private SqlSession sqlSession;

    public AppUserDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public AppUser saveAppUser(AppUser appUser) {
        /**
         * // uncomment the below code if xml based configuration is used
         * // as mentioned in mybatis-config.xml
         *
         * Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
         * SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader, "local_env");
         * SqlSession session = sqlSessionFactory.openSession();
         *
         * session.insert("mappers.AppUserMapper.insert_app_user", appUser);
         *
         * session.commit();
         * session.close();
         */

        sqlSession.insert("mappers.AppUserMapper.insert_app_user", appUser);
        LOGGER.info("user created successfully with id as : {}", appUser.getId());
        return appUser;
    }

//    public AppUser updateAppUser(Integer id, UpdateAppUser updateAppUser) {
//        AppUser appUser = new AppUser(id, updateAppUser.getFirstName(), updateAppUser.getLastName());
//        sqlSession.update("mappers.AppUserMapper.update_app_user", appUser);
//        LOGGER.info("user with id : {} update successfully", appUser.getId());

//        return sqlSession.selectOne("mappers.AppUserMapper.get_app_user_by_id", appUser.getId());
//    }

    public void deleteAppUser(Integer id) {
        sqlSession.delete("mappers.AppUserMapper.delete_app_user_by_id", id);
        LOGGER.info("user with id : {} deleted successfully", id);
    }

    public AppUser getAppUser(Integer id) {
        return sqlSession.selectOne("mappers.AppUserMapper.get_app_user_by_id", id);
    }

    public List<AppUser> getAllAppUser() {
        return sqlSession.selectList("mappers.AppUserMapper.get_all_app_user");
    }


}
