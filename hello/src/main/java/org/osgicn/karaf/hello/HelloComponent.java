package org.osgicn.karaf.hello;

import org.apache.felix.scr.annotations.*;
import org.osgicn.karaf.hello.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by root on 16-5-6.
 */
@Component(immediate = true)
public class HelloComponent {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Reference(cardinality = ReferenceCardinality.MANDATORY_UNARY)
    private HelloService helloService;

    @Activate
    public void activate() {
        log.info("we are in the HelloComponent activate()");

        helloService.sayHello();
    }

    @Deactivate
    public void deactivate() {
        log.info("we are in the HelloComponent deactivate()");
    }
}
