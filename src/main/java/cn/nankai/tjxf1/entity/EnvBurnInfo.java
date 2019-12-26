package cn.nankai.tjxf1.entity;


import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;

@Excel("汽车周围烧损信息")
public class EnvBurnInfo {

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

    @ExcelField(value = "前方物体一")
    private String front1;

    @ExcelField(value = "前方物体一烧损程度")
    private String front1Burn;

    @ExcelField(value = "左侧物体一")
    private String left1;

    @ExcelField(value = "左侧物体一烧损程度")
    private String left1Burn;

    @ExcelField(value = "右侧物体一")
    private String right1;

    @ExcelField(value = "右侧物体一烧损情况")
    private String right1Burn;

    @ExcelField(value = "上方物体一")
    private String up1;

    @ExcelField(value = "上方物体一烧损情况")
    private String up1Burn;

    @ExcelField(value = "地面物体一")
    private String down1;

    @ExcelField(value = "地面物体一烧损情况")
    private String down1Burn;

    @ExcelField(value = "前方物体二")
    private String front2;

    @ExcelField(value = "前方物体二烧损程度")
    private String front2Burn;

    @ExcelField(value = "左侧物体二")
    private String left2;

    @ExcelField(value = "左侧物体二烧损程度")
    private String left2Burn;

    @ExcelField(value = "右侧物体二")
    private String right2;

    @ExcelField(value = "右侧物体二烧损情况")
    private String right2Burn;

    @ExcelField(value = "上方物体二")
    private String up2;

    @ExcelField(value = "上方物体二烧损情况")
    private String up2Burn;

    @ExcelField(value = "地面物体二")
    private String down2;

    @ExcelField(value = "地面物体二烧损情况")
    private String down2Burn;

    @ExcelField(value = "后方物体一")
    private String back1;
    @ExcelField(value = "后方物体一烧损情况")
    private String back1Burn;
    @ExcelField(value = "后方物体二")
    private String back2;
    @ExcelField(value = "后方物体二烧损情况")
    private String back2Burn;

    public String getBack1() {
        return back1;
    }

    public void setBack1(String back1) {
        this.back1 = back1;
    }

    public String getBack1Burn() {
        return back1Burn;
    }

    public void setBack1Burn(String back1Burn) {
        this.back1Burn = back1Burn;
    }

    public String getBack2() {
        return back2;
    }

    public void setBack2(String back2) {
        this.back2 = back2;
    }

    public String getBack2Burn() {
        return back2Burn;
    }

    public void setBack2Burn(String back2Burn) {
        this.back2Burn = back2Burn;
    }





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

    public String getFront1() {
        return front1;
    }

    public void setFront1(String front1) {
        this.front1 = front1 == null ? null : front1.trim();
    }

    public String getFront1Burn() {
        return front1Burn;
    }

    public void setFront1Burn(String front1Burn) {
        this.front1Burn = front1Burn == null ? null : front1Burn.trim();
    }

    public String getLeft1() {
        return left1;
    }

    public void setLeft1(String left1) {
        this.left1 = left1 == null ? null : left1.trim();
    }

    public String getLeft1Burn() {
        return left1Burn;
    }

    public void setLeft1Burn(String left1Burn) {
        this.left1Burn = left1Burn == null ? null : left1Burn.trim();
    }

    public String getRight1() {
        return right1;
    }

    public void setRight1(String right1) {
        this.right1 = right1 == null ? null : right1.trim();
    }

    public String getRight1Burn() {
        return right1Burn;
    }

    public void setRight1Burn(String right1Burn) {
        this.right1Burn = right1Burn == null ? null : right1Burn.trim();
    }

    public String getUp1() {
        return up1;
    }

    public void setUp1(String up1) {
        this.up1 = up1 == null ? null : up1.trim();
    }

    public String getUp1Burn() {
        return up1Burn;
    }

    public void setUp1Burn(String up1Burn) {
        this.up1Burn = up1Burn == null ? null : up1Burn.trim();
    }

    public String getDown1() {
        return down1;
    }

    public void setDown1(String down1) {
        this.down1 = down1 == null ? null : down1.trim();
    }

    public String getDown1Burn() {
        return down1Burn;
    }

    public void setDown1Burn(String down1Burn) {
        this.down1Burn = down1Burn == null ? null : down1Burn.trim();
    }

    public String getFront2() {
        return front2;
    }

    public void setFront2(String front2) {
        this.front2 = front2 == null ? null : front2.trim();
    }

    public String getFront2Burn() {
        return front2Burn;
    }

    public void setFront2Burn(String front2Burn) {
        this.front2Burn = front2Burn == null ? null : front2Burn.trim();
    }

    public String getLeft2() {
        return left2;
    }

    public void setLeft2(String left2) {
        this.left2 = left2 == null ? null : left2.trim();
    }

    public String getLeft2Burn() {
        return left2Burn;
    }

    public void setLeft2Burn(String left2Burn) {
        this.left2Burn = left2Burn == null ? null : left2Burn.trim();
    }

    public String getRight2() {
        return right2;
    }

    public void setRight2(String right2) {
        this.right2 = right2 == null ? null : right2.trim();
    }

    public String getRight2Burn() {
        return right2Burn;
    }

    public void setRight2Burn(String right2Burn) {
        this.right2Burn = right2Burn == null ? null : right2Burn.trim();
    }

    public String getUp2() {
        return up2;
    }

    public void setUp2(String up2) {
        this.up2 = up2 == null ? null : up2.trim();
    }

    public String getUp2Burn() {
        return up2Burn;
    }

    public void setUp2Burn(String up2Burn) {
        this.up2Burn = up2Burn == null ? null : up2Burn.trim();
    }

    public String getDown2() {
        return down2;
    }

    public void setDown2(String down2) {
        this.down2 = down2 == null ? null : down2.trim();
    }

    public String getDown2Burn() {
        return down2Burn;
    }

    public void setDown2Burn(String down2Burn) {
        this.down2Burn = down2Burn == null ? null : down2Burn.trim();
    }
}