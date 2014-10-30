package com.csg.rest.services;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
 
 
@ApplicationPath("/")
public class ApplicationConfig extends Application {
    @SuppressWarnings("unchecked")
    public Set<Class<?>> getClasses() {
    	return super.getClasses();
    }
}