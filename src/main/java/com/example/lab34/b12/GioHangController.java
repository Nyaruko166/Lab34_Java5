package com.example.lab34.b12;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/b12/cart")
public class GioHangController {

    @GetMapping
    public String view(Model model) {

        return "b12/gio-hang";
    }

}
