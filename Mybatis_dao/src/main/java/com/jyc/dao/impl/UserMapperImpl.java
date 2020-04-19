package com.jyc.dao.impl;

import com.jyc.dao.UserMapper;
import com.jyc.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperImpl implements UserMapper {
    @Override
    public List<User> findAll() throws IOException {

      /*  InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSession session = builder.build(stream).openSession();
        List<User> list = session.selectList("UserMapper.findAll");
        return list;*/
      return null;
    }
}
