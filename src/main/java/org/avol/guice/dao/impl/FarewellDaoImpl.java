package org.avol.guice.dao.impl;

import org.avol.guice.dao.GreetDao;

/**
 * Created by Durga on 9/23/2015.
 */
public class FarewellDaoImpl implements GreetDao {


    @Override
    public void greet(String name) {
        System.out.println(String.format("Farewell dear %s", name));
    }
}
