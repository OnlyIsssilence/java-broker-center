package com.tops001.common;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/26.
 */
public class SignUtil {
    public static String sign1(String url, Map<String, Object> paramMap, Date time) throws IOException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        paramMap.put("appcode", "test");
        paramMap.put("agent", "java");
        paramMap.put("time", sf.format(time));
        ArrayList<BasicNameValuePair> params = new ArrayList<>();
        paramMap.forEach((key, val)->{
            params.add(new BasicNameValuePair(key, "" + val));
        });

        ArrayList<BasicNameValuePair> temp = new ArrayList<>(params.size());
        params.forEach((item) -> {
            temp.add(new BasicNameValuePair(item.getName().toLowerCase(), item.getValue()));
        });
        temp.sort((a, b) -> {
            return a.getName().compareTo(b.getName());
        });
        String appName = url.substring(url.lastIndexOf("/") + 1).toLowerCase();
        String queryStr = EntityUtils.toString(new UrlEncodedFormEntity(temp));
        String appKey = "11021d8cfed50c14eeb3cca9aeb654f0";
        String sign = appName + queryStr + appKey;
        sign = md5(sign);

        return sign;
    }

    public static String md5(String plainText){
        try{
            MessageDigest e = MessageDigest.getInstance("MD5");
            e.update(plainText.getBytes());
            byte[] b = e.digest();
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; ++offset) {
                int i = b[offset];
                if (i < 0) {
                    i += 256;
                }

                if (i < 16) {
                    buf.append("0");
                }

                buf.append(Integer.toHexString(i));
            }
            return buf.toString();
        }catch (NoSuchAlgorithmException var6) {
            var6.printStackTrace();
            return null;
        }
    }
}
