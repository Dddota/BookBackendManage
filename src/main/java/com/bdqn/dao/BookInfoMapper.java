package com.bdqn.dao;

import com.bdqn.entity.BookInfo;
import com.bdqn.entity.BookInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookInfoMapper {
    long countByExample(BookInfoExample example);

    int deleteByExample(BookInfoExample example);

    int deleteByPrimaryKey(Integer bookId);

    int insert(BookInfo record);

    int insertSelective(BookInfo record);

    List<BookInfo> selectByExample(BookInfoExample example);

    BookInfo selectByPrimaryKey(Integer bookId);

    int updateByExampleSelective(@Param("record") BookInfo record, @Param("example") BookInfoExample example);

    int updateByExample(@Param("record") BookInfo record, @Param("example") BookInfoExample example);

    int updateByPrimaryKeySelective(BookInfo record);

    int updateByPrimaryKey(BookInfo record);

    List<BookInfo>selectByName(@Param("name")String name);
}