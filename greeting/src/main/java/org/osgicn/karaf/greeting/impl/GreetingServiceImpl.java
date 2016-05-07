package org.osgicn.karaf.greeting.impl;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Service;
import org.osgicn.karaf.greeting.api.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wenjian on 16-5-7.
 */
@Component(immediate = true)
@Service
public class GreetingServiceImpl implements GreetingService {

    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Activate
    public void activate() {
        log.info("we are in the GreetingServiceImpl activate()");
    }

    @Deactivate
    public void deactivate() {
        log.info("we are in the GreetingServiceImpl deactivate()");
    }

    public void startGreeting() {
        System.out.println("greeting from greeting service");
    }

    public void stopGreeting() {
        System.out.println("stop greeting from greeting service");
    }
}
