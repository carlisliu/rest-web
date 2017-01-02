package com.flym.rest;

import com.flym.rest.bundles.MyConfiguredBundle;
import com.flym.rest.health.TemplateHealthCheck;
import com.flym.rest.resources.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class WebApplication extends Application<WebConfiguration> {

    public static void main(final String[] args) throws Exception {
        new WebApplication().run(args);
    }

    @Override
    public String getName() {
        return "Web";
    }

    @Override
    public void initialize(final Bootstrap<WebConfiguration> bootstrap) {
        bootstrap.addBundle(new MyConfiguredBundle());
    }

    @Override
    public void run(final WebConfiguration configuration,
                    final Environment environment) {
        final HelloResource resource = new HelloResource(configuration.getTemplate(), configuration.getDefaultName());
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }

}
