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
public class DesignationDTO extends BaseDTO implements Serializable{

    private static final long serialVersionUID = 6503551951716341578L;

    private long designationID;
    private String encDesignationID;
    private long applicationID;
    private String designationName;
    private String description;
    private long havePermissions;

}
