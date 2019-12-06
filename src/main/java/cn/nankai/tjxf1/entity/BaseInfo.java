package cn.nankai.tjxf1.entity;

import java.util.Date;

public class BaseInfo {
    private Integer accId;

    private Integer id;

    private Date timeFind;

    private Integer carNum;

    private Integer hurtNum;

    private String locSheng;

    private String locShi;

    private String locXian;

    private String locDetail;

    private Integer peopleNum;

    private String govCj;

    private String govLr;

    private Date timePolice;

    private Date timeInvest;

    private String fireTru;

    private Date timeFiretru;

    private String ambulance;

    private Date timeAmbu;

    private String state;

    private Integer status;

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