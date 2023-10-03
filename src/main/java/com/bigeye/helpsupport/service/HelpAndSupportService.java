package com.bigeye.helpsupport.service;

import com.bigeye.helpsupport.modal.HelpAndSupport;
import com.bigeye.helpsupport.modal.HelpAndSupportRequest;
import com.bigeye.helpsupport.modal.HelpAndSupportSolution;

import java.util.List;

public interface HelpAndSupportService {
    HelpAndSupport raisedIssue(HelpAndSupportRequest helpAndSupport);

    List<HelpAndSupportSolution> getRaisedSolution(String email);
}
