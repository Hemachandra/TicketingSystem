/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoo.ticket.dto;

import java.io.Serializable;
import java.sql.Timestamp;
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
public class BaseDTO extends Object implements Serializable {

    private static final long serialVersionUID = -4897146296619045070L;

    private String createdBy;
    private Timestamp timeCreatedOn;
    private String strCreatedOn;
    private String modifiedBy;
    private Timestamp timeModifiedOn;
    private String strModifiedOn;
    private long statusTypeID;
    private String statusType;
    private String createdByUser;
    private String modifiedByUser;
    private String encryptedId;
    private String encryptedString;

}
