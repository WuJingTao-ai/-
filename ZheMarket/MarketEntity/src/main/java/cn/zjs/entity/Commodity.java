package cn.zjs.entity;

import java.util.Date;

/**
 * Created by AintccOut on 2019/11/14.
 */
public class Commodity {
    private  int   id;//主键
    private  String  commodityName;//商品名称',
    private  String  typeName;//'类型ID',
    private  String  subtitle;//宣传标题
    private   String   mainimg;//图片
    private  String  subimgs;// '副图片
    private  String    detail;//商品描述',
    private   double  price;//价格
    private   long     stock;//库存
    private   int  status;//状态'
    private Date createtime;//创建时间
    private  Date  updatetime;//'修改时间',

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMainimg() {
        return mainimg;
    }

    public void setMainimg(String mainimg) {
        this.mainimg = mainimg;
    }

    public String getSubimgs() {
        return subimgs;
    }

    public void setSubimgs(String subimgs) {
        this.subimgs = subimgs;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
