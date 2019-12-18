package cn.nankai.tjxf1.entity;

import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

@Excel("表A事故地点环境条件")
public class EnvInfo {
    @ExcelField(value = "事故编码")
    private Integer accId;
    @ExcelField(value = "事故地点")
    private String location;
    @ExcelField(value = "沿车头趋势")
    private String roadinfoCt;
    @ExcelField(value = "坡度")
    private Integer roadinfoPd;
    @ExcelField(value = "表面材质")
    private String roadinfoCz;
    @ExcelField(value = "表面状况")
    private String roadinfoZk;
    @ExcelField(value = "周围监控")
    private String roadinfoJk;
    @ExcelField(value = "天气")
    private String weainfoTq;
    @ExcelField(value = "风向")
    private String weainfoFx;
    @ExcelField(value = "风力")
    private String weainfoFl;
    @ExcelField(value = "风速")
    private Integer weainfoFs;
    @ExcelField(value = "温度")
    private Integer weainfoWd;
    @ExcelField(value = "现场保护")
    private String protectXc;
    @ExcelField(value = "车辆保护")
    private String protectCl;

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getRoadinfoCt() {
        return roadinfoCt;
    }

    public void setRoadinfoCt(String roadinfoCt) {
        this.roadinfoCt = roadinfoCt == null ? null : roadinfoCt.trim();
    }

    public Integer getRoadinfoPd() {
        return roadinfoPd;
    }

    public void setRoadinfoPd(Integer roadinfoPd) {
        this.roadinfoPd = roadinfoPd;
    }

    public String getRoadinfoCz() {
        return roadinfoCz;
    }

    public void setRoadinfoCz(String roadinfoCz) {
        this.roadinfoCz = roadinfoCz == null ? null : roadinfoCz.trim();
    }

    public String getRoadinfoZk() {
        return roadinfoZk;
    }

    public void setRoadinfoZk(String roadinfoZk) {
        this.roadinfoZk = roadinfoZk == null ? null : roadinfoZk.trim();
    }

    public String getRoadinfoJk() {
        return roadinfoJk;
    }

    public void setRoadinfoJk(String roadinfoJk) {
        this.roadinfoJk = roadinfoJk == null ? null : roadinfoJk.trim();
    }

    public String getWeainfoTq() {
        return weainfoTq;
    }

    public void setWeainfoTq(String weainfoTq) {
        this.weainfoTq = weainfoTq == null ? null : weainfoTq.trim();
    }

    public String getWeainfoFx() {
        return weainfoFx;
    }

    public void setWeainfoFx(String weainfoFx) {
        this.weainfoFx = weainfoFx == null ? null : weainfoFx.trim();
    }

    public String getWeainfoFl() {
        return weainfoFl;
    }

    public void setWeainfoFl(String weainfoFl) {
        this.weainfoFl = weainfoFl == null ? null : weainfoFl.trim();
    }

    public Integer getWeainfoWd() {
        return weainfoWd;
    }

    public void setWeainfoWd(Integer weainfoWd) {
        this.weainfoWd = weainfoWd;
    }

    public String getProtectXc() {
        return protectXc;
    }

    public void setProtectXc(String protectXc) {
        this.protectXc = protectXc == null ? null : protectXc.trim();
    }

    public String getProtectCl() {
        return protectCl;
    }

    public void setProtectCl(String protectCl) {
        this.protectCl = protectCl == null ? null : protectCl.trim();
    }

    public Integer getWeainfoFs() {
        return weainfoFs;
    }

    public void setWeainfoFs(Integer weainfoFs) {
        this.weainfoFs = weainfoFs;
    }
}