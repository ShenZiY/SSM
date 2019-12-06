package cn.nankai.tjxf1.entity;

import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

@Excel("表B5电动客车外部烧损信息")
public class B5OuterInfo {

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

    @ExcelField("轮胎右1")
    private String ltY1;

    @ExcelField("轮胎右2")
    private String ltY2;

    @ExcelField("轮胎右3")
    private String ltY3;

    @ExcelField("轮辋左1")
    private String lwZ1;

    @ExcelField("轮辋左2")
    private String lwZ2;

    @ExcelField("轮辋左3")
    private String lwZ3;

    @ExcelField("轮辋右1")
    private String lwY1;

    @ExcelField("轮辋右2")
    private String lwY2;

    @ExcelField("轮辋右3")
    private String lwY3;

    @ExcelField("车门左1")
    private String cmZ1;

    @ExcelField("车门右1")
    private String cmY1;

    @ExcelField("车门右2")
    private String cmY2;

    @ExcelField("车门右3")
    private String cmY3;

    @ExcelField("侧围板左1")
    private String cwbZ1;

    @ExcelField("侧围板左2")
    private String cwbZ2;

    @ExcelField("侧围板左3")
    private String cwbZ3;

    @ExcelField("侧围板右1")
    private String cwbY1;

    @ExcelField("侧围板右2")
    private String cwbY2;

    @ExcelField("侧围板右3")
    private String cwbY3;

    @ExcelField("车灯左1")
    private String cdZ1;

    @ExcelField("车灯左2")
    private String cdZ2;

    @ExcelField("车灯右1")
    private String cdY1;

    @ExcelField("车灯右2")
    private String cdY2;

    @ExcelField("后视镜左")
    private String hsjZ;

    @ExcelField("后视镜右")
    private String hsjY;

    @ExcelField("车窗左1")
    private String ccZ1;

    @ExcelField("车窗左2")
    private String ccZ2;

    @ExcelField("车窗左3")
    private String ccZ3;

    @ExcelField("车窗左4")
    private String ccZ4;

    @ExcelField("车窗左5")
    private String ccZ5;

    @ExcelField("车窗左6")
    private String ccZ6;

    @ExcelField("车窗右1")
    private String ccY1;

    @ExcelField("车窗右2")
    private String ccY2;

    @ExcelField("车窗右3")
    private String ccY3;

    @ExcelField("车窗右4")
    private String ccY4;

    @ExcelField("车窗右5")
    private String ccY5;

    @ExcelField("车窗右6")
    private String ccY6;

    @ExcelField("保险杠前部")
    private String bxgQb;

    @ExcelField("保险杠后部")
    private String bxgHb;

    @ExcelField("风挡玻璃前部")
    private String fdblQb;

    @ExcelField("风挡玻璃后部")
    private String fdblHb;

    @ExcelField("雨刮器前部")
    private String ygqQb;

    @ExcelField("雨刮器后部")
    private String ygqHb;

    @ExcelField("顶盖")
    private String dg;

    @ExcelField("顶部空调")
    private String dbkt;

    @ExcelField("底盘")
    private String dp;

    @ExcelField("排气管")
    private String pqg;

    @ExcelField("催化转化器")
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

    public String getCmZ1() {
        return cmZ1;
    }

    public void setCmZ1(String cmZ1) {
        this.cmZ1 = cmZ1 == null ? null : cmZ1.trim();
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

    public String getCmY3() {
        return cmY3;
    }

    public void setCmY3(String cmY3) {
        this.cmY3 = cmY3 == null ? null : cmY3.trim();
    }

    public String getCwbZ1() {
        return cwbZ1;
    }

    public void setCwbZ1(String cwbZ1) {
        this.cwbZ1 = cwbZ1 == null ? null : cwbZ1.trim();
    }

    public String getCwbZ2() {
        return cwbZ2;
    }

    public void setCwbZ2(String cwbZ2) {
        this.cwbZ2 = cwbZ2 == null ? null : cwbZ2.trim();
    }

    public String getCwbZ3() {
        return cwbZ3;
    }

    public void setCwbZ3(String cwbZ3) {
        this.cwbZ3 = cwbZ3 == null ? null : cwbZ3.trim();
    }

    public String getCwbY1() {
        return cwbY1;
    }

    public void setCwbY1(String cwbY1) {
        this.cwbY1 = cwbY1 == null ? null : cwbY1.trim();
    }

    public String getCwbY2() {
        return cwbY2;
    }

    public void setCwbY2(String cwbY2) {
        this.cwbY2 = cwbY2 == null ? null : cwbY2.trim();
    }

    public String getCwbY3() {
        return cwbY3;
    }

    public void setCwbY3(String cwbY3) {
        this.cwbY3 = cwbY3 == null ? null : cwbY3.trim();
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

    public String getCcZ3() {
        return ccZ3;
    }

    public void setCcZ3(String ccZ3) {
        this.ccZ3 = ccZ3 == null ? null : ccZ3.trim();
    }

    public String getCcZ4() {
        return ccZ4;
    }

    public void setCcZ4(String ccZ4) {
        this.ccZ4 = ccZ4 == null ? null : ccZ4.trim();
    }

    public String getCcZ5() {
        return ccZ5;
    }

    public void setCcZ5(String ccZ5) {
        this.ccZ5 = ccZ5 == null ? null : ccZ5.trim();
    }

    public String getCcZ6() {
        return ccZ6;
    }

    public void setCcZ6(String ccZ6) {
        this.ccZ6 = ccZ6 == null ? null : ccZ6.trim();
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

    public String getCcY3() {
        return ccY3;
    }

    public void setCcY3(String ccY3) {
        this.ccY3 = ccY3 == null ? null : ccY3.trim();
    }

    public String getCcY4() {
        return ccY4;
    }

    public void setCcY4(String ccY4) {
        this.ccY4 = ccY4 == null ? null : ccY4.trim();
    }

    public String getCcY5() {
        return ccY5;
    }

    public void setCcY5(String ccY5) {
        this.ccY5 = ccY5 == null ? null : ccY5.trim();
    }

    public String getCcY6() {
        return ccY6;
    }

    public void setCcY6(String ccY6) {
        this.ccY6 = ccY6 == null ? null : ccY6.trim();
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

    public String getYgqHb() {
        return ygqHb;
    }

    public void setYgqHb(String ygqHb) {
        this.ygqHb = ygqHb == null ? null : ygqHb.trim();
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg == null ? null : dg.trim();
    }

    public String getDbkt() {
        return dbkt;
    }

    public void setDbkt(String dbkt) {
        this.dbkt = dbkt == null ? null : dbkt.trim();
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