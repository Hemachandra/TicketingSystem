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
public class PermissionsDTO extends BaseDTO implements Serializable{

    private static final long serialVersionUID = 8995167775789677972L;
    
    private long permissionID;
    private String encPermissionID;
    private long designationID;
    private long menuID;
    private long subMenuID;
    private String designationName;
    private String menuName;
    private String subMenuName;
    private String menuLink;
    private String subMenuLink;
    
}
