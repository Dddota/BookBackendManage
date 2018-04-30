package com.bdqn.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class BookInfo implements Serializable {
    /**
    * 图书ID
    **/
    private Integer bookId;

    /**
    * 图书编号
    **/
    @NotEmpty(message = "编号不能为空")
    private String bookCode;

    /**
    * 图书名称
    **/
    @NotEmpty(message = "名称不能为空")
    private String bookName;

    /**
    * 图书类型
    **/
    private Integer bookType;

    /**
    * 图书作者
    **/
    @NotEmpty(message = "作者不能为空")
    private String bookAuthor;

    /**
    * 出版社
    **/
    @NotEmpty(message = "出版社不能为空")
    private String publishPress;

    /**
    * 出版日期
    **/
    @JSONField(format ="yyyy年MM月dd日 HH:mm:ss")
    private java.sql.Date publishDate;

    /**
    * 是否借阅
    **/
    private Integer borrowed;

    /**
    * 创建人
    **/
    @NotEmpty(message = "创建人不能为空")
    private String createdBy;

    /**
    * 创建时间
    **/
    @JSONField(format ="yyyy年MM月dd日 HH:mm:ss")
    private java.sql.Date creationTime;

    /**
    * 最新更新时间
    **/
    @JSONField(format ="yyyy年MM月dd日 HH:mm:ss")
    private Timestamp lastUpdatetime;

    private static final long serialVersionUID = 1L;

    public Integer getBookId() {
        return bookId;
    }

    public BookInfo withBookId(Integer bookId) {
        this.setBookId(bookId);
        return this;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookCode() {
        return bookCode;
    }

    public BookInfo withBookCode(String bookCode) {
        this.setBookCode(bookCode);
        return this;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode == null ? null : bookCode.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public BookInfo withBookName(String bookName) {
        this.setBookName(bookName);
        return this;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public Integer getBookType() {
        return bookType;
    }

    public BookInfo withBookType(Integer bookType) {
        this.setBookType(bookType);
        return this;
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public BookInfo withBookAuthor(String bookAuthor) {
        this.setBookAuthor(bookAuthor);
        return this;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public String getPublishPress() {
        return publishPress;
    }

    public BookInfo withPublishPress(String publishPress) {
        this.setPublishPress(publishPress);
        return this;
    }

    public void setPublishPress(String publishPress) {
        this.publishPress = publishPress == null ? null : publishPress.trim();
    }

    public java.sql.Date getPublishDate() {
        return publishDate;
    }

    public BookInfo withPublishDate(java.sql.Date publishDate) {
        this.setPublishDate(publishDate);
        return this;
    }

    public void setPublishDate(java.sql.Date publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getBorrowed() {
        return borrowed;
    }

    public BookInfo withBorrowed(Integer borrowed) {
        this.setBorrowed(borrowed);
        return this;
    }

    public void setBorrowed(Integer borrowed) {
        this.borrowed = borrowed;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public BookInfo withCreatedBy(String createdBy) {
        this.setCreatedBy(createdBy);
        return this;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public java.sql.Date getCreationTime() {
        return creationTime;
    }

    public BookInfo withCreationTime(java.sql.Date creationTime) {
        this.setCreationTime(creationTime);
        return this;
    }

    public void setCreationTime(java.sql.Date creationTime) {
        this.creationTime = creationTime;
    }

    public Timestamp getLastUpdatetime() {
        return lastUpdatetime;
    }

    public BookInfo withLastUpdatetime(Timestamp lastUpdatetime) {
        this.setLastUpdatetime(lastUpdatetime);
        return this;
    }

    public void setLastUpdatetime(Timestamp lastUpdatetime) {
        this.lastUpdatetime = lastUpdatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookId=").append(bookId);
        sb.append(", bookCode=").append(bookCode);
        sb.append(", bookName=").append(bookName);
        sb.append(", bookType=").append(bookType);
        sb.append(", bookAuthor=").append(bookAuthor);
        sb.append(", publishPress=").append(publishPress);
        sb.append(", publishDate=").append(publishDate);
        sb.append(", borrowed=").append(borrowed);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", lastUpdatetime=").append(lastUpdatetime);
        sb.append("]");
        return sb.toString();
    }

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
        BookInfo other = (BookInfo) that;
        return (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getBookCode() == null ? other.getBookCode() == null : this.getBookCode().equals(other.getBookCode()))
            && (this.getBookName() == null ? other.getBookName() == null : this.getBookName().equals(other.getBookName()))
            && (this.getBookType() == null ? other.getBookType() == null : this.getBookType().equals(other.getBookType()))
            && (this.getBookAuthor() == null ? other.getBookAuthor() == null : this.getBookAuthor().equals(other.getBookAuthor()))
            && (this.getPublishPress() == null ? other.getPublishPress() == null : this.getPublishPress().equals(other.getPublishPress()))
            && (this.getPublishDate() == null ? other.getPublishDate() == null : this.getPublishDate().equals(other.getPublishDate()))
            && (this.getBorrowed() == null ? other.getBorrowed() == null : this.getBorrowed().equals(other.getBorrowed()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationTime() == null ? other.getCreationTime() == null : this.getCreationTime().equals(other.getCreationTime()))
            && (this.getLastUpdatetime() == null ? other.getLastUpdatetime() == null : this.getLastUpdatetime().equals(other.getLastUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getBookCode() == null) ? 0 : getBookCode().hashCode());
        result = prime * result + ((getBookName() == null) ? 0 : getBookName().hashCode());
        result = prime * result + ((getBookType() == null) ? 0 : getBookType().hashCode());
        result = prime * result + ((getBookAuthor() == null) ? 0 : getBookAuthor().hashCode());
        result = prime * result + ((getPublishPress() == null) ? 0 : getPublishPress().hashCode());
        result = prime * result + ((getPublishDate() == null) ? 0 : getPublishDate().hashCode());
        result = prime * result + ((getBorrowed() == null) ? 0 : getBorrowed().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        result = prime * result + ((getLastUpdatetime() == null) ? 0 : getLastUpdatetime().hashCode());
        return result;
    }
}