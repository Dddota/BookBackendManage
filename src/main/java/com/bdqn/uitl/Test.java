package com.bdqn.uitl;

import com.bdqn.dao.BookInfoMapper;
import com.bdqn.dao.BookTypeMapper;
import com.bdqn.entity.BookInfo;
import com.bdqn.entity.BookInfoExample;
import com.bdqn.entity.BookType;
import com.bdqn.entity.BookTypeExample;
import com.bdqn.service.BookInfoService;
import com.bdqn.service.BookTypeService;
import lombok.extern.java.Log;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName com.bdqn.controller
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/3/18 15:55
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
@Log
public class Test {
    @Autowired
    BookTypeMapper bookTypeMapper;
    @Autowired
    BookTypeService bookTypeService;
    @Autowired
    BookInfoService bookInfoService;
    @org.junit.Test
    public void test(){
        List<BookType> bookTypeList=bookTypeService.getAllBookType();
        System.out.println(bookTypeList.get(1));
        List<BookInfo>bookInfoList=bookInfoService.getAllBook();
        System.out.println(bookInfoList.toString());
    }
    @org.junit.Test
    public void jingtaiTest(){
        BookTypeExample bookTypeExample=new BookTypeExample();
        List<BookType> bookTypeList=bookTypeMapper.selectByExample(bookTypeExample);
        BookType bookType=bookTypeList.get(0);
        System.out.println(bookType.getId());
    }


}
