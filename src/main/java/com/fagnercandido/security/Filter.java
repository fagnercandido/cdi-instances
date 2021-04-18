package com.fagnercandido.security;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@PreMatching
@Provider
public class Filter implements ContainerRequestFilter {

    @Inject
    @Any
    Instance<HttpMechanism> instances;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        for (HttpMechanism instance: instances) {
            instance.validate();
        }
    }
}
