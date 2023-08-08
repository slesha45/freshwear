package com.system.freshWear_ecommerce_system.controller;

import com.system.freshWear_ecommerce_system.service.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/bill")
public class BillController {
    private final BillService billService;

    @PostMapping("/generate")
    public String generateBill() {
        billService.generateBill();
        return "redirect:/dashboard/";
    }
}
