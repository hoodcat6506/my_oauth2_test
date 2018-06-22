package com.github.hoodcat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="oauth")
public class OAuthController {
    
    @RequestMapping("code")
    public String getOAuthCodePage() {
        return "index";
    }
}
