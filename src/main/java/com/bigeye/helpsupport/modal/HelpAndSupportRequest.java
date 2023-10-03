package com.bigeye.helpsupport.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.UUID;

@Data
public class HelpAndSupportRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String problem;
}
