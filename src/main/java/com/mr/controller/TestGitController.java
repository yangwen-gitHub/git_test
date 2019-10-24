package com.mr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by yangwen on 2019/10/24.
 */
@Controller
public class TestGitController {

    @GetMapping("/testGit")
    public String testGit(){
        return "Success";
    }

}
