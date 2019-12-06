package cn.nankai.tjxf1.entity;

import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

@Excel("表B1乘用车外部烧损信息")
public class B1OuterInfo {

    @ExcelField(value = "车辆编码")
    private Integer carId;

    @ExcelField(value = "事故编码")
    private Integer accId;

    @ExcelField(value = "车辆识别代码")
    private String vin;

    @ExcelField(value = "轮胎左前")
    private String ltZq;

    @ExcelField(value = "轮胎右前")
    private String ltYq;

    @ExcelField(value = "轮胎左后")
    private String ltZh;

    @ExcelField(value = "轮胎右后")
    private String ltYh;

    @ExcelField(value = "轮辋左前")
    private String lwZq;

    @ExcelField(value = "轮辋右前")
    private String lwYq;

    @ExcelField(value = "轮辋左后")
    private String lwZh;

    @ExcelField(value = "轮辋右后")
    private String lwYh;

    @ExcelField(value = "车门左前")
    private String cmZq;

    @ExcelField(value = "车门右前")
    private String cmYq;

    @ExcelField(value = "车门左后")
    private String cmZh;

    @ExcelField(value = "车门右后")
    private String cmYh;

    @ExcelField(value = "车窗左前")
    private String ccZq;

    @ExcelField(value = "车窗右前")
    private String ccYq;

    @ExcelField(value = "车窗左后")
    private String ccZh;

    @ExcelField(value = "车窗右后")
    private String ccYh;

    @ExcelField(value = "翼子板左前")
    private String yzbZq;

    @ExcelField(value = "翼子板右前")
    private String yzbYq;

    @ExcelField(value = "翼子板左后")
    private String yzbZh;

    @ExcelField(value = "翼子板右后")
    private String yzbYh;

    @ExcelField(value = "车灯左前")
    private String cdZq;

    @ExcelField(value = "车灯右前")
    private String cdYq;

    @ExcelField(value = "车灯左后")
    private String cdZh;

    @ExcelField(value = "车灯右后")
    private String cdYh;

    @ExcelField(value = "后视镜左前")
    private String hsjZq;

    @ExcelField(value = "后视镜右前")
    private String hsjYq;

    @ExcelField(value = "保险杠前部")
    private String bxgQb;

    @ExcelField(value = "保险杠后部")
    private String bxgHb;

    @ExcelField(value = "风挡玻璃前部")
    private String fdboQb;

    @ExcelField(value = "风挡玻璃后部")
    private String fdblHb;

    @ExcelField(value = "雨刮器前部")
    private String ygqQb;

    @ExcelField(value = "雨刮器后部")
    private String ygqHb;

    @ExcelField(value = "发动机舱盖")
    private String fdjcg;

    @ExcelField(value = "顶盖")
    private String dg;

    @ExcelField(value = "天窗")
    private String tc;

    @ExcelField(value = "后备箱盖")
    private String hbxg;

    @ExcelField(value = "底盘")
    private String dp;

    @ExcelField(value = "排气管")
    private String pqg;

    @ExcelField(value = "催化转换器")
    private String chzhq;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getLtZq() {
        return ltZq;
    }

    public void setLtZq(String ltZq) {
        this.ltZq = ltZq == null ? null : ltZq.trim();
    }

    public String getLtYq() {
        return ltYq;
    }

    public void setLtYq(String ltYq) {
        this.ltYq = ltYq == null ? null : ltYq.trim();
    }

    public String getLtZh() {
        return ltZh;
    }

    public void setLtZh(String ltZh) {
        this.ltZh = ltZh == null ? null : ltZh.trim();
    }

    public String getLtYh() {
        return ltYh;
    }

    public void setLtYh(String ltYh) {
        this.ltYh = ltYh == null ? null : ltYh.trim();
    }

    public String getLwZq() {
        return lwZq;
    }

    public void setLwZq(String lwZq) {
        this.lwZq = lwZq == null ? null : lwZq.trim();
    }

    public String getLwYq() {
        return lwYq;
    }

    public void setLwYq(String lwYq) {
        this.lwYq = lwYq == null ? null : lwYq.trim();
    }

    public String getLwZh() {
        return lwZh;
    }

    public void setLwZh(String lwZh) {
        this.lwZh = lwZh == null ? null : lwZh.trim();
    }

    public String getLwYh() {
        return lwYh;
    }

    public void setLwYh(String lwYh) {
        this.lwYh = lwYh == null ? null : lwYh.trim();
    }

    public String getCmZq() {
        return cmZq;
    }

    public void setCmZq(String cmZq) {
        this.cmZq = cmZq == null ? null : cmZq.trim();
    }

    public String getCmYq() {
        return cmYq;
    }

    public void setCmYq(String cmYq) {
        this.cmYq = cmYq == null ? null : cmYq.trim();
    }

