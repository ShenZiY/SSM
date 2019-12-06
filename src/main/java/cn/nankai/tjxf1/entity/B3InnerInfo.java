package cn.nankai.tjxf1.entity;


import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

@Excel("表B3客车内部烧损信息")
public class B3InnerInfo {

    @ExcelField(value = "车辆编码")
    private Integer carId;

    @ExcelField(value = "事故编码")
    private Integer accId;

    @ExcelField(value = "车辆识别代码")
    private String vin;
    @ExcelField(value = "蓄电池位置")
    private String xdcWz;
    @ExcelField(value = "蓄电池电压")
    private String xdcDy;
    @ExcelField(value = "蓄电池烧损程度")
    private String xdcSscd;

    @ExcelField(value = "油箱加油口位置")
    private String oiltankPos;

    @ExcelField(value = "油箱材质")
    private String oiltankMaterial;

    @ExcelField(value = "油箱油量")
    private String oiltankVol;

    @ExcelField(value = "油箱烧损程度")
    private String oiltankBreakDegree;

    @ExcelField(value = "发动机舱发动机")
    private String fdjcFdongj;

    @ExcelField(value = "发动机舱进气歧管")
    private String fdjcJqqg;

    @ExcelField(value = "发动机舱发电机")
    private String fdjcFdianj;

    @ExcelField(value = "发动机舱排气歧管")
    private String fdjcPqqg;

    @ExcelField(value = "发动机舱起动机")
    private String fdjcQdj;

    @ExcelField(value = "发动机舱涡轮增压器")
    private String fdjcWlzyq;

    @ExcelField(value = "发动机舱柴油泵")
    private String fdjcCyb;

    @ExcelField(value = "发动机舱冷却液罐")
    private String fdjcLqyg;

    @ExcelField(value = "缓速器")
    private String fdjcHsq;

    @ExcelField(value = "发动机舱清洗液罐")
    private String fdjcQxyg;

    @ExcelField(value = "发动机舱点火线圈")
    private String fdjcDhxq;

    @ExcelField(value = "发动机舱制动液罐")
    private String fdjcZdyg;

    @ExcelField(value = "发动机舱空气滤清器")
    private String fdjcKqlqq;

    @ExcelField(value = "发动机舱助力转向液罐")
    private String fdjcZlzxyg;

    @ExcelField(value = "发动机舱机油滤清器")
    private String fdjcJylqq;

    @ExcelField(value = "发动机舱空调压缩机")
    private String fdjcKtysj;

    @ExcelField(value = "发动机舱真空助力器")
    private String fdjcZkzlq;

    @ExcelField(value = "发动机舱ABS控制器")
    private String fdjcAbs;

    @ExcelField(value = "发动机舱保险盒")
    private String fdjcBxh;

    @ExcelField(value = "发动机舱空调压缩机")
    private String fdjcKqysj;

    @ExcelField(value = "发动机舱变速器离合器")
    private String fdjcBsqLhq;

    @ExcelField(value = "发动机舱冷却风扇")
    private String fdjcLqfs;

    @ExcelField(value = "发动机舱散热器")
    private String fdjcSrq;

    @ExcelField(value = "电源总开关")
    private String fdjcDyzkg;

    @ExcelField(value = "发动机舱冷凝器")
    private String fdjcLnq;

    @ExcelField(value = "发动机舱接线盒")
    private String fdjcJxh;

    @ExcelField(value = "乘员舱仪表板")
    private String cycYbb;

    @ExcelField(value = "乘员舱播放器")
    private String cycBfq;

    @ExcelField(value = "乘员舱接线盒")
    private String cycJxh;

    @ExcelField(value = "乘员舱监视器")
    private String cycJsq;

    @ExcelField(value = "乘员舱转向盘")
    private String cycZxp;

    @ExcelField(value = "乘员舱驾驶位座椅")
    private String cycJswzy;

    @ExcelField(value = "乘员舱点火开关")
    private String cycDhkg;

    @ExcelField(value = "乘员舱副驾驶座椅")
    private String cycFjszq;

    @ExcelField(value = "乘员舱鼓风机")
    private String cycGfj;

    @ExcelField(value = "乘员舱乘客座椅")
    private String cycCkzy;

    @ExcelField(value = "乘员舱前部地板")
    private String cycQbdb;

    @ExcelField(value = "乘员舱后部地板")
    private String cycHbdb;

