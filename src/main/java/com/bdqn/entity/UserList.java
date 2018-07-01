package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class UserList implements Serializable {
    /**
     *
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    private Integer id;

    /**
     *   用户ID
     *
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    private Integer userid;

    /**
     *   状态，0离馆，1在馆
     *
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    private Integer state;

    /**
     *   登录时间
     *
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    private Date loginTime;

    /**
     *   登出时间
     *
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    private Date logoutTime;

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column user_list.id
     *
     * @return the value of user_list.id
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public UserList withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column user_list.id
     *
     * @param id the value for user_list.id
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column user_list.userid
     *
     * @return the value of user_list.userid
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public UserList withUserid(Integer userid) {
        this.setUserid(userid);
        return this;
    }

    /**
     * This method sets the value of the database column user_list.userid
     *
     * @param userid the value for user_list.userid
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method returns the value of the database column user_list.state
     *
     * @return the value of user_list.state
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public Integer getState() {
        return state;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public UserList withState(Integer state) {
        this.setState(state);
        return this;
    }

    /**
     * This method sets the value of the database column user_list.state
     *
     * @param state the value for user_list.state
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method returns the value of the database column user_list.loginTime
     *
     * @return the value of user_list.loginTime
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public UserList withLoginTime(Date loginTime) {
        this.setLoginTime(loginTime);
        return this;
    }

    /**
     * This method sets the value of the database column user_list.loginTime
     *
     * @param loginTime the value for user_list.loginTime
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * This method returns the value of the database column user_list.logoutTime
     *
     * @return the value of user_list.logoutTime
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public Date getLogoutTime() {
        return logoutTime;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public UserList withLogoutTime(Date logoutTime) {
        this.setLogoutTime(logoutTime);
        return this;
    }

    /**
     * This method sets the value of the database column user_list.logoutTime
     *
     * @param logoutTime the value for user_list.logoutTime
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", state=").append(state);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", logoutTime=").append(logoutTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserList other = (UserList) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getLoginTime() == null ? other.getLoginTime() == null : this.getLoginTime().equals(other.getLoginTime()))
            && (this.getLogoutTime() == null ? other.getLogoutTime() == null : this.getLogoutTime().equals(other.getLogoutTime()));
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:20 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getLoginTime() == null) ? 0 : getLoginTime().hashCode());
        result = prime * result + ((getLogoutTime() == null) ? 0 : getLogoutTime().hashCode());
        return result;
    }
}