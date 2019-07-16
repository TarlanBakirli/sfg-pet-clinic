package com.tarlanbakirli.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tarlan Bakirli on 7/16/2019
 */

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(){
        return "owners/index";
    }

}
