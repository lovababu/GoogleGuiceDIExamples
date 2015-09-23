package org.avol.guice.dao;

import com.google.inject.ImplementedBy;
import org.avol.guice.dao.impl.WelcomeDaoImpl;

/**
 * Created by Durga on 9/23/2015.
 */

// To specify default implementation for this interface, when JIT Binding uses.
// It uses compile time dependency from the interface to its implementation.
@ImplementedBy(WelcomeDaoImpl.class)
public interface GreetDao {
    void greet(String name);
}
