package cn.nankai.tjxf1.entity;

import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

@Excel("表B2货车内部烧损信息")
public class B2InnerInfo {

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

    @ExcelField(value = "发动机舱点火线圈")
    private String fdjcDhxq;

    @ExcelField(value = "发动机舱清洗液罐")
    private String fdjcQxyg;

    @ExcelField(value = "发动机舱机油滤清器")
    private String fdjcJylqq;

    @ExcelField(value = "发动机舱制动液罐")
    private String fdjcZdyg;

    @ExcelField(value = "发动机舱空气滤清器")
    private String fdjcKqlqq;

    @ExcelField(value = "发动机舱助力转向液罐")
    private String fdjcZlzxyg;

    @ExcelField(value = "发动机舱真空助力器")
    private String fdjcZkzlq;

    @ExcelField(value = "发动机舱空调压缩机")
    private String fdjcKtysj;

    @ExcelField(value = "发动机舱保险盒")
    private String fdjcBxh;

    @ExcelField(value = "发动机舱ABS控制器")
    private String fdjcAbs;

    @ExcelField(value = "发动机舱变速器离合器")
    private String fdjcBsqLhq;

    @ExcelField(value = "发动机舱左前灯")
    private String fdjcZqd;

    @ExcelField(value = "发动机舱散热器")
    private String fdjcSrq;

    @ExcelField(value = "发动机舱右前灯")
    private String fdjcYqd;

    @ExcelField(value = "发动机舱冷凝器")
    private String fdjcLnq;

    @ExcelField(value = "发动机舱冷却风扇")
    private String fdjcLqfs;

    @ExcelField(value = "驾驶室仪表板")
    private String jssYbb;

    @ExcelField(value = "驾驶室接线盒")
    private String jssJxh;

    @ExcelField(value = "驾驶室转向盘")
    private String jssZxp;

    @ExcelField(value = "驾驶室手套箱")
    private String jssStx;

    @ExcelField(value = "驾驶室鼓风机")
    private String jssGfj;

    @ExcelField(value = "驾驶室驾驶位座椅")
    private String jssJswzy;

    @ExcelField(value = "驾驶室音频播放器")
    private String jssBfq;

    @ExcelField(value = "驾驶室副驾驶座椅")
    private String jssFjszy;

    @ExcelField(value = "驾驶室点烟器")
    private String jssDyq;

    @ExcelField(value = "驾驶室后排座椅")
    private String jssHpzy;

    @ExcelField(value = "驾驶室左前灯")
    private String jssZqd;

    @ExcelField(value = "驾驶室右前灯")
    private String jssYqd;

    @ExcelField(value = "驾驶室左前门")
    private String jssZqm;

    @ExcelField(value = "驾驶室右前门")
    private String jssYqm;

    @ExcelField(value = "驾驶室左后门")
    private String jssZhm;

    @ExcelField(value = "驾驶室右后门")
    private String jssYhm;

    @ExcelField(value = "车厢前板总成")
    private String cxQbzc;
    @ExcelField(value = "车厢后板总成")
    private String cxHbzc;

    @ExcelField(value = "车厢左边板总成")
    private String cxZbbzc;

    @ExcelField(value = "车厢右边板总成")
    private String cxYbbzc;

    @ExcelField(value = "车厢地板总成")
    private String cxDbzc;

    @ExcelField(value = "车厢顶板")
    private String cxDb;

    @ExcelField(value = "车厢左后车灯")
    private String cxZhcd;

    @ExcelField(value = "车厢右后车灯")
    private String cxYhcd;

    @ExcelField(value = "车厢主要物品")
    private String cxZywp;

    @ExcelField(value = "车厢烧损程度")
    private String cxSscd;

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

    public String getFdjcDhxq() {
        return fdjcDhxq;
    }

    public void setFdjcDhxq(String fdjcDhxq) {
        this.fdjcDhxq = fdjcDhxq == null ? null : fdjcDhxq.trim();
    }

    public String getFdjcQxyg() {
        return fdjcQxyg;
    }

