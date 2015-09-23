package org.avol.guice.service;

import org.avol.guice.dao.ConcreteDao;

import javax.inject.Inject;

/**
 * Created by Durga on 9/23/2015.
 */
public class ConcreteService {

    @Inject
    private ConcreteDao concreteDao;

    public void print(){
        concreteDao.print();
    }
}
