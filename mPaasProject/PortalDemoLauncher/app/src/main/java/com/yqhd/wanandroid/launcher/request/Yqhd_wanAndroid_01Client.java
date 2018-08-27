// Generated by HybirdPB CodeGenerator(1.2.0). DO NOT EDIT!
// Generation date is 2018-08-08 15:54:41

package com.yqhd.wanandroid.launcher.request;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

import com.yqhd.wanandroid.launcher.request.req.ArticleListPageJsonGetReq;
import com.yqhd.wanandroid.launcher.request.req.UserLoginPostReq;
import com.yqhd.wanandroid.launcher.request.req.UserRegisterPostReq;

public interface Yqhd_wanAndroid_01Client {

    @SignCheck
    @OperationType("com.yqhd.wanAndroid.login")
    public String userLoginPost (UserLoginPostReq requestParam);


    @SignCheck
    @OperationType("com.yqhd.wanAndroid.register")
    public String userRegisterPost (UserRegisterPostReq requestParam);

    @SignCheck
    @OperationType("com.yqhd.wanAndroid.getBanner")
    public String bannerJsonGet ();


    @SignCheck
    @OperationType("com.yqhd.wanAndroid.feedList")
    public String articleListPageJsonGet (ArticleListPageJsonGetReq requestParam);
}