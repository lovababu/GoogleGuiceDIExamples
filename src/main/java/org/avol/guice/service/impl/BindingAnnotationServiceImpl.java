package org.avol.guice.service.impl;

import org.avol.guice.annotations.Farewell;
import org.avol.guice.dao.GreetDao;
import org.avol.guice.service.BindingAnnotationService;

import javax.inject.Inject;

/**
 *
 * Created by Durga on 9/23/2015.
 */
public class BindingAnnotationServiceImpl implements BindingAnnotationService {

    @Inject
    private GreetDao welcomeDao;

    @Inject
    @Farewell
    private GreetDao farewellDao;

    @Override
    public void sayWelcome(String name) {
        welcomeDao.greet(name);
    }

    @Override
    public void sayFarewell(String name) {
        farewellDao.greet(name);
    }
}
