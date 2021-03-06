package cn.nankai.tjxf1.controller;

import cn.nankai.tjxf1.entity.*;
import cn.nankai.tjxf1.service.BaseInfoService;
import cn.nankai.tjxf1.service.UploadService;
import com.google.common.collect.Lists;
import com.wuwenze.poi.ExcelKit;
import com.wuwenze.poi.handler.ExcelReadHandler;
import com.wuwenze.poi.pojo.ExcelErrorField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping
public class UploadController {
    @Autowired
    private UploadService uploadService;
    @Autowired
    private BaseInfoService baseInfoService;

    @RequestMapping(value = "/importA", method = RequestMethod.POST)
    public ResponseEntity<?> importA(@RequestParam MultipartFile file, @RequestParam(value="accIdNew") String accId, HttpSession session)
            throws IOException {
        Integer accIdNew = Integer.parseInt(accId);
        Integer id = (Integer) session.getAttribute("curUserId");
        Date now = new Date();

        long beginMillis = System.currentTimeMillis();
        List<BaseInfo> baseInfoList = Lists.newArrayList();
        List<EnvInfo> envInfoInfoList = Lists.newArrayList();
        //补上剩余的
        List<PeolpleInfo> peolpleInfoList = Lists.newArrayList();
        List<CarInfo> carInfoList = Lists.newArrayList();
        List<B1InnerInfo> b1InnerInfoList = Lists.newArrayList();
        List<B1OuterInfo> b1OuterInfoList = Lists.newArrayList();
        List<B2InnerInfo> b2InnerInfoList = Lists.newArrayList();
        List<B2OuterInfo> b2OuterInfoList = Lists.newArrayList();
        List<B3InnerInfo> b3InnerInfoList = Lists.newArrayList();
        List<B3OuterInfo> b3OuterInfoList = Lists.newArrayList();
        List<B4InnerInfo> b4InnerInfoList = Lists.newArrayList();
        List<B4OuterInfo> b4OuterInfoList = Lists.newArrayList();
        List<B5InnerInfo> b5InnerInfoList = Lists.newArrayList();
        List<B5OuterInfo> b5OuterInfoList = Lists.newArrayList();
        List<EnvBurnInfo> envBurnInfoList = Lists.newArrayList();
        List<FireLocInfo> fireLocInfoList = Lists.newArrayList();

        List<Map<String, Object>> errorList = Lists.newArrayList();

        ExcelKit.$Import(BaseInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<BaseInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, BaseInfo entity) {
                        if(sheetIndex == 0){
                            entity.setAccId(accIdNew);
                            entity.setId(id);
                            entity.setTimeInsert(now);
                            System.out.println(entity.toString());
                            baseInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }

                    }

                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });
        ExcelKit.$Import(EnvInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<EnvInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, EnvInfo entity) {
                        if(sheetIndex == 1){
                            entity.setAccId(accIdNew);
                            System.out.println(entity.toString());
                            envInfoInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }

                    }

                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });



        ExcelKit.$Import(PeolpleInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<PeolpleInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, PeolpleInfo entity) {
                        if(sheetIndex == 2){
                            entity.setAccId(accIdNew);
                            System.out.println(entity.toString());
                            peolpleInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }

                    }

                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(CarInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<CarInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, CarInfo entity) {
                        if(sheetIndex == 3){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            carInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B1OuterInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B1OuterInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B1OuterInfo entity) {
                        if(sheetIndex == 4){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b1OuterInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });
        ExcelKit.$Import(B1InnerInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B1InnerInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B1InnerInfo entity) {
                        if(sheetIndex == 5){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b1InnerInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B2InnerInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B2InnerInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B2InnerInfo entity) {
                        if(sheetIndex == 7){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b2InnerInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B2OuterInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B2OuterInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B2OuterInfo entity) {
                        if(sheetIndex == 6){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b2OuterInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B3OuterInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B3OuterInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B3OuterInfo entity) {
                        if(sheetIndex == 8){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b3OuterInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B3InnerInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B3InnerInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B3InnerInfo entity) {
                        if(sheetIndex == 9){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b3InnerInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B4OuterInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B4OuterInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B4OuterInfo entity) {
                        if(sheetIndex == 10){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b4OuterInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B4InnerInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B4InnerInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B4InnerInfo entity) {
                        if(sheetIndex == 11){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b4InnerInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });
        ExcelKit.$Import(B5OuterInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B5OuterInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B5OuterInfo entity) {
                        if(sheetIndex == 12){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b5OuterInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B5InnerInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B5InnerInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B5InnerInfo entity) {
                        if(sheetIndex == 13){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b5InnerInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });
        ExcelKit.$Import(EnvBurnInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<EnvBurnInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, EnvBurnInfo entity) {
                        if(sheetIndex == 14){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            envBurnInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });
        ExcelKit.$Import(FireLocInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<FireLocInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, FireLocInfo entity) {
                        if(sheetIndex == 15){
                            entity.setAccId(accIdNew);
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            fireLocInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        String compareLocDetail = baseInfoList.get(0).getLocDetail();


        ArrayList<String> locDetailList = null;
        try {
            locDetailList = baseInfoService.selectLocDetail(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(locDetailList.size());
        for (int i = 0; i <locDetailList.size() ; i++) {
            if(compareLocDetail.trim().equals(locDetailList.get(i).trim())){
                boolean haveError = errorList.isEmpty();
                Map<String, Object> map1 = new HashMap<>();
                map1.put("data", baseInfoList);
                map1.put("haveError", haveError);
                map1.put("error", errorList);
                map1.put("timeConsuming", (System.currentTimeMillis() - beginMillis) / 1000L);
                map1.put("flag", 3);
                map1.put("locDetail",locDetailList.get(i).trim());
                return ResponseEntity.ok(map1);
            }
        }


        System.out.println("插入之前");
        uploadService.insertEnvInfoSelective(envInfoInfoList);

        System.out.println("插入之后");

        try {
            uploadService.insertBaseInfoSelective(baseInfoList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        uploadService.insertFireLocInfo(fireLocInfoList);//这个有问题
        uploadService.insertEnvBurnInfoSelective(envBurnInfoList);
        if(!b1InnerInfoList.isEmpty()){
            uploadService.insertB1InnerInfoSelective(b1InnerInfoList);
        }
        uploadService.insertB1OuterInfoSelective(b1OuterInfoList);
        uploadService.insertPeopleInfoSelective(peolpleInfoList);
        uploadService.insertCarInfoSelective(carInfoList);
        uploadService.insertB2InnerInfoSelective(b2InnerInfoList);
        uploadService.insertB2OuterInfoSelective(b2OuterInfoList);
        uploadService.insertB3InnerInfoSelective(b3InnerInfoList);
        uploadService.insertB3OuterInfoSelective(b3OuterInfoList);
        uploadService.insertB4InnerInfoSelective(b4InnerInfoList);
        uploadService.insertB4OuterInfoSelective(b4OuterInfoList);
        uploadService.insertB5InnerInfoSelective(b5InnerInfoList);
        uploadService.insertB5OuterInfoSelective(b5OuterInfoList);//这个有问题
        baseInfoService.updateStatus(0,accIdNew);
        boolean haveError = errorList.isEmpty();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("data", baseInfoList);
        map1.put("haveError", haveError);
        map1.put("error", errorList);
        map1.put("timeConsuming", (System.currentTimeMillis() - beginMillis) / 1000L);
        map1.put("flag", 1);
        return ResponseEntity.ok(map1);
    }



    @RequestMapping(value = "/import", method = RequestMethod.POST)
    public ResponseEntity<?> importUser(@RequestParam MultipartFile file,@RequestParam(value="accId1") String accId1)
            throws IOException {


        System.out.println("进入controller"+accId1+"表名" );

       /* if(accId1 != filename1){
            Map<String, Object> map2 = new HashMap<>();
            map2.put("flag", 3);
            return ResponseEntity.ok(map2);
        }*/
        /*Map<String, Object> map1 = new HashMap<>();
        map1.put("data", peolpleInfoList);
        map1.put("haveError", haveError);
        map1.put("error", errorList);
        map1.put("timeConsuming", (System.currentTimeMillis() - beginMillis) / 1000L);
        map1.put("flag", 1);*/




        long beginMillis = System.currentTimeMillis();

        List<PeolpleInfo> peolpleInfoList = Lists.newArrayList();
        List<CarInfo> carInfoList = Lists.newArrayList();
        List<B1InnerInfo> b1InnerInfoList = Lists.newArrayList();
        List<B1OuterInfo> b1OuterInfoList = Lists.newArrayList();
        List<B2InnerInfo> b2InnerInfoList = Lists.newArrayList();
        List<B2OuterInfo> b2OuterInfoList = Lists.newArrayList();
        List<B3InnerInfo> b3InnerInfoList = Lists.newArrayList();
        List<B3OuterInfo> b3OuterInfoList = Lists.newArrayList();
        List<B4InnerInfo> b4InnerInfoList = Lists.newArrayList();
        List<B4OuterInfo> b4OuterInfoList = Lists.newArrayList();
        List<B5InnerInfo> b5InnerInfoList = Lists.newArrayList();
        List<B5OuterInfo> b5OuterInfoList = Lists.newArrayList();
        List<EnvBurnInfo> envBurnInfoList = Lists.newArrayList();
        List<FireLocInfo> fireLocInfoList = Lists.newArrayList();
        List<Map<String, Object>> errorList = Lists.newArrayList();





        ExcelKit.$Import(PeolpleInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<PeolpleInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, PeolpleInfo entity) {
                        if(sheetIndex == 0){
                            System.out.println(entity.toString());
                            peolpleInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }

                    }

                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        //测试如果事故ID与文件名不符合直接return
        if(accId1.equals(peolpleInfoList.get(0).getAccId().toString()) == false ){
            boolean haveError = errorList.isEmpty();
            Map<String, Object> map2 = new HashMap<>();
            map2.put("data", peolpleInfoList);
            map2.put("haveError", haveError);
            map2.put("error", errorList);
            map2.put("timeConsuming", (System.currentTimeMillis() - beginMillis) / 1000L);
            map2.put("flag", 3);
            return ResponseEntity.ok(map2);
        }


        ExcelKit.$Import(CarInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<CarInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, CarInfo entity) {
                        if(sheetIndex == 1){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            carInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B1OuterInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B1OuterInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B1OuterInfo entity) {
                        if(sheetIndex == 2){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b1OuterInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });
        ExcelKit.$Import(B1InnerInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B1InnerInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B1InnerInfo entity) {
                        if(sheetIndex == 3){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b1InnerInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B2InnerInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B2InnerInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B2InnerInfo entity) {
                        if(sheetIndex == 5){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b2InnerInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B2OuterInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B2OuterInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B2OuterInfo entity) {
                        if(sheetIndex == 4){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b2OuterInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B3OuterInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B3OuterInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B3OuterInfo entity) {
                        if(sheetIndex == 6){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b3OuterInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B3InnerInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B3InnerInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B3InnerInfo entity) {
                        if(sheetIndex == 7){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b3InnerInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B4OuterInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B4OuterInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B4OuterInfo entity) {
                        if(sheetIndex == 8){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b4OuterInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B4InnerInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B4InnerInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B4InnerInfo entity) {
                        if(sheetIndex == 9){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b4InnerInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });
        ExcelKit.$Import(B5OuterInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B5OuterInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B5OuterInfo entity) {
                        if(sheetIndex == 10){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b5OuterInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });

        ExcelKit.$Import(B5InnerInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<B5InnerInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, B5InnerInfo entity) {
                        if(sheetIndex == 11){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            b5InnerInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });
        ExcelKit.$Import(EnvBurnInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<EnvBurnInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, EnvBurnInfo entity) {
                        if(sheetIndex == 12){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            envBurnInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });
        ExcelKit.$Import(FireLocInfo.class)
                .readXlsx(file.getInputStream(), new ExcelReadHandler<FireLocInfo>() {

                    @Override
                    public void onSuccess(int sheetIndex, int rowIndex, FireLocInfo entity) {
                        if(sheetIndex == 13){
                            System.out.println(sheetIndex);
                            System.out.println(entity.toString());
                            fireLocInfoList.add(entity); // 单行读取成功，加入入库队列。
                        }
                    }


                    @Override
                    public void onError(int sheetIndex, int rowIndex,
                                        List<ExcelErrorField> errorFields) {
                        // 读取数据失败，记录了当前行所有失败的数据
                        Map<String, Object> map = new HashMap<>();
                        map.put("sheetIndex", sheetIndex);
                        map.put("rowIndex", rowIndex);
                        map.put("errorFields", errorFields);
                        errorList.add(map);
                    }
                });





        System.out.println("error"+errorList.size());
        // TODO: 执行successList的入库操作。
        uploadService.insertFireLocInfo(fireLocInfoList);//这个有问题
        uploadService.insertEnvBurnInfoSelective(envBurnInfoList);
        if(!b1InnerInfoList.isEmpty()){
            uploadService.insertB1InnerInfoSelective(b1InnerInfoList);
        }
        uploadService.insertB1OuterInfoSelective(b1OuterInfoList);
        uploadService.insertPeopleInfoSelective(peolpleInfoList);
        uploadService.insertCarInfoSelective(carInfoList);
        uploadService.insertB2InnerInfoSelective(b2InnerInfoList);
        uploadService.insertB2OuterInfoSelective(b2OuterInfoList);
        uploadService.insertB3InnerInfoSelective(b3InnerInfoList);
        uploadService.insertB3OuterInfoSelective(b3OuterInfoList);
        uploadService.insertB4InnerInfoSelective(b4InnerInfoList);
        uploadService.insertB4OuterInfoSelective(b4OuterInfoList);
        uploadService.insertB5InnerInfoSelective(b5InnerInfoList);
        uploadService.insertB5OuterInfoSelective(b5OuterInfoList);//这个有问题

        baseInfoService.updateStatus(0,Integer.parseInt(accId1));

       /*uploadService.insertExcel(peolpleInfoList,carInfoList,b1InnerInfoList,b1OuterInfoList,b2InnerInfoList,b2OuterInfoList,b3InnerInfoList,b3OuterInfoList,b4InnerInfoList,b4OuterInfoList
                                    ,b5InnerInfoList,b5OuterInfoList,envBurnInfoList,fireLocInfoList);*/
        System.out.println("error"+errorList.size());
        boolean haveError = errorList.isEmpty();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("data", peolpleInfoList);
        map1.put("haveError", haveError);
        map1.put("error", errorList);
        map1.put("timeConsuming", (System.currentTimeMillis() - beginMillis) / 1000L);
        map1.put("flag", 1);
        return ResponseEntity.ok(map1);
    }

    @RequestMapping("/picLoad")
    public String picLoad(){
        return "picLoad";
    }



    @RequestMapping("/upload")
    //参数file是从前端提交过来的
    public String upload(@RequestParam("file")MultipartFile pictureFile) throws Exception {
        String FILEPATH = "F:\\pictures\\";
        String originalFilename = "";
        String newFileName = "";
        String description = "layui";

        //进行图片的上传
        if (pictureFile!=null && pictureFile.getOriginalFilename()!=null && pictureFile.getOriginalFilename().length()>0) {
            //图片上传成功后，将图片的地址写到数据库
            originalFilename = pictureFile.getOriginalFilename();

            newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));

            //新文件
            File file = new File(FILEPATH + newFileName);

            //将内存中的文件写入磁盘
            pictureFile.transferTo(file);
        }

        uploadService.insertFile(originalFilename, FILEPATH+newFileName, description);

        return "index1";
    }

    @RequestMapping("/uploadMultipart")
    public String uploadMultipart(@RequestParam("file")MultipartFile[] pictureFile) throws Exception {
        String FILEPATH = "F:\\pictures\\";
        String originalFilename = "";
        String newFileName = "";
        String description = "layui";

        //进行图片的上传
        for (int i = 0; i<pictureFile.length; i++) {
            if (pictureFile[i]!=null && pictureFile[i].getOriginalFilename()!=null && pictureFile[i].getOriginalFilename().length()>0) {
                originalFilename = pictureFile[i].getOriginalFilename();
                newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));

                File file = new File(FILEPATH + newFileName);

                pictureFile[i].transferTo(file);
            }
            //此处打算往数据库存所有照片的路径
            uploadService.insertFile(originalFilename, FILEPATH+newFileName, description);
        }
        

        return null;
    }
}
