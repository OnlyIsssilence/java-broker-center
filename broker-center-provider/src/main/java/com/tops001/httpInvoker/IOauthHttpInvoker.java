package com.tops001.httpInvoker;

import com.tops001.core.component.http.annotation.HttpFormPost;
import com.tops001.core.component.http.annotation.HttpInvoke;
import com.tops001.core.component.http.annotation.QueryParam;
import com.tops001.httpInvoker.entity.OAuthResultEntity;

/**
 * Created by Administrator on 2016/7/26.
 */
@HttpInvoke(url = "/")
public interface IOauthHttpInvoker {
    /**
     * 根据UserID,获取用户信息
     * @param userId 用户ID
     * @return
     */
    @HttpInvoke(url = "User/GetUserByUserId", method = "GET")
    @HttpFormPost
    OAuthResultEntity getUserByUserId(@QueryParam(value = "UserId") int userId);

    /**
     * 使用访问令牌获取用户信息
     *
     * @param accessToken ak
     * @return
     */
    @HttpInvoke(url = "Authorization/GetUser", method = "GET")
    OAuthResultEntity getUser(@QueryParam(value = "accessToken") String accessToken);
}
