package com.bdqn.service.impl;

import com.bdqn.dao.BookInfoMapper;
import com.bdqn.entity.BookInfo;
import com.bdqn.entity.BookInfoExample;
import com.bdqn.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName com.bdqn.service.impl
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/3/27 22:08
 */
@Service("BookInfoService")
public class BookInfoServiceImpl implements BookInfoService {
    @Autowired
    BookInfoMapper bookInfoMapper;
    private BookInfoExample bookInfoExample;
    @Override
    public List<BookInfo> getAllBook() {
        return bookInfoMapper.selectByExample(bookInfoExample);
    }

    @Override
    public int addBook(BookInfo bookInfo) {
        return bookInfoMapper.insert(bookInfo);
    }

    @Override
    public BookInfo selectBookById(Integer id) {
        return bookInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateBook(BookInfo bookInfo) {
        return bookInfoMapper.updateByPrimaryKey(bookInfo);
    }

    @Override
    public int delBook(Integer id) {
        return bookInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<BookInfo> selectBookByName(String info) {
        BookInfoExample.Criteria criteria=bookInfoExample.createCriteria();
        criteria.andBookNameLike("%"+info+"%");
        return bookInfoMapper.selectByExample(bookInfoExample);
    }
}
