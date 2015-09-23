package org.avol.guice.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.avol.guice.modules.ProviderModule;
import org.avol.guice.service.ProviderService;
import org.avol.guice.service.impl.ProviderServiceImpl;
import org.junit.Test;

/**
 *
 *
 * Created by Durga on 9/23/2015.
 */
public class ProviderBindingsExample {

    @Test
    public void testProviderBindings() {
        Injector injector = Guice.createInjector(new ProviderModule());
        ProviderService providerService = injector.getInstance(ProviderServiceImpl.class);
        providerService.print("Srilekha");
    }
}
