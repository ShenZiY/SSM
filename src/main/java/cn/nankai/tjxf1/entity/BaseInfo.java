package cn.nankai.tjxf1.entity;

import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

import java.util.Date;

@Excel("表A时间地点人员")
public class BaseInfo {
    @ExcelField(value = "事故编号")
    private Integer accId;
    @ExcelField(value = "填报人ID")
    private Integer id;
    @ExcelField(value = "发现时间")
    private Date timeFind;
    @ExcelField(value = "涉及车辆数")
    private Integer carNum;
    @ExcelField(value = "伤亡人数")
    private Integer hurtNum;
    @ExcelField(value = "省")
    private String locSheng;
    @ExcelField(value = "市")
    private String locShi;
    @ExcelField(value = "县")
    private String locXian;
    @ExcelField(value = "详细地址")
    private String locDetail;
    @ExcelField(value = "涉及人员数")
    private Integer peopleNum;
    @ExcelField(value = "采集人")
    private String govCj;
    @ExcelField(value = "信息录入人")
    private String govLr;
    @ExcelField(value = "警方到场时间")
    private Date timePolice;
    @ExcelField(value = "调查时间")
    private Date timeInvest;
    @ExcelField(value = "是否有消防车到场")
    private String fireTru;
    @ExcelField(value = "消防车到场时间")
    private Date timeFiretru;
    @ExcelField(value = "是否有救护车到场")
    private String ambulance;
    @ExcelField(value = "救护车到场时间")
    private Date timeAmbu;
    @ExcelField(value = "现场形态")
    private String state;
    @ExcelField(value = "状态")
    private Integer status;
    @ExcelField(value = "插入数据库时间")
    private Date timeInsert;

    public Date getTimeInsert() {
        return timeInsert;
    }

    public void setTimeInsert(Date timeInsert) {
        this.timeInsert = timeInsert;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public Date getTimeFind() {
        return timeFind;
    }

    public void setTimeFind(Date timeFind) {
        this.timeFind = timeFind;
    }

    public Integer getCarNum() {
        return carNum;
    }

    public void setCarNum(Integer carNum) {
        this.carNum = carNum;
    }

    public Integer getHurtNum() {
        return hurtNum;
    }

    public void setHurtNum(Integer hurtNum) {
        this.hurtNum = hurtNum;
    }

    public String getLocSheng() {
        return locSheng;
    }

    public void setLocSheng(String locSheng) {
        this.locSheng = locSheng == null ? null : locSheng.trim();
    }

    public String getLocShi() {
        return locShi;
    }

    public void setLocShi(String locShi) {
        this.locShi = locShi == null ? null : locShi.trim();
    }

    public String getLocXian() {
        return locXian;
    }

    public void setLocXian(String locXian) {
        this.locXian = locXian == null ? null : locXian.trim();
    }

    public String getLocDetail() {
        return locDetail;
    }

    public void setLocDetail(String locDetail) {
        this.locDetail = locDetail == null ? null : locDetail.trim();
    }

    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getGovCj() {
        return govCj;
    }

    public void setGovCj(String govCj) {
        this.govCj = govCj == null ? null : govCj.trim();
    }

    public String getGovLr() {
        return govLr;
    }

    public void setGovLr(String govLr) {
        this.govLr = govLr == null ? null : govLr.trim();
    }

    public Date getTimePolice() {
        return timePolice;
    }

    public void setTimePolice(Date timePolice) {
        this.timePolice = timePolice;
    }

    public Date getTimeInvest() {
        return timeInvest;
    }

    public void setTimeInvest(Date timeInvest) {
        this.timeInvest = timeInvest;
    }

    public String getFireTru() {
        return fireTru;
    }

    public void setFireTru(String fireTru) {
        this.fireTru = fireTru == null ? null : fireTru.trim();
    }

    public Date getTimeFiretru() {
        return timeFiretru;
    }

    public void setTimeFiretru(Date timeFiretru) {
        this.timeFiretru = timeFiretru;
    }

    public String getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(String ambulance) {
        this.ambulance = ambulance == null ? null : ambulance.trim();
    }

    public Date getTimeAmbu() {
        return timeAmbu;
    }

    public void setTimeAmbu(Date timeAmbu) {
        this.timeAmbu = timeAmbu;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}