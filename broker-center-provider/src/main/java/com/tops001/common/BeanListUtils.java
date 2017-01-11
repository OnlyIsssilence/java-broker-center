package com.tops001.common;

import com.tops001.core.utils.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by Administrator on 2016/8/4.
 */
public class BeanListUtils {
    public BeanListUtils() {
    }

    public static <S,T> void copyProperties(List<S> sourceList, List<T> targetList, Class<T> classType) throws BeansException {
        Assert.notNull(sourceList, "Source must not be null");
        Assert.notNull(targetList, "Target must not be null");
        for(S source : sourceList){
            try{
                T target = classType.newInstance();
                BeanUtils.copyProperties(source, target);
                targetList.add(target);
            }catch (Exception e){
                Assert.notNull(classType, "target newInstance Exception");
            }
        }

    }
}