    @ExcelField(value = "乘员舱左前车灯")
    private String cycZqcd;

    @ExcelField(value = "乘员舱右前车灯")
    private String cycYqzd;

    @ExcelField(value = "乘员舱左后车灯")
    private String cycZhcd;

    @ExcelField(value = "乘员舱右后车灯")
    private String cycYhcd;

    @ExcelField(value = "乘员舱左一车门")
    private String cycZ1;

    @ExcelField(value = "乘员舱右一车门")
    private String cycY1;

    @ExcelField(value = "乘员舱右二车门")
    private String cycY2;

    @ExcelField(value = "乘员舱右三车门")
    private String cycY3;

    @ExcelField(value = "乘员舱主要物品")
    private String cycZywp;

    @ExcelField(value = "乘员舱烧损程度")
    private String cycSscd;

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

    public String getXdcWz() {
        return xdcWz;
    }

    public void setXdcWz(String xdcWz) {
        this.xdcWz = xdcWz == null ? null : xdcWz.trim();
    }

    public String getXdcDy() {
        return xdcDy;
    }

    public void setXdcDy(String xdcDy) {
        this.xdcDy = xdcDy == null ? null : xdcDy.trim();
    }

    public String getXdcSscd() {
        return xdcSscd;
    }

    public void setXdcSscd(String xdcSscd) {
        this.xdcSscd = xdcSscd == null ? null : xdcSscd.trim();
    }

    public String getOiltankPos() {
        return oiltankPos;
    }

    public void setOiltankPos(String oiltankPos) {
        this.oiltankPos = oiltankPos == null ? null : oiltankPos.trim();
    }

    public String getOiltankMaterial() {
        return oiltankMaterial;
    }

    public void setOiltankMaterial(String oiltankMaterial) {
        this.oiltankMaterial = oiltankMaterial == null ? null : oiltankMaterial.trim();
    }

    public String getOiltankVol() {
        return oiltankVol;
    }

    public void setOiltankVol(String oiltankVol) {
        this.oiltankVol = oiltankVol == null ? null : oiltankVol.trim();
    }

    public String getOiltankBreakDegree() {
        return oiltankBreakDegree;
    }

    public void setOiltankBreakDegree(String oiltankBreakDegree) {
        this.oiltankBreakDegree = oiltankBreakDegree == null ? null : oiltankBreakDegree.trim();
    }

    public String getFdjcFdongj() {
        return fdjcFdongj;
    }

    public void setFdjcFdongj(String fdjcFdongj) {
        this.fdjcFdongj = fdjcFdongj == null ? null : fdjcFdongj.trim();
    }

    public String getFdjcJqqg() {
        return fdjcJqqg;
    }

    public void setFdjcJqqg(String fdjcJqqg) {
        this.fdjcJqqg = fdjcJqqg == null ? null : fdjcJqqg.trim();
    }

    public String getFdjcFdianj() {
        return fdjcFdianj;
    }

    public void setFdjcFdianj(String fdjcFdianj) {
        this.fdjcFdianj = fdjcFdianj == null ? null : fdjcFdianj.trim();
    }

    public String getFdjcPqqg() {
        return fdjcPqqg;
    }

    public void setFdjcPqqg(String fdjcPqqg) {
        this.fdjcPqqg = fdjcPqqg == null ? null : fdjcPqqg.trim();
    }

    public String getFdjcQdj() {
        return fdjcQdj;
    }

    public void setFdjcQdj(String fdjcQdj) {
        this.fdjcQdj = fdjcQdj == null ? null : fdjcQdj.trim();
    }

    public String getFdjcWlzyq() {
        return fdjcWlzyq;
    }

    public void setFdjcWlzyq(String fdjcWlzyq) {
        this.fdjcWlzyq = fdjcWlzyq == null ? null : fdjcWlzyq.trim();
    }

    public String getFdjcCyb() {
        return fdjcCyb;
    }

    public void setFdjcCyb(String fdjcCyb) {
        this.fdjcCyb = fdjcCyb == null ? null : fdjcCyb.trim();
    }

    public String getFdjcLqyg() {
        return fdjcLqyg;
    }

    public void setFdjcLqyg(String fdjcLqyg) {
        this.fdjcLqyg = fdjcLqyg == null ? null : fdjcLqyg.trim();
    }

    public String getFdjcHsq() {
        return fdjcHsq;
    }

