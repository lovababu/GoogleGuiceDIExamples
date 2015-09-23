package org.avol.guice.dao.impl;

import org.avol.guice.dao.GreetDao;

/**
 * Created by Durga on 9/23/2015.
 */
public class ProvidesDaoImpl implements GreetDao {

    private final String message;

    public ProvidesDaoImpl(String message) {
        this.message = message;
    }

    @Override
    public void greet(String name) {
        System.out.println(String.format(message, name));
    }
}
