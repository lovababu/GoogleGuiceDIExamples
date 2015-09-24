package org.avol.guice.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.avol.guice.modules.LinkingModule;
import org.avol.guice.service.LinkingBindingService;
import org.avol.guice.service.impl.LinkingBindingServiceImpl;
import org.junit.Test;

/**
 * Illustrates how to use Guice module to specify the LinkedBindings in object graph.
 *
 * Created by Durga on 9/23/2015.
 */
public class LinkedBindingsExample {

    @Test
    public void testGuiceModule(){
        Injector guiceInjector = Guice.createInjector(new LinkingModule());
        //comment below two lines and observer sys out.
        LinkingBindingService linkingBindingService = guiceInjector.getInstance(LinkingBindingServiceImpl.class);
        linkingBindingService.sayWelcome("Srilekha");

        //call getInstance(LinkingBindingServiceImpl.class) and observe the instance reference.
    }
}


