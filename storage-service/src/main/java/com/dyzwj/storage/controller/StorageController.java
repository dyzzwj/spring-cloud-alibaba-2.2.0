package com.dyzwj.storage.controller;


import com.dyzwj.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @Autowired
    StorageService storageService;

    @PostMapping("/storage")
    public  String insertStorage(){
        storageService.insert();
        return "storage";
    }


    @PostMapping("/addStorage")
    public String addStorage(){
        System.out.println("addStorage");
        return "addStorage";
    }

    @PostMapping("/decreaseStorage")
    public String decreaseStorage(){
        System.out.println("decreaseStorage");
        return "decreaseStorage";
    }

}
