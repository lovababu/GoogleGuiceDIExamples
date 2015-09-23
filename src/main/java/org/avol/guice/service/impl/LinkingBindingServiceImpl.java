package org.avol.guice.service.impl;

import org.avol.guice.dao.GreetDao;
import org.avol.guice.service.LinkingBindingService;

import javax.inject.Inject;

/**
 *
 * Created by Durga on 9/23/2015.
 */
public class LinkingBindingServiceImpl implements LinkingBindingService {

    @Inject
    private GreetDao welcomeDao;

    public LinkingBindingServiceImpl() {
        System.out.println("LinkingBindingServiceImpl.LinkingBindingServiceImpl");
    }

    @Override
    public void sayWelcome(String name) {
        welcomeDao.greet(name);
    }

}
