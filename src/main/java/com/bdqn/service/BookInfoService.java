package com.bdqn.service;

import com.bdqn.entity.BookInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName com.bdqn.service
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/3/27 21:59
 */

public interface BookInfoService {
    List<BookInfo> getAllBook();
    int addBook(@Param("book")BookInfo bookInfo);
    BookInfo selectBookById(@Param("Id") Integer id);
    int updateBook(@Param("book")BookInfo bookInfo);
    int delBook(@Param("Id") Integer id);
    List<BookInfo> selectBookByName(@Param("info")String info);
}
