package com.bdqn.dao;

import com.bdqn.entity.UserInfo;
import com.bdqn.entity.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInfoMapper {
    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    long countByExample(UserInfoExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    int deleteByExample(UserInfoExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    int insert(UserInfo record);

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    int insertSelective(UserInfo record);

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    UserInfo selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    int updateByPrimaryKey(UserInfo record);
}