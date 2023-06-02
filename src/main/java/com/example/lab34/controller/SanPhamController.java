package com.example.lab34.controller;

import com.example.lab34.model.SanPham;
import com.example.lab34.repository.ISanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/b8/san-pham")
public class SanPhamController {

    @Autowired
    private ISanPhamRepository repository;

    @GetMapping
    public String view(Model model, @RequestParam(required = false) String tenSanPham,
                       @RequestParam(defaultValue = "0") int page) {

        if (page < 1) page = 1;

        Page<SanPham> sanPhamPage;
        Pageable pageable = PageRequest.of(page - 1, 10);
        if (tenSanPham == null || tenSanPham.isBlank()) {

            sanPhamPage = repository.findAll(pageable);
        } else {
            sanPhamPage = repository.findByTenSanPhamContains(tenSanPham, pageable);
        }
        model.addAttribute("page", sanPhamPage);
        return "/b8/product";
    }
}
