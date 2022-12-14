package com.service.impl;


import com.dao.IUserDao;
import com.domain.User;
import com.service.ILoginService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;


@Service("loginService")
public class LoginServiceImpl implements ILoginService {
//        boolean loginstatue=false;
//        User user=dao.queryUserByName(userName);
//        if(user!=null){
//            loginstatue= passWord.equals(user.getPassword()) ;
//        }
//        return loginstatue;

            @Override
           public boolean login(String userName,String passWord) {

                try {
                    InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
                    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
                    SqlSession sqlSession = sqlSessionFactory.openSession();
                    IUserDao mapper = sqlSession.getMapper(IUserDao.class);
                    User user = mapper.queryUserByName(userName);
                    sqlSession.close();
                    boolean loginstatue=false;
                     if(user!=null){
                             loginstatue= passWord.equals(user.getPassword()) ;
                     }
                     return loginstatue;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return false;
            }

}
