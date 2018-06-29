package com.bdqn.converter;

import org.springframework.core.convert.converter.Converter;

import java.sql.Timestamp;

/**
 * @ClassName com.bdqn.util
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/5/6 16:52
 */

public class DateConverter implements Converter<String, Timestamp> {

    @Override
    /**
     * 如果从浏览器传入字符串不等于开始转换
     * 去除前后空格
     * */
    public Timestamp convert(String source) {
        String datetime = "T";
        if(source != null){
            source = source.trim();
            if(source.equals("")){
                source = null;
            }
            /**
             * //datetime-local系列
             * */
            else if (source.contains(datetime)){
                source = source.replace('T',' ');
                source = source + ":00";
                return Timestamp.valueOf(source);
            }
            else {
                //只有date没有time系列
                source = source+"00:00:00";
                return Timestamp.valueOf(source);
            }
        }
        return null;
    }
}
