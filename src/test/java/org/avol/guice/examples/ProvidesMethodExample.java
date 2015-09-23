package org.avol.guice.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.avol.guice.modules.ProvidesMethodModule;
import org.avol.guice.service.ProvidesMethodService;
import org.avol.guice.service.impl.ProvidesMethodServiceImpl;
import org.junit.Test;

/**
 * Created by Durga on 9/23/2015.
 */
public class ProvidesMethodExample {

    @Test
    public void testProfilesMethod(){
        Injector injector = Guice.createInjector(new ProvidesMethodModule());
        ProvidesMethodService providesMethodService = injector.getInstance(ProvidesMethodServiceImpl.class);
        providesMethodService.greet("Srilekha");
    }
}