    public void setFdjcQxyg(String fdjcQxyg) {
        this.fdjcQxyg = fdjcQxyg == null ? null : fdjcQxyg.trim();
    }

    public String getFdjcJylqq() {
        return fdjcJylqq;
    }

    public void setFdjcJylqq(String fdjcJylqq) {
        this.fdjcJylqq = fdjcJylqq == null ? null : fdjcJylqq.trim();
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

    public String getFdjcZkzlq() {
        return fdjcZkzlq;
    }

    public void setFdjcZkzlq(String fdjcZkzlq) {
        this.fdjcZkzlq = fdjcZkzlq == null ? null : fdjcZkzlq.trim();
    }

    public String getFdjcKtysj() {
        return fdjcKtysj;
    }

    public void setFdjcKtysj(String fdjcKtysj) {
        this.fdjcKtysj = fdjcKtysj == null ? null : fdjcKtysj.trim();
    }

    public String getFdjcBxh() {
        return fdjcBxh;
    }

    public void setFdjcBxh(String fdjcBxh) {
        this.fdjcBxh = fdjcBxh == null ? null : fdjcBxh.trim();
    }

    public String getFdjcAbs() {
        return fdjcAbs;
    }

    public void setFdjcAbs(String fdjcAbs) {
        this.fdjcAbs = fdjcAbs == null ? null : fdjcAbs.trim();
    }

    public String getFdjcBsqLhq() {
        return fdjcBsqLhq;
    }

    public void setFdjcBsqLhq(String fdjcBsqLhq) {
        this.fdjcBsqLhq = fdjcBsqLhq == null ? null : fdjcBsqLhq.trim();
    }

    public String getFdjcZqd() {
        return fdjcZqd;
    }

    public void setFdjcZqd(String fdjcZqd) {
        this.fdjcZqd = fdjcZqd == null ? null : fdjcZqd.trim();
    }

    public String getFdjcSrq() {
        return fdjcSrq;
    }

    public void setFdjcSrq(String fdjcSrq) {
        this.fdjcSrq = fdjcSrq == null ? null : fdjcSrq.trim();
    }

    public String getFdjcYqd() {
        return fdjcYqd;
    }

    public void setFdjcYqd(String fdjcYqd) {
        this.fdjcYqd = fdjcYqd == null ? null : fdjcYqd.trim();
    }

    public String getFdjcLnq() {
        return fdjcLnq;
    }

    public void setFdjcLnq(String fdjcLnq) {
        this.fdjcLnq = fdjcLnq == null ? null : fdjcLnq.trim();
    }

    public String getFdjcLqfs() {
        return fdjcLqfs;
    }

    public void setFdjcLqfs(String fdjcLqfs) {
        this.fdjcLqfs = fdjcLqfs == null ? null : fdjcLqfs.trim();
    }

    public String getJssYbb() {
        return jssYbb;
    }

    public void setJssYbb(String jssYbb) {
        this.jssYbb = jssYbb == null ? null : jssYbb.trim();
    }

    public String getJssJxh() {
        return jssJxh;
    }

    public void setJssJxh(String jssJxh) {
        this.jssJxh = jssJxh == null ? null : jssJxh.trim();
    }

    public String getJssZxp() {
        return jssZxp;
    }

    public void setJssZxp(String jssZxp) {
        this.jssZxp = jssZxp == null ? null : jssZxp.trim();
    }

    public String getJssStx() {
        return jssStx;
    }

    public void setJssStx(String jssStx) {
        this.jssStx = jssStx == null ? null : jssStx.trim();
    }

    public String getJssGfj() {
        return jssGfj;
    }

    public void setJssGfj(String jssGfj) {
        this.jssGfj = jssGfj == null ? null : jssGfj.trim();
    }

    public String getJssJswzy() {
        return jssJswzy;
    }

    public void setJssJswzy(String jssJswzy) {
        this.jssJswzy = jssJswzy == null ? null : jssJswzy.trim();
    }

    public String getJssBfq() {
        return jssBfq;
    }

    public void setJssBfq(String jssBfq) {
        this.jssBfq = jssBfq == null ? null : jssBfq.trim();
    }

    public String getJssFjszy() {
        return jssFjszy;
    }

    public void setJssFjszy(String jssFjszy) {
        this.jssFjszy = jssFjszy == null ? null : jssFjszy.trim();
    }

    public String getJssDyq() {
        return jssDyq;
    }

    public void setJssDyq(String jssDyq) {
        this.jssDyq = jssDyq == null ? null : jssDyq.trim();
    }

    public String getJssHpzy() {
        return jssHpzy;
    }

    public void setJssHpzy(String jssHpzy) {
        this.jssHpzy = jssHpzy == null ? null : jssHpzy.trim();
    }

    public String getJssZqd() {
        return jssZqd;
    }

    public void setJssZqd(String jssZqd) {
        this.jssZqd = jssZqd == null ? null : jssZqd.trim();
    }

    public String getJssYqd() {
        return jssYqd;
    }

    public void setJssYqd(String jssYqd) {
        this.jssYqd = jssYqd == null ? null : jssYqd.trim();
    }

    public String getJssZqm() {
        return jssZqm;
    }

    public void setJssZqm(String jssZqm) {
        this.jssZqm = jssZqm == null ? null : jssZqm.trim();
    }

    public String getJssYqm() {
        return jssYqm;
    }

    public void setJssYqm(String jssYqm) {
        this.jssYqm = jssYqm == null ? null : jssYqm.trim();
    }

    public String getJssZhm() {
        return jssZhm;
    }

    public void setJssZhm(String jssZhm) {
        this.jssZhm = jssZhm == null ? null : jssZhm.trim();
    }

    public String getJssYhm() {
        return jssYhm;
    }

    public void setJssYhm(String jssYhm) {
        this.jssYhm = jssYhm == null ? null : jssYhm.trim();
    }

    public String getCxQbzc() {
        return cxQbzc;
    }

    public void setCxQbzc(String cxQbzc) {
        this.cxQbzc = cxQbzc == null ? null : cxQbzc.trim();
    }

    public String getCxHbzc() {
        return cxHbzc;
    }

    public void setCxHbzc(String cxHbzc) {
        this.cxHbzc = cxHbzc == null ? null : cxHbzc.trim();
    }

    public String getCxZbbzc() {
        return cxZbbzc;
    }

    public void setCxZbbzc(String cxZbbzc) {
        this.cxZbbzc = cxZbbzc == null ? null : cxZbbzc.trim();
    }

    public String getCxYbbzc() {
        return cxYbbzc;
    }

    public void setCxYbbzc(String cxYbbzc) {
        this.cxYbbzc = cxYbbzc == null ? null : cxYbbzc.trim();
    }

    public String getCxDbzc() {
        return cxDbzc;
    }

    public void setCxDbzc(String cxDbzc) {
        this.cxDbzc = cxDbzc == null ? null : cxDbzc.trim();
    }

    public String getCxDb() {
        return cxDb;
    }

    public void setCxDb(String cxDb) {
        this.cxDb = cxDb == null ? null : cxDb.trim();
    }

    public String getCxZhcd() {
        return cxZhcd;
    }

    public void setCxZhcd(String cxZhcd) {
        this.cxZhcd = cxZhcd == null ? null : cxZhcd.trim();
    }

    public String getCxYhcd() {
        return cxYhcd;
    }

    public void setCxYhcd(String cxYhcd) {
        this.cxYhcd = cxYhcd == null ? null : cxYhcd.trim();
    }

    public String getCxZywp() {
        return cxZywp;
    }

    public void setCxZywp(String cxZywp) {
        this.cxZywp = cxZywp == null ? null : cxZywp.trim();
    }

    public String getCxSscd() {
        return cxSscd;
    }

    public void setCxSscd(String cxSscd) {
        this.cxSscd = cxSscd == null ? null : cxSscd.trim();
    }
}