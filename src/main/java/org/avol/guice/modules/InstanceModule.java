package org.avol.guice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.avol.guice.annotations.Welcome;
import org.avol.guice.service.InstanceBindingsService;
import org.avol.guice.service.impl.InstanceBindingServiceImpl;

/**
 * Illustrates Guice Instance binding.
 *
 * Created by Durga on 9/23/2015.
 */
public class InstanceModule extends AbstractModule {
    @Override
    protected void configure() {
        //Avoid using .toInstance with objects that are complicated to create, since it can slow down application startup.
        // You can use an @Provides method instead.
        bind(String.class).annotatedWith(Welcome.class).toInstance("Instance Binding demo.");
        bind(InstanceBindingsService.class).to(InstanceBindingServiceImpl.class).in(Singleton.class);
    }
}
