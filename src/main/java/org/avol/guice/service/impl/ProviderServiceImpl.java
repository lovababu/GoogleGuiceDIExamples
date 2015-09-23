package org.avol.guice.service.impl;

import org.avol.guice.dao.GreetDao;
import org.avol.guice.service.ProviderService;

import javax.inject.Inject;

/**
 * Created by Durga on 9/23/2015.
 */
public class ProviderServiceImpl implements ProviderService {

    @Inject
    private GreetDao greetDao;

    @Override
    public void print(String name) {
        System.out.println("ProviderServiceImpl.print");
        greetDao.greet(name);
    }
}
