package org.osgicn.karaf.hello.impl;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Service;
import org.osgicn.karaf.hello.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by root on 16-5-6.
 */
@Component(immediate = true)
@Service
public class HelloServiceImpl implements HelloService{

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Activate
    public void activate() {
        log.info("we are in the HelloService activate()");
    }

    @Deactivate
    public void deactivate() {
        log.info("we are in the HelloService deactivate()");
    }

    public void sayHello() {
        System.out.println("say hello from hello service");
    }
}