    public void setFdjcHsq(String fdjcHsq) {
        this.fdjcHsq = fdjcHsq == null ? null : fdjcHsq.trim();
    }

    public String getFdjcQxyg() {
        return fdjcQxyg;
    }

    public void setFdjcQxyg(String fdjcQxyg) {
        this.fdjcQxyg = fdjcQxyg == null ? null : fdjcQxyg.trim();
    }

    public String getFdjcDhxq() {
        return fdjcDhxq;
    }

    public void setFdjcDhxq(String fdjcDhxq) {
        this.fdjcDhxq = fdjcDhxq == null ? null : fdjcDhxq.trim();
    }

    public String getFdjcZdyg() {
        return fdjcZdyg;
    }

    public void setFdjcZdyg(String fdjcZdyg) {
        this.fdjcZdyg = fdjcZdyg == null ? null : fdjcZdyg.trim();
    }

    public String getFdjcKqlqq() {
        return fdjcKqlqq;
    }

    public void setFdjcKqlqq(String fdjcKqlqq) {
        this.fdjcKqlqq = fdjcKqlqq == null ? null : fdjcKqlqq.trim();
    }

    public String getFdjcZlzxyg() {
        return fdjcZlzxyg;
    }

    public void setFdjcZlzxyg(String fdjcZlzxyg) {
        this.fdjcZlzxyg = fdjcZlzxyg == null ? null : fdjcZlzxyg.trim();
    }

    public String getFdjcJylqq() {
        return fdjcJylqq;
    }

    public void setFdjcJylqq(String fdjcJylqq) {
        this.fdjcJylqq = fdjcJylqq == null ? null : fdjcJylqq.trim();
    }

    public String getFdjcKtysj() {
        return fdjcKtysj;
    }

    public void setFdjcKtysj(String fdjcKtysj) {
        this.fdjcKtysj = fdjcKtysj == null ? null : fdjcKtysj.trim();
    }

    public String getFdjcZkzlq() {
        return fdjcZkzlq;
    }

    public void setFdjcZkzlq(String fdjcZkzlq) {
        this.fdjcZkzlq = fdjcZkzlq == null ? null : fdjcZkzlq.trim();
    }

    public String getFdjcAbs() {
        return fdjcAbs;
    }

    public void setFdjcAbs(String fdjcAbs) {
        this.fdjcAbs = fdjcAbs == null ? null : fdjcAbs.trim();
    }

    public String getFdjcBxh() {
        return fdjcBxh;
    }

    public void setFdjcBxh(String fdjcBxh) {
        this.fdjcBxh = fdjcBxh == null ? null : fdjcBxh.trim();
    }

    public String getFdjcKqysj() {
        return fdjcKqysj;
    }

    public void setFdjcKqysj(String fdjcKqysj) {
        this.fdjcKqysj = fdjcKqysj == null ? null : fdjcKqysj.trim();
    }

    public String getFdjcBsqLhq() {
        return fdjcBsqLhq;
    }

    public void setFdjcBsqLhq(String fdjcBsqLhq) {
        this.fdjcBsqLhq = fdjcBsqLhq == null ? null : fdjcBsqLhq.trim();
    }

    public String getFdjcLqfs() {
        return fdjcLqfs;
    }

    public void setFdjcLqfs(String fdjcLqfs) {
        this.fdjcLqfs = fdjcLqfs == null ? null : fdjcLqfs.trim();
    }

    public String getFdjcSrq() {
        return fdjcSrq;
    }

    public void setFdjcSrq(String fdjcSrq) {
        this.fdjcSrq = fdjcSrq == null ? null : fdjcSrq.trim();
    }

    public String getFdjcDyzkg() {
        return fdjcDyzkg;
    }

    public void setFdjcDyzkg(String fdjcDyzkg) {
        this.fdjcDyzkg = fdjcDyzkg == null ? null : fdjcDyzkg.trim();
    }

    public String getFdjcLnq() {
        return fdjcLnq;
    }

    public void setFdjcLnq(String fdjcLnq) {
        this.fdjcLnq = fdjcLnq == null ? null : fdjcLnq.trim();
    }

    public String getFdjcJxh() {
        return fdjcJxh;
    }

    public void setFdjcJxh(String fdjcJxh) {
        this.fdjcJxh = fdjcJxh == null ? null : fdjcJxh.trim();
    }

