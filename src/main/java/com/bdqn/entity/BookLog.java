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
public class BookLog implements Serializable {
    /**
     *
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    private Integer id;

    /**
     *   书籍ID
     *
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    private Integer bookid;

    /**
     *   借书人ID
     *
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    private Integer userid;

    /**
     *   类型，1借出，0归还
     *
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    private Integer type;

    /**
     *   发生时间
     *
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    private Date creationTime;

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column book_log.id
     *
     * @return the value of book_log.id
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public BookLog withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column book_log.id
     *
     * @param id the value for book_log.id
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column book_log.bookid
     *
     * @return the value of book_log.bookid
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public Integer getBookid() {
        return bookid;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public BookLog withBookid(Integer bookid) {
        this.setBookid(bookid);
        return this;
    }

    /**
     * This method sets the value of the database column book_log.bookid
     *
     * @param bookid the value for book_log.bookid
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    /**
     * This method returns the value of the database column book_log.userid
     *
     * @return the value of book_log.userid
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public BookLog withUserid(Integer userid) {
        this.setUserid(userid);
        return this;
    }

    /**
     * This method sets the value of the database column book_log.userid
     *
     * @param userid the value for book_log.userid
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method returns the value of the database column book_log.type
     *
     * @return the value of book_log.type
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public BookLog withType(Integer type) {
        this.setType(type);
        return this;
    }

    /**
     * This method sets the value of the database column book_log.type
     *
     * @param type the value for book_log.type
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column book_log.creationTime
     *
     * @return the value of book_log.creationTime
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public BookLog withCreationTime(Date creationTime) {
        this.setCreationTime(creationTime);
        return this;
    }

    /**
     * This method sets the value of the database column book_log.creationTime
     *
     * @param creationTime the value for book_log.creationTime
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookid=").append(bookid);
        sb.append(", userid=").append(userid);
        sb.append(", type=").append(type);
        sb.append(", creationTime=").append(creationTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
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
        BookLog other = (BookLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookid() == null ? other.getBookid() == null : this.getBookid().equals(other.getBookid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreationTime() == null ? other.getCreationTime() == null : this.getCreationTime().equals(other.getCreationTime()));
    }

    /**
     *
     * @mbg.generated Fri May 18 20:08:54 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookid() == null) ? 0 : getBookid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return result;
    }
}