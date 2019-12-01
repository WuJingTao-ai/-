package cn.zjs.entity;

import java.util.Date;

/**
 * Created by AintccOut on 2019/11/11.
 */
public class User {
    private int id;
    private String userName;//账号
    private String userPasswrod;//密码
    private int age;//年龄
    private int sex;//性别
    private int cellphone;//电话号码
    private String fliename;//图片名称
    private String fliepath;//图片路径
    private Date longdate;//登陆时间
    private Date register;//注册时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPasswrod() {
        return userPasswrod;
    }

    public void setUserPasswrod(String userPasswrod) {
        this.userPasswrod = userPasswrod;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    public String getFliename() {
        return fliename;
    }

    public void setFliename(String fliename) {
        this.fliename = fliename;
    }

    public String getFliepath() {
        return fliepath;
    }

    public void setFliepath(String fliepath) {
        this.fliepath = fliepath;
    }

    public Date getLongdate() {
        return longdate;
    }

    public void setLongdate(Date longdate) {
        this.longdate = longdate;
    }

    public Date getRegister() {
        return register;
    }

    public void setRegister(Date register) {
        this.register = register;
    }
}