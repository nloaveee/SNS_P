package com.sns_p.controller;

import com.sns_p.domain.user.dto.SignUpDTO;
import com.sns_p.domain.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signUp")
    public String signUpProcess(SignUpDTO SignUpDTO) {

        System.out.println(SignUpDTO.getUsername());
        userService.signUp(SignUpDTO);

        return "ok";
    }
}

