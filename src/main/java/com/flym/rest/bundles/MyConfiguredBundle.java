package com.flym.rest.bundles;

import io.dropwizard.ConfiguredBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by carlis on 17-1-2.
 */
public class MyConfiguredBundle implements ConfiguredBundle<MyConfiguredBundleConfig> {
    @Override
    public void run(MyConfiguredBundleConfig configuration, Environment environment) throws Exception {
        String config = configuration.getBundleSpecificConfig();
        System.out.println(config);
    }

    @Override
    public void initialize(Bootstrap<?> bootstrap) {

    }
}


