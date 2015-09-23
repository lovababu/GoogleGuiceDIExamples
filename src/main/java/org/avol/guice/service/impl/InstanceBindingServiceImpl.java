package org.avol.guice.service.impl;

import org.avol.guice.annotations.Welcome;
import org.avol.guice.service.InstanceBindingsService;

import javax.inject.Inject;

/**
 * Created by Durga on 9/23/2015.
 */
public class InstanceBindingServiceImpl implements InstanceBindingsService {

    @Inject
    @Welcome
    private String message;

    @Override
    public void print() {
        System.out.println(message);
    }
}
