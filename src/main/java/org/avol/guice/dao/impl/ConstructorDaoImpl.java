package org.avol.guice.dao.impl;

import org.avol.guice.Connection;
import org.avol.guice.dao.GreetDao;

/**
 * Created by Durga on 9/23/2015.
 */
public class ConstructorDaoImpl implements GreetDao {

    private Connection connection;

    public ConstructorDaoImpl(Connection connection) {
        this.connection = connection;
    }
    @Override
    public void greet(String name) {
        System.out.println(String.format("Hello %s welcome to Guice Constructor Binding Demo.", name));
        connection.print();
    }
}
