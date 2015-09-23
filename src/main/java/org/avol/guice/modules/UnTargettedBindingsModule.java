package org.avol.guice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.avol.guice.dao.ConcreteDao;
import org.avol.guice.service.ConcreteService;

/**
 * Illustrates the Untargetted Bindings. Ref: Guice User guide.
 *   -- You may create bindings without specifying a target. Un targetted bindings have no 'to' clause.
 *
 * Created by Durga on 9/23/2015.
 */
public class UnTargettedBindingsModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ConcreteDao.class).in(Singleton.class);
        bind(ConcreteService.class).in(Singleton.class);
    }
}
