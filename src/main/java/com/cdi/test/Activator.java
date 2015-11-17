/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 *
 * @author tosun_001
 */
public class Activator
        implements BundleActivator {

    private static final Logger LOG = Logger
            .getLogger(Activator.class.getName());

    public void start(BundleContext context) throws Exception {
        LOG.log(Level.INFO, "bundle started: {0}", context.getBundle()
                .getSymbolicName());
    }

    public void stop(BundleContext context) throws Exception {
        LOG.log(Level.INFO, "bundle stopped: {0}", context.getBundle()
                .getSymbolicName());

    }

}
