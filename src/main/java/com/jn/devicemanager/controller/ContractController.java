package com.jn.devicemanager.controller;

import com.jn.devicemanager.entity.Contract;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {

    @PostMapping("/addContract")
    public String addContract(@RequestBody Contract contract) {

        return null;
    }
}
