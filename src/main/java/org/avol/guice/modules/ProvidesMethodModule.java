package org.avol.guice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import org.avol.guice.dao.GreetDao;
import org.avol.guice.dao.impl.ProvidesDaoImpl;
import org.avol.guice.service.ProvidesMethodService;
import org.avol.guice.service.impl.ProvidesMethodServiceImpl;

/**
 * Illustrates Guice @Provides method, Ref: guice user guide.
 *  -- When you need to create an object, use @Provides method. Guice uses this object to satisfy dependency graph.
 *
 * Spring?
 *  -- Direct @Bean registration in configuration class with optional name attribute.
 *
 * Created by Durga on 9/23/2015.
 */
public class ProvidesMethodModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ProvidesMethodService.class).to(ProvidesMethodServiceImpl.class).in(Singleton.class);
    }

    @Provides
    public GreetDao providesDao() {
        //My self instantiating object and returning the same type.
        return new ProvidesDaoImpl("Hello %s welcome to Guice @Provides Demo.");
    }
}
