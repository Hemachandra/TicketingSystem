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
public class StateDTO extends BaseDTO implements Serializable{

    private static final long serialVersionUID = 999272611283500724L;
    
    private long stateID;
    private String stateName;
    private String stateCode;
    private String countryName;
    private long countryID;
    
}
