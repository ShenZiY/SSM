package cn.nankai.tjxf1.entity;

import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

@Excel("表B5电动客车内部烧损信息")
public class B5InnerInfo {

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
    @ExcelField(value = "电池舱电池舱位置")
    private String dccDccwz;
    @ExcelField(value = "电池舱充电口位置")
    private String dccCdkwz;

    @ExcelField(value = "电池舱充电器位置")
    private String dccCdqwz;

    @ExcelField(value = "电池舱外壳材质")
    private String dccWkcz;

    @ExcelField(value = "电池舱额定电压")
    private String dccEddy;

    @ExcelField(value = "电池舱成组方式")
    private String dccCzfs;

    @ExcelField(value = "电池舱额定容量")
    private String dccEdrl;

    @ExcelField(value = "电池舱荷电状态")
    private String dccHdzt;
    @ExcelField(value = "电池舱烧损程度")
    private String dccSscd;

    @ExcelField(value = "电池舱电池类型")
    private String dccDclx;

    @ExcelField(value = "电池舱电池型号")
    private String dccDcxh;

    @ExcelField(value = "电池舱电池额定容量")
    private String dccDcedrl;

    @ExcelField(value = "电池舱电池额定电压")
    private String dccDceddy;

    @ExcelField(value = "电池管理系统位置")
    private String dcglxtWz;
    @ExcelField(value = "电池管理系统烧损程度")
    private String dcglxtSscd;

    @ExcelField(value = "发动机舱电动机")
    private String fdjcDdj;

    @ExcelField(value = "发动机舱真空泵")
    private String fdjcZkb;

    @ExcelField(value = "发动机舱电机控制器")
    private String fdjcDjkzq;

    @ExcelField(value = "发动机舱散热器")
    private String fdjcSrq;

    @ExcelField(value = "发动机舱减速箱")
    private String fdjcJsx;

    @ExcelField(value = "发动机舱冷却风扇")
    private String fdjcLqfs;

    @ExcelField(value = "发动机舱电压转换器")
    private String fdjcDyzhq;

    @ExcelField(value = "发动机舱ABS")
    private String fdjcAbs;

    @ExcelField(value = "发动机舱配电盒")
    private String fdjcPdh;

    @ExcelField(value = "发动机舱左前灯")
    private String fdjcZqd;

    @ExcelField(value = "发动机舱保险盒")
    private String fdjcBxh;

    @ExcelField(value = "发动机舱右前灯")
    private String fdjcYqd;

    @ExcelField(value = "发动机舱进气歧管")
    private String fdjcJqqg;

    @ExcelField(value = "发动机舱发动机")
    private String fdjcFddongj;

    @ExcelField(value = "发动机舱排气歧管")
    private String fdjcPqqg;

    @ExcelField(value = "发动机舱起动机")
    private String fdjcQdj;

    @ExcelField(value = "发动机舱变速器离合器")
    private String fdjcBsqLhq;

    @ExcelField(value = "发动机舱发电机")
    private String fdjcFdianj;

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
    private String cycJswzq;

    @ExcelField(value = "乘员舱点火开关")
    private String cycDhkg;

    @ExcelField(value = "乘员舱副驾驶座椅")
    private String cycFjszy;

    @ExcelField(value = "乘员舱鼓风机")
    private String cycGfj;

    @ExcelField(value = "乘员舱乘客座椅")
    private String cycCkzq;

    @ExcelField(value = "乘员舱前部地板")
    private String cycQbdb;

    @ExcelField(value = "乘员舱后部地板")
    private String cycHbdb;

    @ExcelField(value = "乘员舱左前车灯")
    private String cycZqcd;

    @ExcelField(value = "乘员舱右前车灯")
    private String cycYqcd;

    @ExcelField(value = "乘员舱左后车灯")
    private String cycZhcd;

    @ExcelField(value = "乘员舱右后车灯")
    private String cycYhcd;

    @ExcelField(value = "乘员舱车门左1")
    private String cycCmz1;

    @ExcelField(value = "乘员舱车门右1")
    private String cycCmy1;

    @ExcelField(value = "乘员舱车门右2")
    private String cycCmy2;

    @ExcelField(value = "乘员舱车门右3")
    private String cycCmy3;

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

    public String getDccDccwz() {
        return dccDccwz;
    }

    public void setDccDccwz(String dccDccwz) {
        this.dccDccwz = dccDccwz == null ? null : dccDccwz.trim();
    }

