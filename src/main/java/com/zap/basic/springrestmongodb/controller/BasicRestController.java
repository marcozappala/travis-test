package com.zap.basic.springrestmongodb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("first")
public class BasicRestController {

    @GetMapping("/{id}")
    public @ResponseBody ResponseEntity<String> getBook(@PathVariable int id) {
        System.out.println("received: " + id);
        return ResponseEntity.ok("Scemo chi legge");
    }
}
