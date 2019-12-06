package cn.nankai.tjxf1.entity;

import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

@Excel("人员地调查信息")
public class PeolpleInfo {

    @ExcelField(value = "人员编号")
    private Integer peopleId;

    @ExcelField(value = "事故编号")
    private Integer accId;

    @ExcelField(value = "人员类型")
    private String peopleType;

    @ExcelField(value = "性别")
    private String peopleSex;

    @ExcelField(value = "年龄")
    private Integer peopleAge;

    @ExcelField(value = "调查地点")
    private String investLoc;

    @ExcelField(value = "调查方式")
    private String investMethod;

    @ExcelField(value = "是否抽烟")
    private String ifSmoke;

    @ExcelField(value = "是否喝酒")
    private String ifDrink;

    @ExcelField(value = "是否受伤")
    private String ifInjury;

    @ExcelField(value = "受伤位置")
    private String injuryLoc;

    @ExcelField(value = "车辆性能")
    private String carPerform;

    @ExcelField(value = "采取措施一")
    private String measure1;

    @ExcelField(value = "人员位置")
    private String fireFindLoc;

    @ExcelField(value = "距离")
    private Double distance;

    @ExcelField(value = "现象")
    private String phenomenon;

    @ExcelField(value = "采取措施二")
    private String measure2;

    @ExcelField(value = "火焰位置")
    private String fireLoc;

    @ExcelField(value = "火焰高度")
    private String fireHeight;

    @ExcelField(value = "火焰整体高度")
    private Double fireHeightall;

    @ExcelField(value = "烟气位置")
    private String fogLoc;

    @ExcelField(value = "烟气颜色")
    private String fogColor;

    @ExcelField(value = "烟气高度")
    private String fogHeight;

    @ExcelField(value = "烟气整体高度")
    private Double fogHeightall;

    public Integer getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(Integer peopleId) {
        this.peopleId = peopleId;
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getPeopleType() {
        return peopleType;
    }

    public void setPeopleType(String peopleType) {
        this.peopleType = peopleType == null ? null : peopleType.trim();
    }

    public String getPeopleSex() {
        return peopleSex;
    }

    public void setPeopleSex(String peopleSex) {
        this.peopleSex = peopleSex == null ? null : peopleSex.trim();
    }

    public Integer getPeopleAge() {
        return peopleAge;
    }

    public void setPeopleAge(Integer peopleAge) {
        this.peopleAge = peopleAge;
    }

    public String getInvestLoc() {
        return investLoc;
    }

    public void setInvestLoc(String investLoc) {
        this.investLoc = investLoc == null ? null : investLoc.trim();
    }

    public String getInvestMethod() {
        return investMethod;
    }

    public void setInvestMethod(String investMethod) {
        this.investMethod = investMethod == null ? null : investMethod.trim();
    }

    public String getIfSmoke() {
        return ifSmoke;
    }

    public void setIfSmoke(String ifSmoke) {
        this.ifSmoke = ifSmoke == null ? null : ifSmoke.trim();
    }

    public String getIfDrink() {
        return ifDrink;
    }

    public void setIfDrink(String ifDrink) {
        this.ifDrink = ifDrink == null ? null : ifDrink.trim();
    }

    public String getIfInjury() {
        return ifInjury;
    }

    public void setIfInjury(String ifInjury) {
        this.ifInjury = ifInjury == null ? null : ifInjury.trim();
    }

    public String getInjuryLoc() {
        return injuryLoc;
    }

    public void setInjuryLoc(String injuryLoc) {
        this.injuryLoc = injuryLoc == null ? null : injuryLoc.trim();
    }

    public String getCarPerform() {
        return carPerform;
    }

    public void setCarPerform(String carPerform) {
        this.carPerform = carPerform == null ? null : carPerform.trim();
    }

    public String getMeasure1() {
        return measure1;
    }

    public void setMeasure1(String measure1) {
        this.measure1 = measure1 == null ? null : measure1.trim();
    }

    public String getFireFindLoc() {
        return fireFindLoc;
    }

    public void setFireFindLoc(String fireFindLoc) {
        this.fireFindLoc = fireFindLoc == null ? null : fireFindLoc.trim();
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getPhenomenon() {
        return phenomenon;
    }

    public void setPhenomenon(String phenomenon) {
        this.phenomenon = phenomenon == null ? null : phenomenon.trim();
    }

    public String getMeasure2() {
        return measure2;
    }

    public void setMeasure2(String measure2) {
        this.measure2 = measure2 == null ? null : measure2.trim();
    }

    public String getFireLoc() {
        return fireLoc;
    }

    public void setFireLoc(String fireLoc) {
        this.fireLoc = fireLoc == null ? null : fireLoc.trim();
    }

    public String getFireHeight() {
        return fireHeight;
    }

    public void setFireHeight(String fireHeight) {
        this.fireHeight = fireHeight == null ? null : fireHeight.trim();
    }

    public Double getFireHeightall() {
        return fireHeightall;
    }

    public void setFireHeightall(Double fireHeightall) {
        this.fireHeightall = fireHeightall;
    }

    public String getFogLoc() {
        return fogLoc;
    }

    public void setFogLoc(String fogLoc) {
        this.fogLoc = fogLoc == null ? null : fogLoc.trim();
    }

    public String getFogColor() {
        return fogColor;
    }

    public void setFogColor(String fogColor) {
        this.fogColor = fogColor == null ? null : fogColor.trim();
    }

    public String getFogHeight() {
        return fogHeight;
    }

    public void setFogHeight(String fogHeight) {
        this.fogHeight = fogHeight == null ? null : fogHeight.trim();
    }

    public Double getFogHeightall() {
        return fogHeightall;
    }

    public void setFogHeightall(Double fogHeightall) {
        this.fogHeightall = fogHeightall;
    }

    @Override
    public String toString() {
        return "PeolpleInfo{" +
                "peopleId=" + peopleId +
                ", accId=" + accId +
                ", peopleType='" + peopleType + '\'' +
                ", peopleSex='" + peopleSex + '\'' +
                ", peopleAge=" + peopleAge +
                ", investLoc='" + investLoc + '\'' +
                ", investMethod='" + investMethod + '\'' +
                ", ifSmoke='" + ifSmoke + '\'' +
                ", ifDrink='" + ifDrink + '\'' +
                ", ifInjury='" + ifInjury + '\'' +
                ", injuryLoc='" + injuryLoc + '\'' +
                ", carPerform='" + carPerform + '\'' +
                ", measure1='" + measure1 + '\'' +
                ", fireFindLoc='" + fireFindLoc + '\'' +
                ", distance=" + distance +
                ", phenomenon='" + phenomenon + '\'' +
                ", measure2='" + measure2 + '\'' +
                ", fireLoc='" + fireLoc + '\'' +
                ", fireHeight='" + fireHeight + '\'' +
                ", fireHeightall=" + fireHeightall +
                ", fogLoc='" + fogLoc + '\'' +
                ", fogColor='" + fogColor + '\'' +
                ", fogHeight='" + fogHeight + '\'' +
                ", fogHeightall=" + fogHeightall +
                '}';
    }
}