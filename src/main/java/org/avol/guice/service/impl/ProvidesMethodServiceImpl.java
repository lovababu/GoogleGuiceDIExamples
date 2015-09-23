package org.avol.guice.service.impl;

import org.avol.guice.dao.GreetDao;
import org.avol.guice.service.ProvidesMethodService;

import javax.inject.Inject;

/**
 * Created by Durga on 9/23/2015.
 */
public class ProvidesMethodServiceImpl implements ProvidesMethodService {

    @Inject
    private GreetDao providesDao;

    @Override
    public void greet(String name) {
        providesDao.greet(name);
    }
}
