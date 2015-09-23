package org.avol.guice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.avol.guice.annotations.Farewell;
import org.avol.guice.dao.GreetDao;
import org.avol.guice.dao.impl.FarewellDaoImpl;
import org.avol.guice.dao.impl.WelcomeDaoImpl;
import org.avol.guice.service.BindingAnnotationService;
import org.avol.guice.service.impl.BindingAnnotationServiceImpl;

/**
 * Illustrates how to use Guice Binding Annotations. Ref Guice user guide.
 *   -- If multiple bindings with same type, we should use BindingAnnotations.
 *
 * Spring?
 *   -- Direct @Bean registration in configuration class with optional name attribute or <bean/> in xml.
 *   -- Spring we have 4types of Autowiring techniques, default is byType. in case of multiple same type beans existed in
 *      container we have to use byName auto-wire with @Qualifier annotation to avoid ambiguity.
 *
 * Created by Durga on 9/23/2015.
 */
public class BindingAnnotationModule extends AbstractModule {

    @Override
    protected void configure() {
        //Default implementation is WelcomeDaoImpl.
        bind(GreetDao.class).to(WelcomeDaoImpl.class).in(Singleton.class);
        bind(GreetDao.class).annotatedWith(Farewell.class).to(FarewellDaoImpl.class).in(Singleton.class);
        bind(BindingAnnotationService.class).to(BindingAnnotationServiceImpl.class).in(Singleton.class);
    }
}
