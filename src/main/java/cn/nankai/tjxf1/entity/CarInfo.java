package cn.nankai.tjxf1.entity;

import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

import java.util.Date;

@Excel("车辆基本信息")
public class CarInfo {
    @ExcelField(value = "车辆编码")
    private Integer carId;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    @ExcelField(value = "车辆识别代码")
    private String vin;

    @ExcelField(value = "事故编码")
    private Integer accId;

    @ExcelField(value = "品牌型号")
    private String brand;

    @ExcelField(value = "车辆注册时间")
    private Date registerTime;

    @ExcelField(value = "车辆性质")
    private String carProperty;

    @ExcelField(value = "行驶里程")
    private String carMiles;

    @ExcelField(value = "事发前行驶距离")
    private String befoRundis;

    @ExcelField(value = "事发前行驶时间")
    private String befoRuntime;

    @ExcelField(value = "事发前停放时间")
    private String befoStoptime;

    @ExcelField(value = "事发时状态")
    private String state;

    @ExcelField(value = "事发后停放位置")
    private String aftloc;

    @ExcelField(value = "转移方式")
    private String transMethod;

    @ExcelField(value = "是否加装")
    private String ifModify;

    @ExcelField(value = "加装时间")
    private Date modifyTime;

    @ExcelField(value = "加装部件")
    private String modifyPart;

    @ExcelField(value = "加装位置")
    private String modifyPos;

    @ExcelField(value = "最近维保时间")
    private Date maintainTime;

    @ExcelField(value = "维保目的")
    private String maintainPurpose;

    @ExcelField(value = "维保内容")
    private String maintainContent;

    @ExcelField(value = "购买保险")
    private String insurance;

    @ExcelField(value = "投保时间")
    private Date insuranceTime;

    @ExcelField(value = "投保险种")
    private String insuranceType;

    @ExcelField(value = "蔓延趋势")
    private String myqs;

    @ExcelField(value = "起火部位")
    private String qhbw;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getCarProperty() {
        return carProperty;
    }

    public void setCarProperty(String carProperty) {
        this.carProperty = carProperty == null ? null : carProperty.trim();
    }

    public String getCarMiles() {
        return carMiles;
    }

    public void setCarMiles(String carMiles) {
        this.carMiles = carMiles == null ? null : carMiles.trim();
    }

    public String getBefoRundis() {
        return befoRundis;
    }

    public void setBefoRundis(String befoRundis) {
        this.befoRundis = befoRundis == null ? null : befoRundis.trim();
    }

    public String getBefoRuntime() {
        return befoRuntime;
    }

    public void setBefoRuntime(String befoRuntime) {
        this.befoRuntime = befoRuntime == null ? null : befoRuntime.trim();
    }

    public String getBefoStoptime() {
        return befoStoptime;
    }

    public void setBefoStoptime(String befoStoptime) {
        this.befoStoptime = befoStoptime == null ? null : befoStoptime.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getAftloc() {
        return aftloc;
    }

    public void setAftloc(String aftloc) {
        this.aftloc = aftloc == null ? null : aftloc.trim();
    }

    public String getTransMethod() {
        return transMethod;
    }

    public void setTransMethod(String transMethod) {
        this.transMethod = transMethod == null ? null : transMethod.trim();
    }

    public String getIfModify() {
        return ifModify;
    }

    public void setIfModify(String ifModify) {
        this.ifModify = ifModify == null ? null : ifModify.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyPart() {
        return modifyPart;
    }

    public void setModifyPart(String modifyPart) {
        this.modifyPart = modifyPart == null ? null : modifyPart.trim();
    }

    public String getModifyPos() {
        return modifyPos;
    }

    public void setModifyPos(String modifyPos) {
        this.modifyPos = modifyPos == null ? null : modifyPos.trim();
    }

    public Date getMaintainTime() {
        return maintainTime;
    }

    public void setMaintainTime(Date maintainTime) {
        this.maintainTime = maintainTime;
    }

    public String getMaintainPurpose() {
        return maintainPurpose;
    }

    public void setMaintainPurpose(String maintainPurpose) {
        this.maintainPurpose = maintainPurpose == null ? null : maintainPurpose.trim();
    }

    public String getMaintainContent() {
        return maintainContent;
    }

    public void setMaintainContent(String maintainContent) {
        this.maintainContent = maintainContent == null ? null : maintainContent.trim();
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance == null ? null : insurance.trim();
    }

    public Date getInsuranceTime() {
        return insuranceTime;
    }

    public void setInsuranceTime(Date insuranceTime) {
        this.insuranceTime = insuranceTime;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType == null ? null : insuranceType.trim();
    }

    public String getMyqs() {
        return myqs;
    }

    public void setMyqs(String myqs) {
        this.myqs = myqs == null ? null : myqs.trim();
    }

    public String getQhbw() {
        return qhbw;
    }

    public void setQhbw(String qhbw) {
        this.qhbw = qhbw == null ? null : qhbw.trim();
    }
}