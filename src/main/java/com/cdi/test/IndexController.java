/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.test;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author tosun_001
 */
@ManagedBean
@SessionScoped
public class IndexController implements Serializable{

    private static final long serialVersionUID = 1981249450119487649L;

    public String getGreetings() {
        return "Hello User";
    }
}
