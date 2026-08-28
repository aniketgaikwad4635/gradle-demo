package com.trial.gradle_demo.controller;

import com.trial.gradle_demo.model.Claim;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/claim")
public class ClaimController {

    @GetMapping("/get/{claimId}")
    public ResponseEntity<Claim> getClaimDetails(@PathVariable Long claimId){
        Claim claimObj = new Claim(1L, "CANCER", 12345);
        return new ResponseEntity<>(claimObj, HttpStatus.OK);
    }

}
