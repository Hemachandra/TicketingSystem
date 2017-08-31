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
@ToString(exclude = {"userProfileObj", "userTypeObj"})
public class UserDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = -9146130435959203845L;

    private long userId;
    private String username;
    private String password;
    private long lockedFlag;
    private long loginAttempts;
    private long passwordFlag;
    private UserProfileDTO userProfileObj = new UserProfileDTO();
    private String sessionToken;
    private String validationMessage;
    private UserTypeDTO userTypeObj = new UserTypeDTO();
    private long applicationID;
    private String currentPassword;
    private String newPassword;
    private DesignationDTO desigObj = new DesignationDTO();

}
