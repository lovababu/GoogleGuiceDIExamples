package org.avol.guice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.avol.guice.dao.GreetDao;
import org.avol.guice.dao.impl.WelcomeDaoImpl;
import org.avol.guice.service.LinkingBindingService;
import org.avol.guice.service.impl.LinkingBindingServiceImpl;

/**
 * Illustrate Guice Linked Binding and Singleton scope. Ref Guice user guide.
 *   -- Bind implementation class to interface using bind() and to() static methods.
 * Spring?
 *   -- Direct @Bean registration in configuration class with optional name attribute or <bean id='' class='..'/> in xml.
 *   -- If the bean not found in container, Spring throws NoSuchABeanException, but Guice uses Just In Time Bindings.
 *
 * Created by Durga on 9/23/2015.
 */
public class LinkingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(GreetDao.class).to(WelcomeDaoImpl.class).asEagerSingleton(); //Singleton instance created eagerly.
        bind(LinkingBindingService.class).to(LinkingBindingServiceImpl.class).in(Singleton.class); //Singleton instance created when app required.
        /**
         *  Remove the above <code> LinkingBindingService </code> binding and run the test class, you don't see any error.
         *  The reason is Guice uses Just In Time Bindings to create requested object. JIT bindings also known as implicit bindings.
         */
    }
}
