package com.fh.bean;

import lombok.Data;

/**
 * Created by AintccOut on 2019/11/25.
 */
@Data
public class Category {
    
    private   Integer  id;
    private   String   pid;
    private   String name;
    private   String  url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
