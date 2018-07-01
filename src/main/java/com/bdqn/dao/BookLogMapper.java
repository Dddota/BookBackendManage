package com.bdqn.dao;

import com.bdqn.entity.BookLog;
import com.bdqn.entity.BookLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookLogMapper {
    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    long countByExample(BookLogExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    int deleteByExample(BookLogExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    int insert(BookLog record);

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    int insertSelective(BookLog record);

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    List<BookLog> selectByExample(BookLogExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    BookLog selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") BookLog record, @Param("example") BookLogExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    int updateByExample(@Param("record") BookLog record, @Param("example") BookLogExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    int updateByPrimaryKeySelective(BookLog record);

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    int updateByPrimaryKey(BookLog record);
}