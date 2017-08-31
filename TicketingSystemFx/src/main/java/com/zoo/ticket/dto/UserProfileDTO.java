/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoo.ticket.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author hpasupuleti
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserProfileDTO extends BaseDTO implements  Serializable{

    private static final long serialVersionUID = -4159475623886760191L;
    
    private long userProfileId;
    private long userId;
    private long userTypeId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailAddress;
    private String phoneNo;
    private String address;
    private long autoAssignFlag;
    private String gender;
    private String dateOfBirth;
    private String village;
    //private String district;
    private String country;
    private long stateID;
    private long district;
    
        
}
