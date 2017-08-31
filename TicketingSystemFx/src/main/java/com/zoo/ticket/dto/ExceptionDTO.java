/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoo.ticket.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
@ToString
public class ExceptionDTO implements Serializable {

    private static final long serialVersionUID = -8183744414706730475L;

    private @NonNull
    String exceptionCode;
    private @NonNull
    String exceptionMessage;
    private Exception exception;

}
