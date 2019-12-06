package cn.nankai.tjxf1.controller;

import cn.nankai.tjxf1.entity.*;
import cn.nankai.tjxf1.service.test;
import com.wuwenze.poi.ExcelKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class testController {

    @Autowired
    test test;
    @RequestMapping(value = "/downTemplate", method = RequestMethod.GET)
    public void downTemplate(HttpServletResponse response) {
        B5OuterInfo carInfo = test.selectB5O();
        List<B5OuterInfo> userList = new ArrayList<>();
        userList.add(carInfo);
        ExcelKit.$Export(B5OuterInfo.class, response).downXlsx(userList, true);

    }


}
