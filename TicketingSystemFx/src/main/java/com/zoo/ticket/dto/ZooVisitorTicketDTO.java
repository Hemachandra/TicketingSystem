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
@ToString(exclude = {"visitorObj"})
public class ZooVisitorTicketDTO {
    
    private long zooTicketID;
    private long counterNo;
    private long noOfAdults;
    private long noOfChildren;
    private long havingCamera;
    private double totalTicketPrice;
    private String ticketToken;
    private String barcodePath;
    private String searchContact;
    
    private ZooVisitorDTO visitorObj;
}
