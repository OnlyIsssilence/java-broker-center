package com.tops001.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 * Created by Administrator on 2016/7/26.
 */
public class DateUtil {

    /**
     * 根据返回来的生日或者起始的工作日期计算年龄和工作年限
     * @param date
     * @return
     */
    public static Integer getYears(Date date){
        Date nowDate=new Date();
        int day= (int) ((nowDate.getTime()-date.getTime())/(24*60*60*1000) + 1);
        return Integer.valueOf(day);
    }

    /***
     * 将d转换成中国日期格式,如2016-1-22转成2016年1月22日
     *
     * @param d
     * @return
     */
    public static String getChineseDateStr(Date d) {
        Objects.requireNonNull(d);
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        return format.format(d);
    }

    public static Date addDay(Date d, int dayNum) {
        Objects.requireNonNull(d);
        Calendar cld = Calendar.getInstance();
        cld.setTime(d);
        cld.add(Calendar.DATE, dayNum);
        return cld.getTime();
    }

    /***
     * 将日期字符串转换为java.util.Date类型
     *
     * @param dateStr
     * @param formatStr
     * @return
     * @throws ParseException
     */
    public static Date dateStrParse(String dateStr, String formatStr) throws ParseException {
        DateFormat format = new SimpleDateFormat(formatStr);
        return format.parse(dateStr);
    }

    public static Date commonDateStrParse(String dateStr) throws ParseException {
        return dateStrParse(dateStr, "yyyy-MM-dd HH:mm:ss");
    }

    public static String convertDateToStr(Date d, String formatStr) {
        Objects.requireNonNull(d);
        Objects.requireNonNull(formatStr);
        DateFormat format = new SimpleDateFormat(formatStr);
        return format.format(d);
    }

    public static String commonConvertDateToStr(Date d) {
        return convertDateToStr(d, "yyyy-MM-dd HH:mm:ss");
    }

    /***
     * 如果将Date字段返回给客户端，必须对Date字段进行转换，如果在vo对象的get方法中完成转换， 一旦这个转换出现异常，目前的cxf框架会将返回的json串和exceptionHandler中生成的json串
     * 拼接起来一起返回客户端，导致客户端解析出错，因此，如果在vo的get方法中完成转换，建议使用本方法
     *
     * @param d
     * @return
     */
    public static String commonConvertDateToStrSafe(Date d) {
        if (d == null) return null;
        try {
            return commonConvertDateToStr(d);
        } catch (Exception e) {
            return null;
        }
    }

    public static String convertDateToStrSafe(Date d, String format) {
        if (d == null) return null;
        try {
            return convertDateToStr(d, format);
        } catch (Exception e) {
            return null;
        }
    }

    public static Date clearTimeInfo(Date d) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }

    public static boolean isLegalDateStr(String dateString, String format) {
        Objects.requireNonNull(dateString);
        Objects.requireNonNull(format);
        try {
            Date d = dateStrParse(dateString, format);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
