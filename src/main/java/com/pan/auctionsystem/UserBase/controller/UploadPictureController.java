package com.pan.auctionsystem.UserBase.controller;

import com.pan.auctionsystem.UserBase.service.PictureService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller("uploadPictureController")
@RequestMapping("/auctionSystem")
public class UploadPictureController {

    @Resource(name = "pictureService")
    private PictureService service;

    @PostMapping("/uploadPicture")
    @ResponseBody
    public String upload(@RequestParam("uploadOffice") MultipartFile file) {
        service.service(file);

        return "success";
    }

    @GetMapping("/getPicture")
    public void returnPicture(String fileName, HttpServletResponse response) {
        service.service(fileName, response);
    }
}
