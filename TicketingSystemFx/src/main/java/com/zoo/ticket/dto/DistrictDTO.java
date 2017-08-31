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
 * @author HEMACHANDRA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DistrictDTO extends BaseDTO implements Serializable{
    
    private long districtID;
    private String districtName;
    private long stateID;
    private String encDistrictID;
    
}
