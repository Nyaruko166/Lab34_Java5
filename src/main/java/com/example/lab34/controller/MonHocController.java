package com.example.lab34.controller;

import com.example.lab34.model.MonHoc;
import com.example.lab34.service.IMonHocService;
import com.example.lab34.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/lab34/bai-1")
public class MonHocController {

    @Autowired
    private IMonHocService monHocService;

    @GetMapping
    public String loadTbl(Model model) {
        List<MonHoc> lstMH = monHocService.getAll();
        model.addAttribute("lstMH", lstMH);
        return "/bai1/bai-1";
    }

//    @GetMapping("/testView")
//    public String loadTblTest(Model model) {
//        List<MonHoc> lstMH = monHocService.getAll();
//        model.addAttribute("lstMH", lstMH);
//        return "/bai1/test";
//    }

    @PostMapping("/add")
    public String addMH(Model model,
                        @RequestParam(name = "giangVien", required = false) String[] arrCkb,
                        @RequestParam(name = "maMon") String maMon,
                        @RequestParam(name = "tenMon") String tenMon,
                        @RequestParam(name = "soTinChi") Integer soTinChi,
                        @RequestParam(name = "chuyenNganh") String chuyenNganh,
                        @RequestParam(name = "batBuoc") Boolean batBuoc
    ) {
        StringBuilder sb = new StringBuilder();
        String giangVien = null;
        if (arrCkb != null) {
            // ForEach các chẹckbox được chọn
            for (String value : arrCkb) {
                if (sb.length() == 0) {
                    sb.append(value);
                } else {
                    sb.append(", ").append(value);
                }
            }
            giangVien = sb.toString();
        }
        monHocService.addMH(new MonHoc(maMon, tenMon, soTinChi, chuyenNganh, giangVien, batBuoc));
        return "redirect:/lab34/bai-1";
    }

    @GetMapping("/delete/{maMH}")
    public String deleteMH(Model model,
                           @PathVariable("maMH") String maMH
    ) {
        monHocService.deleteMH(monHocService.findOne(maMH));
        return "redirect:/lab34/bai-1";
    }

}
