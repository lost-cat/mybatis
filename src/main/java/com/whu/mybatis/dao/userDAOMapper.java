package com.whu.mybatis.dao;

import com.whu.mybatis.entity.userDAO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userDAOMapper {
    int deleteByPrimaryKey(String id);

    int insert(userDAO record);

    int insertSelective(userDAO record);

    userDAO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(userDAO record);

    int updateByPrimaryKey(userDAO record);
}