package com.rpg.back.controller;

import com.rpg.back.dto.LoginDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    public void  login(@RequestBody LoginDTO login) {
        System.out.println(login.getLogin() + ": " + login.getSenha());
    }
}
