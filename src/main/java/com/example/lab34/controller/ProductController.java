package com.example.lab34.controller;

import com.example.lab34.model.Product;
import com.example.lab34.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/b7/product")
public class ProductController {

    @Autowired
    private IProductRepository repo;

    @GetMapping
    public String viewAll(Model model) {
        List<Product> lstSP;
        lstSP = repo.findByQuantityGreaterThan(100);
        model.addAttribute("lstSP", lstSP);
        return "/b7/san-pham";
    }

}
