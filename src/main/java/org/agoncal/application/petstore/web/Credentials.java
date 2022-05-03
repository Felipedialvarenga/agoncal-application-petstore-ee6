package org.agoncal.application.petstore.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

@Named
@RequestScoped
@Getter
@Setter
public class Credentials {

    // ======================================
    // =             Attributes             =
    // ======================================

    private String login;
    private String password;
    private String password2;

    // ======================================
    // =         Getters & setters          =
    // ======================================
    
}
