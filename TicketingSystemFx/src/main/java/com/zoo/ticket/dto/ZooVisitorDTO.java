/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoo.ticket.dto;

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
public class ZooVisitorDTO {

    private long zooVisitorID;
    private String visitorName;
    private String visitorIdType;
    private String visitorIdDetails;
    private String visitorAddress;
    private String visitorEmail;
    private String visitorContact;
}
