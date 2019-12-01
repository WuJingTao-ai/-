package cn.zjs.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by AintccOut on 2019/10/27.
 */
public class Shop {

    private   String   id;//用户id  身份证
    private   String   userName;//用户名称
    private   String   userPassword;//登陆密码
    private   String   usershop;//用户店铺名称
    private   int      userage;//年龄
    private   int      usersex;//性别
    private   String   userRegion;//用户店铺所在位置
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private   Date  logindate;//用户登陆时间
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private   Date   userDate;//用户注册时间
    private  String  imgFlie;//图片名称
    private String  imgRoute;//图片路径

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUsershop() {
        return usershop;
    }

    public void setUsershop(String usershop) {
        this.usershop = usershop;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    public int getUsersex() {
        return usersex;
    }

    public void setUsersex(int usersex) {
        this.usersex = usersex;
    }

    public String getUserRegion() {
        return userRegion;
    }

    public void setUserRegion(String userRegion) {
        this.userRegion = userRegion;
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    public String getImgFlie() {
        return imgFlie;
    }

    public void setImgFlie(String imgFlie) {
        this.imgFlie = imgFlie;
    }

    public String getImgRoute() {
        return imgRoute;
    }

    public void setImgRoute(String imgRoute) {
        this.imgRoute = imgRoute;
    }
}
