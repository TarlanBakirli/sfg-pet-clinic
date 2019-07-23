package com.tarlanbakirli.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tarlan Bakirli on 7/16/2019
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){

        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(){
        return "notimplemented";
    }

}
