package org.avol.guice.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.avol.guice.modules.BindingAnnotationModule;
import org.avol.guice.service.BindingAnnotationService;
import org.avol.guice.service.impl.BindingAnnotationServiceImpl;
import org.junit.Test;

/**
 * Created by Durga on 9/23/2015.
 */
public class BindingAnnotationsExample {

    @Test
    public void testBindingAnnotaitons() {
        Injector injector = Guice.createInjector(new BindingAnnotationModule());

        BindingAnnotationService bindingAnnotationService = injector.getInstance(BindingAnnotationServiceImpl.class);
        bindingAnnotationService.sayWelcome("Srilekha");
        bindingAnnotationService.sayFarewell("Srilekha");
    }
}
