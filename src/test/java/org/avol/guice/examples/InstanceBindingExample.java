package org.avol.guice.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.avol.guice.modules.InstanceModule;
import org.avol.guice.service.InstanceBindingsService;
import org.avol.guice.service.impl.InstanceBindingServiceImpl;
import org.junit.Test;

/**
 * Created by Durga on 9/23/2015.
 */
public class InstanceBindingExample {

    @Test
    public void testInstanceBinding() {
        Injector injector = Guice.createInjector(new InstanceModule());
        InstanceBindingsService instanceBindingsService = injector.getInstance(InstanceBindingServiceImpl.class);
        instanceBindingsService.print();
    }
}
