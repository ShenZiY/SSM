package cn.nankai.tjxf1.entity;

import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

@Excel("表B4电动汽车内部烧损信息")
public class B4InnerInfo {

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

    @ExcelField(value = "电池舱快充电口位置")
    private String dccKcdkwz;

    @ExcelField(value = "电池舱慢充电口位置")
    private String dccMcdkwz;

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

    @ExcelField(value = "电池舱上烧损程度")
    private String dccSsscd;

    @ExcelField(value = "电池舱下烧损程度")
    private String dccXsscd;

    @ExcelField(value = "电池舱左烧损程度")
    private String dccZsscd;

    @ExcelField(value = "电池舱右烧损程度")
    private String dccYsscd;

    @ExcelField(value = "电池舱前烧损程度")
    private String dccQsscd;

    @ExcelField(value = "电池舱后烧损程度")
    private String dccHsscd;

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

    @ExcelField(value = "驾驶室仪表板")
    private String jssYbb;

    @ExcelField(value = "驾驶室点烟器")
    private String jssDyq;

    @ExcelField(value = "驾驶室转向盘")
    private String jssZxp;

    @ExcelField(value = "驾驶室手套箱")
    private String jssStx;

    @ExcelField(value = "驾驶室中央接线盒")
    private String jssZyjxh;

    @ExcelField(value = "驾驶室中央扶手箱")
    private String jssZyfsx;

    @ExcelField(value = "驾驶室点火开关")
    private String jssDhkg;

    @ExcelField(value = "驾驶室驾驶位座椅")
    private String jssJswzy;

    @ExcelField(value = "驾驶室音频播放器")
    private String jssBfq;

    @ExcelField(value = "驾驶室副驾驶座椅")
    private String jssFjszy;

    @ExcelField(value = "驾驶室鼓风机")
    private String jssGfj;

    @ExcelField(value = "驾驶室后排座椅")
    private String jssHpzy;

    @ExcelField(value = "驾驶室左前门")
    private String jssZqm;

    @ExcelField(value = "驾驶室右前门")
    private String jssYqm;

    @ExcelField(value = "驾驶室左后门")
    private String jssZhm;

    @ExcelField(value = "驾驶室右后门")
    private String jssYhm;

    @ExcelField(value = "后备箱左后车灯")
    private String hbxZhcd;

    @ExcelField(value = "后备箱右后车灯")
    private String hbxYhcd;

    @ExcelField(value = "后备箱主要物品")
    private String hbxZywp;

    @ExcelField(value = "后备箱烧损程度")
    private String hbxSscd;

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

    public String getDccKcdkwz() {
        return dccKcdkwz;
    }

    public void setDccKcdkwz(String dccKcdkwz) {
        this.dccKcdkwz = dccKcdkwz == null ? null : dccKcdkwz.trim();
    }

    public String getDccMcdkwz() {
        return dccMcdkwz;
    }

    public void setDccMcdkwz(String dccMcdkwz) {
        this.dccMcdkwz = dccMcdkwz == null ? null : dccMcdkwz.trim();
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

    public String getDccSsscd() {
        return dccSsscd;
    }

    public void setDccSsscd(String dccSsscd) {
        this.dccSsscd = dccSsscd == null ? null : dccSsscd.trim();
    }

    public String getDccXsscd() {
        return dccXsscd;
    }

    public void setDccXsscd(String dccXsscd) {
        this.dccXsscd = dccXsscd == null ? null : dccXsscd.trim();
    }

    public String getDccZsscd() {
        return dccZsscd;
    }

    public void setDccZsscd(String dccZsscd) {
        this.dccZsscd = dccZsscd == null ? null : dccZsscd.trim();
    }

    public String getDccYsscd() {
        return dccYsscd;
    }

    public void setDccYsscd(String dccYsscd) {
        this.dccYsscd = dccYsscd == null ? null : dccYsscd.trim();
    }

    public String getDccQsscd() {
        return dccQsscd;
    }

    public void setDccQsscd(String dccQsscd) {
        this.dccQsscd = dccQsscd == null ? null : dccQsscd.trim();
    }

    public String getDccHsscd() {
        return dccHsscd;
    }

    public void setDccHsscd(String dccHsscd) {
        this.dccHsscd = dccHsscd == null ? null : dccHsscd.trim();
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

    public String getJssYbb() {
        return jssYbb;
    }

    public void setJssYbb(String jssYbb) {
        this.jssYbb = jssYbb == null ? null : jssYbb.trim();
    }

    public String getJssDyq() {
        return jssDyq;
    }

    public void setJssDyq(String jssDyq) {
        this.jssDyq = jssDyq == null ? null : jssDyq.trim();
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

    public String getJssZyjxh() {
        return jssZyjxh;
    }

    public void setJssZyjxh(String jssZyjxh) {
        this.jssZyjxh = jssZyjxh == null ? null : jssZyjxh.trim();
    }

    public String getJssZyfsx() {
        return jssZyfsx;
    }

    public void setJssZyfsx(String jssZyfsx) {
        this.jssZyfsx = jssZyfsx == null ? null : jssZyfsx.trim();
    }

    public String getJssDhkg() {
        return jssDhkg;
    }

    public void setJssDhkg(String jssDhkg) {
        this.jssDhkg = jssDhkg == null ? null : jssDhkg.trim();
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

    public String getJssGfj() {
        return jssGfj;
    }

    public void setJssGfj(String jssGfj) {
        this.jssGfj = jssGfj == null ? null : jssGfj.trim();
    }

    public String getJssHpzy() {
        return jssHpzy;
    }

    public void setJssHpzy(String jssHpzy) {
        this.jssHpzy = jssHpzy == null ? null : jssHpzy.trim();
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

    public String getHbxZhcd() {
        return hbxZhcd;
    }

    public void setHbxZhcd(String hbxZhcd) {
        this.hbxZhcd = hbxZhcd == null ? null : hbxZhcd.trim();
    }

    public String getHbxYhcd() {
        return hbxYhcd;
    }

    public void setHbxYhcd(String hbxYhcd) {
        this.hbxYhcd = hbxYhcd == null ? null : hbxYhcd.trim();
    }

    public String getHbxZywp() {
        return hbxZywp;
    }

    public void setHbxZywp(String hbxZywp) {
        this.hbxZywp = hbxZywp == null ? null : hbxZywp.trim();
    }

    public String getHbxSscd() {
        return hbxSscd;
    }

    public void setHbxSscd(String hbxSscd) {
        this.hbxSscd = hbxSscd == null ? null : hbxSscd.trim();
    }
}