    public String getCycYbb() {
        return cycYbb;
    }

    public void setCycYbb(String cycYbb) {
        this.cycYbb = cycYbb == null ? null : cycYbb.trim();
    }

    public String getCycBfq() {
        return cycBfq;
    }

    public void setCycBfq(String cycBfq) {
        this.cycBfq = cycBfq == null ? null : cycBfq.trim();
    }

    public String getCycJxh() {
        return cycJxh;
    }

    public void setCycJxh(String cycJxh) {
        this.cycJxh = cycJxh == null ? null : cycJxh.trim();
    }

    public String getCycJsq() {
        return cycJsq;
    }

    public void setCycJsq(String cycJsq) {
        this.cycJsq = cycJsq == null ? null : cycJsq.trim();
    }

    public String getCycZxp() {
        return cycZxp;
    }

    public void setCycZxp(String cycZxp) {
        this.cycZxp = cycZxp == null ? null : cycZxp.trim();
    }

    public String getCycJswzy() {
        return cycJswzy;
    }

    public void setCycJswzy(String cycJswzy) {
        this.cycJswzy = cycJswzy == null ? null : cycJswzy.trim();
    }

    public String getCycDhkg() {
        return cycDhkg;
    }

    public void setCycDhkg(String cycDhkg) {
        this.cycDhkg = cycDhkg == null ? null : cycDhkg.trim();
    }

    public String getCycFjszq() {
        return cycFjszq;
    }

    public void setCycFjszq(String cycFjszq) {
        this.cycFjszq = cycFjszq == null ? null : cycFjszq.trim();
    }

    public String getCycGfj() {
        return cycGfj;
    }

    public void setCycGfj(String cycGfj) {
        this.cycGfj = cycGfj == null ? null : cycGfj.trim();
    }

    public String getCycCkzy() {
        return cycCkzy;
    }

    public void setCycCkzy(String cycCkzy) {
        this.cycCkzy = cycCkzy == null ? null : cycCkzy.trim();
    }

    public String getCycQbdb() {
        return cycQbdb;
    }

    public void setCycQbdb(String cycQbdb) {
        this.cycQbdb = cycQbdb == null ? null : cycQbdb.trim();
    }

    public String getCycHbdb() {
        return cycHbdb;
    }

    public void setCycHbdb(String cycHbdb) {
        this.cycHbdb = cycHbdb == null ? null : cycHbdb.trim();
    }

    public String getCycZqcd() {
        return cycZqcd;
    }

    public void setCycZqcd(String cycZqcd) {
        this.cycZqcd = cycZqcd == null ? null : cycZqcd.trim();
    }

    public String getCycYqzd() {
        return cycYqzd;
    }

    public void setCycYqzd(String cycYqzd) {
        this.cycYqzd = cycYqzd == null ? null : cycYqzd.trim();
    }

    public String getCycZhcd() {
        return cycZhcd;
    }

    public void setCycZhcd(String cycZhcd) {
        this.cycZhcd = cycZhcd == null ? null : cycZhcd.trim();
    }

    public String getCycYhcd() {
        return cycYhcd;
    }

    public void setCycYhcd(String cycYhcd) {
        this.cycYhcd = cycYhcd == null ? null : cycYhcd.trim();
    }

    public String getCycZ1() {
        return cycZ1;
    }

    public void setCycZ1(String cycZ1) {
        this.cycZ1 = cycZ1 == null ? null : cycZ1.trim();
    }

    public String getCycY1() {
        return cycY1;
    }

    public void setCycY1(String cycY1) {
        this.cycY1 = cycY1 == null ? null : cycY1.trim();
    }

    public String getCycY2() {
        return cycY2;
    }

    public void setCycY2(String cycY2) {
        this.cycY2 = cycY2 == null ? null : cycY2.trim();
    }

    public String getCycY3() {
        return cycY3;
    }

    public void setCycY3(String cycY3) {
        this.cycY3 = cycY3 == null ? null : cycY3.trim();
    }

    public String getCycZywp() {
        return cycZywp;
    }

    public void setCycZywp(String cycZywp) {
        this.cycZywp = cycZywp == null ? null : cycZywp.trim();
    }

    public String getCycSscd() {
        return cycSscd;
    }

    public void setCycSscd(String cycSscd) {
        this.cycSscd = cycSscd == null ? null : cycSscd.trim();
    }
}