    public String getCmZh() {
        return cmZh;
    }

    public void setCmZh(String cmZh) {
        this.cmZh = cmZh == null ? null : cmZh.trim();
    }

    public String getCmYh() {
        return cmYh;
    }

    public void setCmYh(String cmYh) {
        this.cmYh = cmYh == null ? null : cmYh.trim();
    }

    public String getCcZq() {
        return ccZq;
    }

    public void setCcZq(String ccZq) {
        this.ccZq = ccZq == null ? null : ccZq.trim();
    }

    public String getCcYq() {
        return ccYq;
    }

    public void setCcYq(String ccYq) {
        this.ccYq = ccYq == null ? null : ccYq.trim();
    }

    public String getCcZh() {
        return ccZh;
    }

    public void setCcZh(String ccZh) {
        this.ccZh = ccZh == null ? null : ccZh.trim();
    }

    public String getCcYh() {
        return ccYh;
    }

    public void setCcYh(String ccYh) {
        this.ccYh = ccYh == null ? null : ccYh.trim();
    }

    public String getYzbZq() {
        return yzbZq;
    }

    public void setYzbZq(String yzbZq) {
        this.yzbZq = yzbZq == null ? null : yzbZq.trim();
    }

    public String getYzbYq() {
        return yzbYq;
    }

    public void setYzbYq(String yzbYq) {
        this.yzbYq = yzbYq == null ? null : yzbYq.trim();
    }

    public String getYzbZh() {
        return yzbZh;
    }

    public void setYzbZh(String yzbZh) {
        this.yzbZh = yzbZh == null ? null : yzbZh.trim();
    }

    public String getYzbYh() {
        return yzbYh;
    }

    public void setYzbYh(String yzbYh) {
        this.yzbYh = yzbYh == null ? null : yzbYh.trim();
    }

    public String getCdZq() {
        return cdZq;
    }

    public void setCdZq(String cdZq) {
        this.cdZq = cdZq == null ? null : cdZq.trim();
    }

    public String getCdYq() {
        return cdYq;
    }

    public void setCdYq(String cdYq) {
        this.cdYq = cdYq == null ? null : cdYq.trim();
    }

    public String getCdZh() {
        return cdZh;
    }

    public void setCdZh(String cdZh) {
        this.cdZh = cdZh == null ? null : cdZh.trim();
    }

    public String getCdYh() {
        return cdYh;
    }

    public void setCdYh(String cdYh) {
        this.cdYh = cdYh == null ? null : cdYh.trim();
    }

    public String getHsjZq() {
        return hsjZq;
    }

    public void setHsjZq(String hsjZq) {
        this.hsjZq = hsjZq == null ? null : hsjZq.trim();
    }

    public String getHsjYq() {
        return hsjYq;
    }

    public void setHsjYq(String hsjYq) {
        this.hsjYq = hsjYq == null ? null : hsjYq.trim();
    }

    public String getBxgQb() {
        return bxgQb;
    }

    public void setBxgQb(String bxgQb) {
        this.bxgQb = bxgQb == null ? null : bxgQb.trim();
    }

    public String getBxgHb() {
        return bxgHb;
    }

    public void setBxgHb(String bxgHb) {
        this.bxgHb = bxgHb == null ? null : bxgHb.trim();
    }

    public String getFdboQb() {
        return fdboQb;
    }

    public void setFdboQb(String fdboQb) {
        this.fdboQb = fdboQb == null ? null : fdboQb.trim();
    }

    public String getFdblHb() {
        return fdblHb;
    }

    public void setFdblHb(String fdblHb) {
        this.fdblHb = fdblHb == null ? null : fdblHb.trim();
    }

    public String getYgqQb() {
        return ygqQb;
    }

    public void setYgqQb(String ygqQb) {
        this.ygqQb = ygqQb == null ? null : ygqQb.trim();
    }

    public String getYgqHb() {
        return ygqHb;
    }

    public void setYgqHb(String ygqHb) {
        this.ygqHb = ygqHb == null ? null : ygqHb.trim();
    }

    public String getFdjcg() {
        return fdjcg;
    }

    public void setFdjcg(String fdjcg) {
        this.fdjcg = fdjcg == null ? null : fdjcg.trim();
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg == null ? null : dg.trim();
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc == null ? null : tc.trim();
    }

    public String getHbxg() {
        return hbxg;
    }

    public void setHbxg(String hbxg) {
        this.hbxg = hbxg == null ? null : hbxg.trim();
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp == null ? null : dp.trim();
    }

    public String getPqg() {
        return pqg;
    }

    public void setPqg(String pqg) {
        this.pqg = pqg == null ? null : pqg.trim();
    }

    public String getChzhq() {
        return chzhq;
    }

    public void setChzhq(String chzhq) {
        this.chzhq = chzhq == null ? null : chzhq.trim();
    }
}