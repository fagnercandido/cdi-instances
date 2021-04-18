package com.fagnercandido.security;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FilterB implements HttpMechanism {

    @Override
    public void validate() {
        System.out.println("Filter B");
    }
}
