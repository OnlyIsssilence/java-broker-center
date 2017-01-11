package com.tops001.domain.common;

import org.joda.time.DateTime;
import org.joda.time.Days;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 * Author:zhangmingqiang on 2016/8/13.
 * Date  :2016/8/13.
 * Description:
 */
public class ResultUtils {

    public static Integer calBetweenDateLength(Date date){

        if (date==null){
            return null;
        }else{
            Date nowDate=new Date();
            DateTime dt1 = new DateTime(nowDate);
            DateTime dt2 = new DateTime(date);
            int timeDis = Days.daysBetween(dt2,dt1).getDays()/365;

            return Integer.valueOf(timeDis);
        }
    }

    public static Date addDay(int year) {
        Date dt = new Date();
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.YEAR,year);//日期减1年
        return rightNow.getTime();
    }
}
























