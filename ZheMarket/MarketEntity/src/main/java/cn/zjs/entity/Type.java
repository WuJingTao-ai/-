package cn.zjs.entity;

import java.util.Date;

/**
 * Created by AintccOut on 2019/11/10.
 */
public class Type {
    private  int   id;
    private  String  typeName;
    private  Date  typeDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Date getTypeDate() {
        return typeDate;
    }

    public void setTypeDate(Date typeDate) {
        this.typeDate = typeDate;
    }
}
