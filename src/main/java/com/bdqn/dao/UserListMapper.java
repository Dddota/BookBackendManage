package com.bdqn.dao;

import com.bdqn.entity.UserList;
import com.bdqn.entity.UserListExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserListMapper {
    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    long countByExample(UserListExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    int deleteByExample(UserListExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    int insert(UserList record);

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    int insertSelective(UserList record);

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    List<UserList> selectByExample(UserListExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    UserList selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserList record, @Param("example") UserListExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    int updateByExample(@Param("record") UserList record, @Param("example") UserListExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    int updateByPrimaryKeySelective(UserList record);

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    int updateByPrimaryKey(UserList record);
}