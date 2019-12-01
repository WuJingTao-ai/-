package cn.zjs.entity;

/**
 * Created by AintccOut on 2019/11/11.
 */
public class Role {
    private int  id;
    private  String  rolename;
    private  String   pid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
