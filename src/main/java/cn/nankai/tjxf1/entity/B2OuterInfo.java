package cn.nankai.tjxf1.entity;


import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

@Excel("表B2货车外部烧损信息")
public class B2OuterInfo {

    @ExcelField("车辆编码")
    private Integer carId;

    @ExcelField("事故编码")
    private Integer accId;

    @ExcelField("车辆识别代码")
    private String vin;

    @ExcelField("轮胎左1")
    private String ltZ1;

    @ExcelField("轮胎左2")
    private String ltZ2;

    @ExcelField("轮胎左3")
    private String ltZ3;

    @ExcelField("轮胎左4")
    private String ltZ4;

    @ExcelField("轮胎右1")
    private String ltY1;

    @ExcelField("轮胎右2")
    private String ltY2;

    @ExcelField("轮胎右3")
    private String ltY3;

    @ExcelField("轮胎右4")
    private String ltY4;

    @ExcelField("轮辋左1")
    private String lwZ1;

    @ExcelField("轮辋左2")
    private String lwZ2;

    @ExcelField("轮辋左3")
    private String lwZ3;

    @ExcelField("轮辋左4")
    private String lwZ4;

    @ExcelField("轮辋右1")
    private String lwY1;

    @ExcelField("轮辋右2")
    private String lwY2;

    @ExcelField("轮辋右3")
    private String lwY3;

    @ExcelField("轮辋右4")
    private String lwY4;

    @ExcelField("车门左1")
    private String cmZ1;

    @ExcelField("车门左2")
    private String cmZ2;

    @ExcelField("车门右1")
    private String cmY1;

    @ExcelField("车门右2")
    private String cmY2;

    @ExcelField("车窗左1")
    private String ccZ1;

    @ExcelField("车窗左2")
    private String ccZ2;

    @ExcelField("车窗右1")
    private String ccY1;

    @ExcelField("车窗右2")
    private String ccY2;

    @ExcelField("翼子板左")
    private String yzbZ;

    @ExcelField("翼子板右")
    private String yzbY;

    @ExcelField("车灯左1")
    private String cdZ1;

    @ExcelField("车灯左2")
    private String cdZ2;

    @ExcelField("车灯左3")
    private String cdZ3;

    @ExcelField("车灯左4")
    private String cdZ4;

    @ExcelField("车灯右1")
    private String cdY1;

    @ExcelField("车灯右2")
    private String cdY2;

    @ExcelField("车灯右3")
    private String cdY3;

    @ExcelField("车灯右4")
    private String cdY4;

    @ExcelField("后视镜左")
    private String hsjZ;

    @ExcelField("后视镜右")
    private String hsjY;

    @ExcelField("保险杠前部")
    private String bxgQb;

    @ExcelField("保险杠后部")
    private String bxgHb;

    @ExcelField("风挡玻璃前部")
    private String fdblQb;

    @ExcelField("风挡玻璃后部")
    private String fdblHb;

    @ExcelField("雨刮器")
    private String ygqQb;

    @ExcelField("膨胀水箱")
    private String pzsx;

    @ExcelField("驾驶室顶盖")
    private String jssdg;

    @ExcelField("驾驶室后围板")
    private String jsshwb;

    @ExcelField("前板总成")
    private String qbzc;

    @ExcelField("后板总成")
    private String hbzc;

    @ExcelField("左边板总成")
    private String zbbzc;

    @ExcelField("地板总成")
    private String dbzc;

    @ExcelField("右边板总成")
    private String ybbzc;

    @ExcelField("顶板")
    private String db;

    @ExcelField("底盘")
    private String dp;

    @ExcelField("备胎")
    private String bt;

    @ExcelField("排气管")
    private String pqg;

    @ExcelField("催化转换器")
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

    public String getLtZ1() {
        return ltZ1;
    }

    public void setLtZ1(String ltZ1) {
        this.ltZ1 = ltZ1 == null ? null : ltZ1.trim();
    }

    public String getLtZ2() {
        return ltZ2;
    }