    public String getDccCdkwz() {
        return dccCdkwz;
    }

    public void setDccCdkwz(String dccCdkwz) {
        this.dccCdkwz = dccCdkwz == null ? null : dccCdkwz.trim();
    }

    public String getDccCdqwz() {
        return dccCdqwz;
    }

    public void setDccCdqwz(String dccCdqwz) {
        this.dccCdqwz = dccCdqwz == null ? null : dccCdqwz.trim();
    }

    public String getDccWkcz() {
        return dccWkcz;
    }

    public void setDccWkcz(String dccWkcz) {
        this.dccWkcz = dccWkcz == null ? null : dccWkcz.trim();
    }

    public String getDccEddy() {
        return dccEddy;
    }

    public void setDccEddy(String dccEddy) {
        this.dccEddy = dccEddy == null ? null : dccEddy.trim();
    }

    public String getDccCzfs() {
        return dccCzfs;
    }

    public void setDccCzfs(String dccCzfs) {
        this.dccCzfs = dccCzfs == null ? null : dccCzfs.trim();
    }

    public String getDccEdrl() {
        return dccEdrl;
    }

    public void setDccEdrl(String dccEdrl) {
        this.dccEdrl = dccEdrl == null ? null : dccEdrl.trim();
    }

    public String getDccHdzt() {
        return dccHdzt;
    }

    public void setDccHdzt(String dccHdzt) {
        this.dccHdzt = dccHdzt == null ? null : dccHdzt.trim();
    }

    public String getDccSscd() {
        return dccSscd;
    }

    public void setDccSscd(String dccSscd) {
        this.dccSscd = dccSscd == null ? null : dccSscd.trim();
    }

    public String getDccDclx() {
        return dccDclx;
    }

    public void setDccDclx(String dccDclx) {
        this.dccDclx = dccDclx == null ? null : dccDclx.trim();
    }

    public String getDccDcxh() {
        return dccDcxh;
    }

    public void setDccDcxh(String dccDcxh) {
        this.dccDcxh = dccDcxh == null ? null : dccDcxh.trim();
    }

    public String getDccDcedrl() {
        return dccDcedrl;
    }

    public void setDccDcedrl(String dccDcedrl) {
        this.dccDcedrl = dccDcedrl == null ? null : dccDcedrl.trim();
    }

    public String getDccDceddy() {
        return dccDceddy;
    }

    public void setDccDceddy(String dccDceddy) {
        this.dccDceddy = dccDceddy == null ? null : dccDceddy.trim();
    }

    public String getDcglxtWz() {
        return dcglxtWz;
    }

    public void setDcglxtWz(String dcglxtWz) {
        this.dcglxtWz = dcglxtWz == null ? null : dcglxtWz.trim();
    }

    public String getDcglxtSscd() {
        return dcglxtSscd;
    }

    public void setDcglxtSscd(String dcglxtSscd) {
        this.dcglxtSscd = dcglxtSscd == null ? null : dcglxtSscd.trim();
    }

    public String getFdjcDdj() {
        return fdjcDdj;
    }

    public void setFdjcDdj(String fdjcDdj) {
        this.fdjcDdj = fdjcDdj == null ? null : fdjcDdj.trim();
    }

    public String getFdjcZkb() {
        return fdjcZkb;
    }

    public void setFdjcZkb(String fdjcZkb) {
        this.fdjcZkb = fdjcZkb == null ? null : fdjcZkb.trim();
    }

    public String getFdjcDjkzq() {
        return fdjcDjkzq;
    }

    public void setFdjcDjkzq(String fdjcDjkzq) {
        this.fdjcDjkzq = fdjcDjkzq == null ? null : fdjcDjkzq.trim();
    }

    public String getFdjcSrq() {
        return fdjcSrq;
    }

    public void setFdjcSrq(String fdjcSrq) {
        this.fdjcSrq = fdjcSrq == null ? null : fdjcSrq.trim();
    }

    public String getFdjcJsx() {
        return fdjcJsx;
    }

    public void setFdjcJsx(String fdjcJsx) {
        this.fdjcJsx = fdjcJsx == null ? null : fdjcJsx.trim();
    }

    public String getFdjcLqfs() {
        return fdjcLqfs;
    }

    public void setFdjcLqfs(String fdjcLqfs) {
        this.fdjcLqfs = fdjcLqfs == null ? null : fdjcLqfs.trim();
    }

    public String getFdjcDyzhq() {
        return fdjcDyzhq;
    }

