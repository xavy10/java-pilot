package com.aris.pilot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pilot-controller")
public class PilotController {

    @GetMapping("/default-message")
    public ResponseEntity<String> getDefaultMessage(){
        return new ResponseEntity<>("The server is ready", HttpStatus.OK);
    }

}
