package com.bdqn.service;

import com.bdqn.entity.BookType;

import java.util.List;

/**
 * @ClassName com.bdqn.service.impl
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/3/29 15:48
 */

public interface BookTypeService {
    List<BookType> getAllBookType();
    int addBookyType(BookType bookType);
}
