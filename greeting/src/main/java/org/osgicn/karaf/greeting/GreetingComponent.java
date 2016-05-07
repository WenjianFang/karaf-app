package org.osgicn.karaf.greeting;

import org.apache.felix.scr.annotations.*;
import org.osgicn.karaf.greeting.api.GreetingService;
import org.osgicn.karaf.hello.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wenjian on 16-5-7.
 */
@Component(immediate = true)
public class GreetingComponent {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Reference(cardinality = ReferenceCardinality.MANDATORY_UNARY)
    private HelloService helloService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY_UNARY)
    private GreetingService greetingService;

    @Activate
    public void activate() {
        log.info("we are in the GreetingComponent activate()");
        helloService.sayHello();
        greetingService.startGreeting();
    }

    @Deactivate
    public void deactivate() {
        log.info("we are in the GreetingComponent deactivate()");
        greetingService.stopGreeting();
    }
}
