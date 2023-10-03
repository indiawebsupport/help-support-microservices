package com.bigeye.helpsupport.controller;

import com.bigeye.helpsupport.modal.HelpAndSupport;
import com.bigeye.helpsupport.modal.HelpAndSupportRequest;
import com.bigeye.helpsupport.service.HelpAndSupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1.0/help&support")
@CrossOrigin(origins = "*")
public class HelpAndSupportController {

    @Autowired
    private HelpAndSupportService helpAndSupportService;

    @PostMapping
    public ResponseEntity<?> raisedIssue(@RequestBody HelpAndSupportRequest helpAndSupport){
        return new ResponseEntity<>(helpAndSupportService.raisedIssue(helpAndSupport), HttpStatus.OK);
    }

    @GetMapping("/{email}")
    public ResponseEntity<?> getRaisedSolution(@PathVariable("email") String email){
        return new ResponseEntity<>(helpAndSupportService.getRaisedSolution(email), HttpStatus.OK);
    }
}
