package com.example.lab34.controller;

import com.example.lab34.model.Loa;
import com.example.lab34.service.ILoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/lab34/bai-2")
public class LoaController {

    @Autowired
    private ILoaService service;

    Loa loaUp = new Loa();

    @GetMapping
    public String loadTbl(Model model) {
        List<Loa> lstLoa = service.getAll();
//        for (Loa x : lstLoa) {
//            System.out.println(x.toString());
//        }
        model.addAttribute("lstLoa", lstLoa);
        return "/bai2/bai-2";
    }

    @PostMapping(value = "/add", params = "add")
    public String addLoa(Model model,
                         @RequestParam(name = "maLoa") String maLoa,
                         @RequestParam(name = "tenLoa") String tenLoa,
                         @RequestParam(name = "congSuat") Integer congSuat,
                         @RequestParam(name = "mauSac") String mauSac,
                         @RequestParam(name = "kenhAmThanh") String kenhAmThanh
    ) {
        service.addLoa(new Loa(maLoa, tenLoa, congSuat, mauSac, kenhAmThanh));
        return "redirect:/lab34/bai-2";
    }

    @GetMapping("/delete/{maLoa}")
    public String deleteLoa(Model model,
                            @PathVariable("maLoa") String maLoa) {
        service.deleteLoa(service.findOne(maLoa));
        return "redirect:/lab34/bai-2";
    }

    @GetMapping("/detail/{maLoa}")
    public String detailLoa(Model model,
                            @PathVariable("maLoa") String maLoa) {
        List<Loa> lstLoa = service.getAll();
        Loa loa = service.findOne(maLoa);
        model.addAttribute("loa", loa);
        model.addAttribute("lstLoa", lstLoa);
//        loaUp = loa;
        return "/bai2/bai-2";
    }

    @PostMapping(value = "/add", params = "update")
    public String updateLoa(Model model,
                            @RequestParam(name = "maLoa") String maLoa,
                            @RequestParam(name = "tenLoa") String tenLoa,
                            @RequestParam(name = "congSuat") Integer congSuat,
                            @RequestParam(name = "mauSac") String mauSac,
                            @RequestParam(name = "kenhAmThanh") String kenhAmThanh) {
        loaUp.setTenLoa(tenLoa);
        loaUp.setCongSuat(congSuat);
        loaUp.setMauSac(mauSac);
        loaUp.setKenhAmThanh(kenhAmThanh);
        service.updateLoa(loaUp);
        return "redirect:/lab34/bai-2";
    }
}
