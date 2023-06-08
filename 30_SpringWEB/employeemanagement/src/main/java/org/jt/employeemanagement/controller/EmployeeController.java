package org.jt.employeemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * EmployeeController
 */
@Controller
public class EmployeeController {
    @GetMapping({ "/", "/viewemployee" })
    public String viewEmployee() {
        return "view-employee";
    }

    @GetMapping("/addemployee")
    public String addEmployee() {
        return "add-employee";
    }

}