package com.bigeye.helpsupport.service;

import com.bigeye.helpsupport.modal.HelpAndSupport;
import com.bigeye.helpsupport.modal.HelpAndSupportRequest;
import com.bigeye.helpsupport.modal.HelpAndSupportSolution;
import com.bigeye.helpsupport.repository.HelpAndSupportRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelpAndSupportServiceImple implements HelpAndSupportService{

    @Autowired
    private HelpAndSupportRepository helpAndSupportRepository;

    @Override
    public HelpAndSupport raisedIssue(HelpAndSupportRequest helpAndSupportRequest) {
        HelpAndSupport helpAndSupport=new HelpAndSupport();
        BeanUtils.copyProperties(helpAndSupportRequest,helpAndSupport);
        return helpAndSupportRepository.saveAndFlush(helpAndSupport);
    }

    @Override
    public List<HelpAndSupportSolution> getRaisedSolution(String email) {

        List<HelpAndSupportSolution> solutions=new ArrayList<>();
        List<HelpAndSupport> byEmail = helpAndSupportRepository.findByEmail(email);
        String solution="";
        String problem ="";

        for(int i=0;i<byEmail.size();i++){
            HelpAndSupportSolution helpAndSupportSolution=new HelpAndSupportSolution();
            HelpAndSupport helpAndSupport = byEmail.get(i);
            solution = helpAndSupport.getSolution();
            problem = helpAndSupport.getProblem();
            helpAndSupportSolution.setSolution(solution);
            helpAndSupportSolution.setProblem(problem);
            solutions.add(helpAndSupportSolution);


        }

        return solutions;


    }
}
