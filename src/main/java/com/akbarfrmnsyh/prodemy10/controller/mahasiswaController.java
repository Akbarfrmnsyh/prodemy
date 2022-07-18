package com.akbarfrmnsyh.prodemy10.controller;

import com.akbarfrmnsyh.prodemy10.model.DefaultResponse;
import com.akbarfrmnsyh.prodemy10.model.loginDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mahasiswa")
public class mahasiswaController {

    @PostMapping("/login")
    public DefaultResponse login(@RequestBody loginDto loginDto){

       DefaultResponse dr = new DefaultResponse();
       dr.setStatus(Boolean.TRUE);
       dr.setMessage("Login Sukses");

       return dr;
    }
}
