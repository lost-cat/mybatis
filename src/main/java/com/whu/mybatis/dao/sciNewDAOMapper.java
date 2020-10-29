package com.whu.mybatis.dao;

import com.whu.mybatis.entity.sciNewDAO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface sciNewDAOMapper {
    int deleteByPrimaryKey(String id);

    int insert(sciNewDAO record);

    int insertSelective(sciNewDAO record);

    sciNewDAO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(sciNewDAO record);

    int updateByPrimaryKey(sciNewDAO record);
}