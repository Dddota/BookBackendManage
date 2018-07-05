package com.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.entity.BookInfo;
import com.bdqn.entity.BookType;
import com.bdqn.service.BookInfoService;
import com.bdqn.service.BookTypeService;
import lombok.extern.java.Log;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName com.bdqn.controller
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/3/27 21:45
 */
/**
 * 增
 * 查
 * 改
 * 删？
 * */
@Log
@Controller
public class BookController {
    @Autowired
    BookInfoService bookInfoService;
    @Autowired
    BookTypeService bookTypeService;
    @InitBinder
    public void initBinder(WebDataBinder bin){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        sdf.setLenient(false);
        CustomDateEditor cust = new CustomDateEditor(sdf,true);
        bin.registerCustomEditor(Timestamp.class,cust);
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String showAllBook(Model model,HttpSession httpSession){
        List<BookInfo> bookInfoList=bookInfoService.getAllBook();
        List<BookType> bookTypeList = bookTypeService.getAllBookType();
        httpSession.setAttribute("bookTypeList", bookTypeList);
        model.addAttribute("bookinfo",bookInfoList);
        //model.addAttribute("bookTypelist", bookTypeList);
        return "/JSP/all";
    }

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ResponseBody
    public Object searchByName(@Param("name")String name){
        log.info("搜索名字:"+name);
        log.info("搜索结果"+bookInfoService.selectBookByName(name));
        return bookInfoService.selectBookByName(name);
    }

    @RequestMapping(value = "/check/{id}", method = RequestMethod.GET)
    public String checkBook(@PathVariable Integer id,Model model){
        model.addAttribute("book",bookInfoService.selectBookById(id));
        log.info(bookInfoService.selectBookById(id).toString());
        return "/JSP/check";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String preAdd(@ModelAttribute("bookInfo") BookInfo bookInfo){
        log.info("预增加");
        return "/JSP/add";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addBook(@Valid @ModelAttribute("bookInfo")BookInfo bookInfo, BindingResult bindingResult){
        //bookInfo.setLastUpdatetime(bookInfo.getCreationTime());
        if (bindingResult.hasErrors()){
            log.info("增加，出现错误"+bindingResult.toString());
            return "/JSP/add";
        }
        bookInfoService.addBook(bookInfo);
        log.info("增加，增加对象"+bookInfo.toString());
        return "redirect:/all";
    }
    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String preUpdate(@PathVariable Integer id,Model model){
        log.info("预更新"+id);
        model.addAttribute("book",bookInfoService.selectBookById(id));
        return "/JSP/update";
    }
    @RequestMapping(value ="/doupdate",method = RequestMethod.POST)
    public String updateBook(@Valid @ModelAttribute("bookInfo") BookInfo bookInfo,BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            log.info("修改失败"+bookInfo.getBookId());
            log.info("错误原因"+bindingResult.toString());
            return "forward:/update/"+bookInfo.getBookId();
        }
        bookInfoService.updateBook(bookInfo);
        log.info("修改");
        return "redirect:/all";
    }
    @RequestMapping(value = "/del/{id}",method = RequestMethod.GET)
    public String delBook(@PathVariable Integer id,Model model){
        int row=bookInfoService.delBook(id);
        if (row==0){
            log.info("删除:失败"+id);
        }else
        {log.info("删除:成功"+id);
        }
        return "redirect:/all";
    }
    @RequestMapping(value = "/getType",method = RequestMethod.POST)
    @ResponseBody
    public Object getBookType(){
        return bookTypeService.getAllBookType();
    }

    @RequestMapping(value = "/addTest",method = RequestMethod.POST)
    @ResponseBody
    public Object addCheck(){
        HashMap<String,String> hashMap=new HashMap<String, String>();

        return JSON.toJSON(hashMap);
    }
}
