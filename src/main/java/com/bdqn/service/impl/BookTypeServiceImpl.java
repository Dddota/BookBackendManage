package com.bdqn.service.impl;

import com.bdqn.dao.BookTypeMapper;
import com.bdqn.entity.BookType;
import com.bdqn.entity.BookTypeExample;
import com.bdqn.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName com.bdqn.service.impl
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/3/29 15:52
 */
@Service("BookTypeService")
public class BookTypeServiceImpl implements BookTypeService {
    @Autowired
    BookTypeMapper bookTypeMapper;
    BookTypeExample bookTypeExample;
    @Override
    public List<BookType> getAllBookType() {
        return bookTypeMapper.selectByExample(bookTypeExample);
    }
    @Override
    public int addBookyType(BookType bookType) {
        return bookTypeMapper.insert(bookType);
    }
}
