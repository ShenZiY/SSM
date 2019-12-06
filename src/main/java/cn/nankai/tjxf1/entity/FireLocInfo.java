package cn.nankai.tjxf1.entity;

import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

@Excel("起火部位信息")
public class FireLocInfo {
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
    @ExcelField(value = "主要烧损部件一")
    private String mainBurnunit1;
    @ExcelField(value = "主要烧损部件一烧损程度")
    private String mainBurnunit1Degree;
    @ExcelField(value = "烧损部件一自身电路")
    private String unit1Circurt;
    @ExcelField(value = "烧损部件一附近电路")
    private String other1Circurt;
    @ExcelField(value = "主要烧损部件二")
    private String mainBurnunit2;
    @ExcelField(value = "主要烧损部件二烧损程度")
    private String mainBurnunit2Degree;
    @ExcelField(value = "烧损部件二自身电路")
    private String unit2Circurt;
    @ExcelField(value = "烧损部件二附近电路")
    private String other2Circurt;
    @ExcelField(value = "主要可燃物一名称")
    private String mainBurnobject1Name;
    @ExcelField(value = "主要可燃物一烧损程度")
    private String mainBurnobject1Burn;
    @ExcelField(value = "主要可燃物二名称")
    private String mainBurnobject2Name;
    @ExcelField(value = "主要可燃物二烧损程度")
    private String mainBurnobject2Burn;

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

    public String getMainBurnunit1() {
        return mainBurnunit1;
    }

    public void setMainBurnunit1(String mainBurnunit1) {
        this.mainBurnunit1 = mainBurnunit1 == null ? null : mainBurnunit1.trim();
    }

    public String getMainBurnunit1Degree() {
        return mainBurnunit1Degree;
    }

    public void setMainBurnunit1Degree(String mainBurnunit1Degree) {
        this.mainBurnunit1Degree = mainBurnunit1Degree == null ? null : mainBurnunit1Degree.trim();
    }

    public String getUnit1Circurt() {
        return unit1Circurt;
    }

    public void setUnit1Circurt(String unit1Circurt) {
        this.unit1Circurt = unit1Circurt == null ? null : unit1Circurt.trim();
    }

    public String getOther1Circurt() {
        return other1Circurt;
    }

    public void setOther1Circurt(String other1Circurt) {
        this.other1Circurt = other1Circurt == null ? null : other1Circurt.trim();
    }

    public String getMainBurnunit2() {
        return mainBurnunit2;
    }

    public void setMainBurnunit2(String mainBurnunit2) {
        this.mainBurnunit2 = mainBurnunit2 == null ? null : mainBurnunit2.trim();
    }

    public String getMainBurnunit2Degree() {
        return mainBurnunit2Degree;
    }

    public void setMainBurnunit2Degree(String mainBurnunit2Degree) {
        this.mainBurnunit2Degree = mainBurnunit2Degree == null ? null : mainBurnunit2Degree.trim();
    }

    public String getUnit2Circurt() {
        return unit2Circurt;
    }

    public void setUnit2Circurt(String unit2Circurt) {
        this.unit2Circurt = unit2Circurt == null ? null : unit2Circurt.trim();
    }

    public String getOther2Circurt() {
        return other2Circurt;
    }

    public void setOther2Circurt(String other2Circurt) {
        this.other2Circurt = other2Circurt == null ? null : other2Circurt.trim();
    }

    public String getMainBurnobject1Name() {
        return mainBurnobject1Name;
    }

    public void setMainBurnobject1Name(String mainBurnobject1Name) {
        this.mainBurnobject1Name = mainBurnobject1Name == null ? null : mainBurnobject1Name.trim();
    }

    public String getMainBurnobject1Burn() {
        return mainBurnobject1Burn;
    }

    public void setMainBurnobject1Burn(String mainBurnobject1Burn) {
        this.mainBurnobject1Burn = mainBurnobject1Burn == null ? null : mainBurnobject1Burn.trim();
    }

    public String getMainBurnobject2Name() {
        return mainBurnobject2Name;
    }

    public void setMainBurnobject2Name(String mainBurnobject2Name) {
        this.mainBurnobject2Name = mainBurnobject2Name == null ? null : mainBurnobject2Name.trim();
    }

    public String getMainBurnobject2Burn() {
        return mainBurnobject2Burn;
    }

    public void setMainBurnobject2Burn(String mainBurnobject2Burn) {
        this.mainBurnobject2Burn = mainBurnobject2Burn == null ? null : mainBurnobject2Burn.trim();
    }
}