package org.avol.guice.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.avol.guice.modules.ConstructorBindingsModule;
import org.avol.guice.service.ProviderService;
import org.avol.guice.service.impl.ProviderServiceImpl;
import org.junit.Test;

/**
 * Created by Durga on 9/23/2015.
 */
public class ConstructorBindingsExample {

    @Test
    public void testConstructorBindings() {
        Injector injector = Guice.createInjector(new ConstructorBindingsModule());
        ProviderService providerService = injector.getInstance(ProviderServiceImpl.class);
        providerService.print("Srilekha");
    }
}
