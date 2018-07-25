package org.jleopard.mall.dao;

import org.apache.ibatis.annotations.Mapper;
import org.jleopard.mall.model.User;

import java.util.List;

@Mapper
public interface UserMapper {


    int deleteByPrimaryKey(String id);

    int deleteBySelective(User record);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    List<User> selectBySelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}