package cn.zjs.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by AintccOut on 2019/11/12.
 */
public class Leave {
    //id
    private   int   id;
   //请假天数
    private   int   days;
    //申请简介
    private   String   content;
    //请假原因   1因公  2因私
    private   int   reason;
    //开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datetime;
    //结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endtime;
    //状态码
    private  int  state;
    //请假人
    private String username;

    public Leave() {
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReason() {
        return reason;
    }

    public void setReason(int reason) {
        this.reason = reason;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
