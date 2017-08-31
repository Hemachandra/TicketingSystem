/*
 * To change this template, choose Tools | Templates
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
public class EmailNotificationDTO extends BaseDTO implements Serializable{

    private static final long serialVersionUID = -5500651886275363871L;

    private long emailLogId;
    private long emailNotificationId;
    private long userId;
    private long assessmentID;
    private long assessmentTypeID;
    private String fromEmailId;
    private String toEmailId;
    private String ccEmailId;
    private String bccEmailId;
    private String emailSubject;
    private String emailContent;
    private int emailSuccessFlag;
    private int resendCount;
    private String entryDate;
    private String errorDesc;
    private long orgId;
    private String emailInsertFlag;
    private String[] ccArray;

    

}
