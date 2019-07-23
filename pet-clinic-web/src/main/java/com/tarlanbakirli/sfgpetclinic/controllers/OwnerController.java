package com.tarlanbakirli.sfgpetclinic.controllers;

import com.tarlanbakirli.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tarlan Bakirli on 7/16/2019
 */

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwners(){
        return "notimplemented";
    }

}