    public void setLtZ2(String ltZ2) {
        this.ltZ2 = ltZ2 == null ? null : ltZ2.trim();
    }

    public String getLtZ3() {
        return ltZ3;
    }

    public void setLtZ3(String ltZ3) {
        this.ltZ3 = ltZ3 == null ? null : ltZ3.trim();
    }

    public String getLtZ4() {
        return ltZ4;
    }

    public void setLtZ4(String ltZ4) {
        this.ltZ4 = ltZ4 == null ? null : ltZ4.trim();
    }

    public String getLtY1() {
        return ltY1;
    }

    public void setLtY1(String ltY1) {
        this.ltY1 = ltY1 == null ? null : ltY1.trim();
    }

    public String getLtY2() {
        return ltY2;
    }

    public void setLtY2(String ltY2) {
        this.ltY2 = ltY2 == null ? null : ltY2.trim();
    }

    public String getLtY3() {
        return ltY3;
    }

    public void setLtY3(String ltY3) {
        this.ltY3 = ltY3 == null ? null : ltY3.trim();
    }

    public String getLtY4() {
        return ltY4;
    }

    public void setLtY4(String ltY4) {
        this.ltY4 = ltY4 == null ? null : ltY4.trim();
    }

    public String getLwZ1() {
        return lwZ1;
    }

    public void setLwZ1(String lwZ1) {
        this.lwZ1 = lwZ1 == null ? null : lwZ1.trim();
    }

    public String getLwZ2() {
        return lwZ2;
    }

    public void setLwZ2(String lwZ2) {
        this.lwZ2 = lwZ2 == null ? null : lwZ2.trim();
    }

    public String getLwZ3() {
        return lwZ3;
    }

    public void setLwZ3(String lwZ3) {
        this.lwZ3 = lwZ3 == null ? null : lwZ3.trim();
    }

    public String getLwZ4() {
        return lwZ4;
    }

    public void setLwZ4(String lwZ4) {
        this.lwZ4 = lwZ4 == null ? null : lwZ4.trim();
    }

    public String getLwY1() {
        return lwY1;
    }

    public void setLwY1(String lwY1) {
        this.lwY1 = lwY1 == null ? null : lwY1.trim();
    }

    public String getLwY2() {
        return lwY2;
    }

    public void setLwY2(String lwY2) {
        this.lwY2 = lwY2 == null ? null : lwY2.trim();
    }

    public String getLwY3() {
        return lwY3;
    }

    public void setLwY3(String lwY3) {
        this.lwY3 = lwY3 == null ? null : lwY3.trim();
    }

    public String getLwY4() {
        return lwY4;
    }

    public void setLwY4(String lwY4) {
        this.lwY4 = lwY4 == null ? null : lwY4.trim();
    }

    public String getCmZ1() {
        return cmZ1;
    }

    public void setCmZ1(String cmZ1) {
        this.cmZ1 = cmZ1 == null ? null : cmZ1.trim();
    }

    public String getCmZ2() {
        return cmZ2;
    }

    public void setCmZ2(String cmZ2) {
        this.cmZ2 = cmZ2 == null ? null : cmZ2.trim();
    }

    public String getCmY1() {
        return cmY1;
    }

    public void setCmY1(String cmY1) {
        this.cmY1 = cmY1 == null ? null : cmY1.trim();
    }

    public String getCmY2() {
        return cmY2;
    }

    public void setCmY2(String cmY2) {
        this.cmY2 = cmY2 == null ? null : cmY2.trim();
    }

    public String getCcZ1() {
        return ccZ1;
    }

    public void setCcZ1(String ccZ1) {
        this.ccZ1 = ccZ1 == null ? null : ccZ1.trim();
    }

    public String getCcZ2() {
        return ccZ2;
    }

    public void setCcZ2(String ccZ2) {
        this.ccZ2 = ccZ2 == null ? null : ccZ2.trim();
    }

    public String getCcY1() {
        return ccY1;
    }

    public void setCcY1(String ccY1) {
        this.ccY1 = ccY1 == null ? null : ccY1.trim();
    }

    public String getCcY2() {
        return ccY2;
    }

