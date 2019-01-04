package com.workshop.workshopservice.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.ResponseEntity.status;

@RestController
public class MotorApi {

    @GetMapping("/motor")
    public ResponseEntity fetchMotors(){
        return buildNotFoundResponse();
    }

    private ResponseEntity buildNotFoundResponse(){
        return status(NOT_FOUND.value()).body("There is no motor available");
    }
}
