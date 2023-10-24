package com.cg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/cp/customers")
    public String showListPage() {
        return "cp/customer/list";
    }


    @GetMapping("/cp/customers/create")
    public String showCreatePage() {
        return "cp/customer/create";
    }

}