    public void setFdjcDyzhq(String fdjcDyzhq) {
        this.fdjcDyzhq = fdjcDyzhq == null ? null : fdjcDyzhq.trim();
    }

    public String getFdjcAbs() {
        return fdjcAbs;
    }

    public void setFdjcAbs(String fdjcAbs) {
        this.fdjcAbs = fdjcAbs == null ? null : fdjcAbs.trim();
    }

    public String getFdjcPdh() {
        return fdjcPdh;
    }

    public void setFdjcPdh(String fdjcPdh) {
        this.fdjcPdh = fdjcPdh == null ? null : fdjcPdh.trim();
    }

    public String getFdjcZqd() {
        return fdjcZqd;
    }

    public void setFdjcZqd(String fdjcZqd) {
        this.fdjcZqd = fdjcZqd == null ? null : fdjcZqd.trim();
    }

    public String getFdjcBxh() {
        return fdjcBxh;
    }

    public void setFdjcBxh(String fdjcBxh) {
        this.fdjcBxh = fdjcBxh == null ? null : fdjcBxh.trim();
    }

    public String getFdjcYqd() {
        return fdjcYqd;
    }

    public void setFdjcYqd(String fdjcYqd) {
        this.fdjcYqd = fdjcYqd == null ? null : fdjcYqd.trim();
    }

    public String getFdjcJqqg() {
        return fdjcJqqg;
    }

    public void setFdjcJqqg(String fdjcJqqg) {
        this.fdjcJqqg = fdjcJqqg == null ? null : fdjcJqqg.trim();
    }

    public String getFdjcFddongj() {
        return fdjcFddongj;
    }

    public void setFdjcFddongj(String fdjcFddongj) {
        this.fdjcFddongj = fdjcFddongj == null ? null : fdjcFddongj.trim();
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

    public String getFdjcBsqLhq() {
        return fdjcBsqLhq;
    }

    public void setFdjcBsqLhq(String fdjcBsqLhq) {
        this.fdjcBsqLhq = fdjcBsqLhq == null ? null : fdjcBsqLhq.trim();
    }

    public String getFdjcFdianj() {
        return fdjcFdianj;
    }

    public void setFdjcFdianj(String fdjcFdianj) {
        this.fdjcFdianj = fdjcFdianj == null ? null : fdjcFdianj.trim();
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

    public String getCycJswzq() {
        return cycJswzq;
    }

    public void setCycJswzq(String cycJswzq) {
        this.cycJswzq = cycJswzq == null ? null : cycJswzq.trim();
    }

    public String getCycDhkg() {
        return cycDhkg;
    }

    public void setCycDhkg(String cycDhkg) {
        this.cycDhkg = cycDhkg == null ? null : cycDhkg.trim();
    }

    public String getCycFjszy() {
        return cycFjszy;
    }

    public void setCycFjszy(String cycFjszy) {
        this.cycFjszy = cycFjszy == null ? null : cycFjszy.trim();
    }

    public String getCycGfj() {
        return cycGfj;
    }

    public void setCycGfj(String cycGfj) {
        this.cycGfj = cycGfj == null ? null : cycGfj.trim();
    }

    public String getCycCkzq() {
        return cycCkzq;
    }

    public void setCycCkzq(String cycCkzq) {
        this.cycCkzq = cycCkzq == null ? null : cycCkzq.trim();
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

    public String getCycYqcd() {
        return cycYqcd;
    }

    public void setCycYqcd(String cycYqcd) {
        this.cycYqcd = cycYqcd == null ? null : cycYqcd.trim();
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

    public String getCycCmz1() {
        return cycCmz1;
    }

    public void setCycCmz1(String cycCmz1) {
        this.cycCmz1 = cycCmz1 == null ? null : cycCmz1.trim();
    }

    public String getCycCmy1() {
        return cycCmy1;
    }

    public void setCycCmy1(String cycCmy1) {
        this.cycCmy1 = cycCmy1 == null ? null : cycCmy1.trim();
    }

    public String getCycCmy2() {
        return cycCmy2;
    }

    public void setCycCmy2(String cycCmy2) {
        this.cycCmy2 = cycCmy2 == null ? null : cycCmy2.trim();
    }

    public String getCycCmy3() {
        return cycCmy3;
    }

    public void setCycCmy3(String cycCmy3) {
        this.cycCmy3 = cycCmy3 == null ? null : cycCmy3.trim();
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