package org.avol.guice.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.avol.guice.modules.LinkingModule;
import org.avol.guice.service.LinkingBindingService;
import org.avol.guice.service.impl.LinkingBindingServiceImpl;
import org.junit.Test;

/**
 * Created by Durga on 9/24/2015.
 */
public class OnDemandInjectionExample {

    @Test
    public void testOnDemandInjection() {
        Injector injector = Guice.createInjector(new LinkingModule());
        //LinkingBindingService is not Guice managed Object, still we can inject dependencies using Injector#injectMembers() method.
        /**
         * In Spring?
         * <code> ApplicationContext ctx = ...; Either create ApplicationContext or get it from ApplicationContexAware class.
            YourClass someBeanNotCreatedBySpring = new YourClass();
            ctx.getAutowireCapableBeanFactory().autowireBeanProperties(
            someBeanNotCreatedBySpring,
            AutowireCapableBeanFactory.AUTOWIRE_AUTODETECT, true);
         </code>
         */
        LinkingBindingService linkingBindingService = new LinkingBindingServiceImpl();
        injector.injectMembers(linkingBindingService);
        linkingBindingService.sayWelcome("Srilekha");
    }
}

