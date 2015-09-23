package org.avol.guice.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.avol.guice.modules.UnTargettedBindingsModule;
import org.avol.guice.service.ConcreteService;
import org.junit.Test;

/**
 * Created by Durga on 9/23/2015.
 */
public class UnTargettedBindingsExample {

    @Test
    public void testUnTargettedBindings() {
        Injector injector = Guice.createInjector(new UnTargettedBindingsModule());
        ConcreteService concreteService = injector.getInstance(ConcreteService.class);
        concreteService.print();
    }
}
