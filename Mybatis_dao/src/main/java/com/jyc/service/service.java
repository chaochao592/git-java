package com.jyc.service;

import com.jyc.dao.UserMapper;
import com.jyc.dao.impl.UserMapperImpl;
import com.jyc.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class service {
    public static void main(String[] args) throws IOException {
       /* UserMapper mapper = new UserMapperImpl();
        List<User> list = mapper.findAll();
        for (User user : list) {
            System.out.println(user);
        }*/

        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSession session = new SqlSessionFactoryBuilder().build(stream).openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.findAll();
        for (User user : userList) {
            System.out.println(user);
        }

    }
}
