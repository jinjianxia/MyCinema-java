package com.example.mycinema.controller;

import com.example.mycinema.model.Cinema;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@org.springframework.stereotype.Controller
@CrossOrigin(origins = "*", maxAge = 1000)
@RestController
public class Controller {
    @RequestMapping("cinema")
    @ResponseBody
    public ArrayList<Cinema> index() {
        ArrayList<Cinema> CinemaList = new ArrayList<>();
        // 0:改签 1:小吃 2:折扣卡 3:退 4:4K厅 5:巨幕厅
        CinemaList.add(new Cinema("万达影城（柯桥厚品店）",
                "柯桥区华舍街道笛扬路与兴越路交口聚银时代购物中心 4 层",
                15.9,
                new int[]{0, 1, 2}));
        CinemaList.add(new Cinema("大地影院（诸暨大唐广粤荟店）",
                "诸暨市大唐街道商城路与市场西路交口广粤荟广场 3 层",
                19.9,
                new int[]{0, 1, 2}));
        CinemaList.add(new Cinema("正大时代激光影城",
                "嵊州市三江街道兴盛街 889 号正大广场 4 楼",
                19.9,
                new int[]{3, 1, 2, 5}));
        CinemaList.add(new Cinema("德信影城（袍江信诚店）",
                "越城区袍江百盛街 1 号（西湖头苏越大酒店旁）",
                19.9,
                new int[]{0}));
        CinemaList.add(new Cinema("橫店电影城（不夜城店）",
                "诸暨市浣东街道高湖路 88 号不夜城四楼",
                19.9,
                new int[]{2, 3, 0}));
        CinemaList.add(new Cinema("时代影城（迪荡店）",
                "越城区湖滨商业中心 3 幢（新华书店 4 楼）",
                19.9,
                new int[]{2, 0}));
        CinemaList.add(new Cinema("中影星美国际影城",
                "越城区灵芝街道洋江西路御和园 15 幢四层 416-459 室",
                19.9,
                new int[]{2}));
        CinemaList.add(new Cinema("中影国际影城（绍兴梦享城店）",
                "越城区灵芝街道二环北路梦享城 3 楼",
                19.9,
                new int[]{1, 2}));
        return CinemaList;
    }


}
