package org.avol.guice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.avol.guice.annotations.Welcome;
import org.avol.guice.bindings.GreetDaoProvider;
import org.avol.guice.dao.GreetDao;
import org.avol.guice.service.ProviderService;
import org.avol.guice.service.impl.ProviderServiceImpl;

/**
 * Illustrate Guice Provider Bindings. Ref Guice user guide.
 *   -- When your @Provides methods start to grow complex, you may consider moving them to a class of their own.
 *     The provider class implements Guice's Provider interface
 * Spring?
 *   -- Direct @Bean registration in configuration class with optional name attribute.
 *   -- Spring we have 4types of Autowiring techniques, default is byType. in case of multiple same type beans existed in
 *      container we have to use byName auto-wire with @Qualifier annotation to avoid ambiguity.
 *
 * Created by Durga on 9/23/2015.
 */
public class ProviderModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Welcome.class).toInstance("Hello %s, welcome to Guice Provider Binding Demo.");
        bind(GreetDao.class).toProvider(GreetDaoProvider.class).in(Singleton.class);
        bind(ProviderService.class).to(ProviderServiceImpl.class).in(Singleton.class);
    }
}
