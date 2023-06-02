package com.example.lab34.b11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/b11/order")
public class OrderController {

    @Autowired
    private IOrderRepository repository;

    @GetMapping
    public String view(Model model) {
        List<OrderVangLai> lstOrder = repository.timHoaDonTheoKhachVangLai();
        model.addAttribute("lstOrder", lstOrder);
        return "/b11/order";
    }
}
