package com.flym.rest;

import com.flym.rest.bundles.MyConfiguredBundle;
import com.flym.rest.db.PersonDAO;
import com.flym.rest.health.TemplateHealthCheck;
import com.flym.rest.resources.HelloResource;
import com.flym.rest.resources.admin.UserResource;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

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
        //bootstrap.addBundle(new AssetsBundle("/assets/css", "/css", null, "css"));
    }

    @Override
    public void run(final WebConfiguration configuration,
                    final Environment environment) {
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDatabase(), "postgresql");
        final PersonDAO dao = jdbi.onDemand(PersonDAO.class);
        final HelloResource resource = new HelloResource(configuration.getTemplate(), configuration.getDefaultName());
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
        final UserResource userResource = new UserResource(dao);
        environment.jersey().register(userResource);
    }

}