    public void setCcY2(String ccY2) {
        this.ccY2 = ccY2 == null ? null : ccY2.trim();
    }

    public String getYzbZ() {
        return yzbZ;
    }

    public void setYzbZ(String yzbZ) {
        this.yzbZ = yzbZ == null ? null : yzbZ.trim();
    }

    public String getYzbY() {
        return yzbY;
    }

    public void setYzbY(String yzbY) {
        this.yzbY = yzbY == null ? null : yzbY.trim();
    }

    public String getCdZ1() {
        return cdZ1;
    }

    public void setCdZ1(String cdZ1) {
        this.cdZ1 = cdZ1 == null ? null : cdZ1.trim();
    }

    public String getCdZ2() {
        return cdZ2;
    }

    public void setCdZ2(String cdZ2) {
        this.cdZ2 = cdZ2 == null ? null : cdZ2.trim();
    }

    public String getCdZ3() {
        return cdZ3;
    }

    public void setCdZ3(String cdZ3) {
        this.cdZ3 = cdZ3 == null ? null : cdZ3.trim();
    }

    public String getCdZ4() {
        return cdZ4;
    }

    public void setCdZ4(String cdZ4) {
        this.cdZ4 = cdZ4 == null ? null : cdZ4.trim();
    }

    public String getCdY1() {
        return cdY1;
    }

    public void setCdY1(String cdY1) {
        this.cdY1 = cdY1 == null ? null : cdY1.trim();
    }

    public String getCdY2() {
        return cdY2;
    }

    public void setCdY2(String cdY2) {
        this.cdY2 = cdY2 == null ? null : cdY2.trim();
    }

    public String getCdY3() {
        return cdY3;
    }

    public void setCdY3(String cdY3) {
        this.cdY3 = cdY3 == null ? null : cdY3.trim();
    }

    public String getCdY4() {
        return cdY4;
    }

    public void setCdY4(String cdY4) {
        this.cdY4 = cdY4 == null ? null : cdY4.trim();
    }

    public String getHsjZ() {
        return hsjZ;
    }

    public void setHsjZ(String hsjZ) {
        this.hsjZ = hsjZ == null ? null : hsjZ.trim();
    }

    public String getHsjY() {
        return hsjY;
    }

    public void setHsjY(String hsjY) {
        this.hsjY = hsjY == null ? null : hsjY.trim();
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

    public String getFdblQb() {
        return fdblQb;
    }

    public void setFdblQb(String fdblQb) {
        this.fdblQb = fdblQb == null ? null : fdblQb.trim();
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

    public String getPzsx() {
        return pzsx;
    }

    public void setPzsx(String pzsx) {
        this.pzsx = pzsx == null ? null : pzsx.trim();
    }

    public String getJssdg() {
        return jssdg;
    }

    public void setJssdg(String jssdg) {
        this.jssdg = jssdg == null ? null : jssdg.trim();
    }

    public String getJsshwb() {
        return jsshwb;
    }

    public void setJsshwb(String jsshwb) {
        this.jsshwb = jsshwb == null ? null : jsshwb.trim();
    }

    public String getQbzc() {
        return qbzc;
    }

    public void setQbzc(String qbzc) {
        this.qbzc = qbzc == null ? null : qbzc.trim();
    }

    public String getHbzc() {
        return hbzc;
    }

    public void setHbzc(String hbzc) {
        this.hbzc = hbzc == null ? null : hbzc.trim();
    }

    public String getZbbzc() {
        return zbbzc;
    }

    public void setZbbzc(String zbbzc) {
        this.zbbzc = zbbzc == null ? null : zbbzc.trim();
    }

    public String getDbzc() {
        return dbzc;
    }

    public void setDbzc(String dbzc) {
        this.dbzc = dbzc == null ? null : dbzc.trim();
    }

    public String getYbbzc() {
        return ybbzc;
    }

    public void setYbbzc(String ybbzc) {
        this.ybbzc = ybbzc == null ? null : ybbzc.trim();
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp == null ? null : dp.trim();
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt == null ? null : bt.trim();
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