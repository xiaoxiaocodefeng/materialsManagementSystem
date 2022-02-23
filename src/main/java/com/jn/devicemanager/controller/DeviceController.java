package com.jn.devicemanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class DeviceController {

    @RequestMapping("/addDevice")
    String addDevice() {
        return "Hello World!";
    }

    @RequestMapping("/addPicture")
    public String addPicture(MultipartFile picture) {
        try {
            byte[] bytes = picture.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "success";
    }


}
