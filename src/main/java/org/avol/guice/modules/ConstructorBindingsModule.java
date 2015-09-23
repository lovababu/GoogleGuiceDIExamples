package org.avol.guice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.avol.guice.Connection;
import org.avol.guice.dao.GreetDao;
import org.avol.guice.dao.impl.ConstructorDaoImpl;
import org.avol.guice.service.ProviderService;
import org.avol.guice.service.impl.ProviderServiceImpl;

/**
 * Illustrate how to use Guice Constructor bindings. Ref: Guice user guide.
 *   --Occasionally it's necessary to bind a type to an arbitrary constructor.
 *     This comes up when the @Inject annotation cannot be applied to the target constructor:
 *     either because it is a third party class, or because multiple constructors that participate in dependency injection.
 *     @Provides methods provide the best solution to this problem! By calling your target constructor explicitly,
 *     you don't need reflection and its associated pitfalls.
 *     But there are limitations of that approach: manually constructed instances do not participate in AOP.
 *
 *  Spring?
 *    -- Through xml we have concept of Constructor injection and @Autowired annotation on constructor.
 *       But the dependency bean should be spring managed bean and should exist in container if not exist spring throw NoMatchingBeanFound Exception.
 *       But Guice will create object and satisfy injection and Even @Inject annotation not required to constructor.
 *
 * Created by Durga on 9/23/2015.
 */
public class ConstructorBindingsModule extends AbstractModule {
    @Override
    protected void configure() {

        try {
            //How Guice construct Connection object, Guice uses JIT Bindings to created Connection object.
            bind(GreetDao.class).toConstructor(ConstructorDaoImpl.class.getConstructor(Connection.class)).in(Singleton.class); //Each toConstructor() binding is scoped independently.
            bind(ProviderService.class).to(ProviderServiceImpl.class).in(Singleton.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
