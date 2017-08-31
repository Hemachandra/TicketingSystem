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
public class MasterLookUpDTO extends BaseDTO implements Serializable{

    private static final long serialVersionUID = -8317276579475775345L;
    
    private long lookUpId;
    private String lookUpName;
    private String lookUpValue;
    private String description;

    /**
     * @return the lookUpId
     */
    public long getLookUpId() {
        return lookUpId;
    }

    /**
     * @param lookUpId the lookUpId to set
     */
    public void setLookUpId(long lookUpId) {
        this.lookUpId = lookUpId;
    }

    /**
     * @return the lookUpName
     */
    public String getLookUpName() {
        return lookUpName;
    }

    /**
     * @param lookUpName the lookUpName to set
     */
    public void setLookUpName(String lookUpName) {
        this.lookUpName = lookUpName;
    }

    /**
     * @return the lookUpValue
     */
    public String getLookUpValue() {
        return lookUpValue;
    }

    /**
     * @param lookUpValue the lookUpValue to set
     */
    public void setLookUpValue(String lookUpValue) {
        this.lookUpValue = lookUpValue;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
