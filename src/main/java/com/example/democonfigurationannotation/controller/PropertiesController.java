package com.example.democonfigurationannotation.controller;


import com.example.democonfigurationannotation.service.PropertiesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController always with Controller
@RestController
public class PropertiesController {

    private PropertiesService propertiesService;

    public PropertiesController(PropertiesService propertiesService) {
        this.propertiesService = propertiesService;
    }

    @GetMapping(value ="/properties")
    public ResponseEntity<String> getProperties(){
        return new ResponseEntity<>(propertiesService.getProperties(), HttpStatus.OK);
    }

}
