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
public class UserInfo implements Serializable {
    /**
     *
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    private Integer id;

    /**
     *   名字
     *
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    private String name;

    /**
     *   电话
     *
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    private String phone;

    /**
     *   账户
     *
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    private Integer account;

    /**
     *   次数
     *
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    private Integer times;

    /**
     *
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    private Date creationTime;

    /**
     *
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    private Date lastUpdateTime;

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column user_info.id
     *
     * @return the value of user_info.id
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public UserInfo withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.id
     *
     * @param id the value for user_info.id
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column user_info.name
     *
     * @return the value of user_info.name
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public UserInfo withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.name
     *
     * @param name the value for user_info.name
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column user_info.phone
     *
     * @return the value of user_info.phone
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public UserInfo withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.phone
     *
     * @param phone the value for user_info.phone
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method returns the value of the database column user_info.account
     *
     * @return the value of user_info.account
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public Integer getAccount() {
        return account;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public UserInfo withAccount(Integer account) {
        this.setAccount(account);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.account
     *
     * @param account the value for user_info.account
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public void setAccount(Integer account) {
        this.account = account;
    }

    /**
     * This method returns the value of the database column user_info.times
     *
     * @return the value of user_info.times
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public Integer getTimes() {
        return times;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public UserInfo withTimes(Integer times) {
        this.setTimes(times);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.times
     *
     * @param times the value for user_info.times
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public void setTimes(Integer times) {
        this.times = times;
    }

    /**
     * This method returns the value of the database column user_info.creationTime
     *
     * @return the value of user_info.creationTime
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public UserInfo withCreationTime(Date creationTime) {
        this.setCreationTime(creationTime);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.creationTime
     *
     * @param creationTime the value for user_info.creationTime
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * This method returns the value of the database column user_info.lastUpdateTime
     *
     * @return the value of user_info.lastUpdateTime
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public UserInfo withLastUpdateTime(Date lastUpdateTime) {
        this.setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * This method sets the value of the database column user_info.lastUpdateTime
     *
     * @param lastUpdateTime the value for user_info.lastUpdateTime
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", account=").append(account);
        sb.append(", times=").append(times);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
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
        UserInfo other = (UserInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getTimes() == null ? other.getTimes() == null : this.getTimes().equals(other.getTimes()))
            && (this.getCreationTime() == null ? other.getCreationTime() == null : this.getCreationTime().equals(other.getCreationTime()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()));
    }

    /**
     *
     * @mbg.generated Fri May 18 20:09:17 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getTimes() == null) ? 0 : getTimes().hashCode());
        result = prime * result + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return result;
    }
}