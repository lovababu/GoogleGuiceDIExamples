package org.avol.guice.bindings;

import com.google.inject.Provider;
import org.avol.guice.annotations.Welcome;
import org.avol.guice.dao.GreetDao;
import org.avol.guice.dao.impl.ProvidesDaoImpl;

import javax.inject.Inject;

/**
 * Created by Durga on 9/23/2015.
 */
public class GreetDaoProvider implements Provider<GreetDao> {

    @Inject
    @Welcome
    private String message;

    @Override
    public GreetDao get() {
        return new ProvidesDaoImpl(message);
    }


}
