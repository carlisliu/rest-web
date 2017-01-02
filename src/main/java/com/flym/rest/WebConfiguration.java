package com.flym.rest;

import com.flym.rest.bundles.MyConfiguredBundle;
import com.flym.rest.bundles.MyConfiguredBundleConfig;
import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;

import javax.validation.constraints.*;

public class WebConfiguration extends Configuration implements MyConfiguredBundleConfig {
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    @Override
    public String getBundleSpecificConfig() {
        return "custome config...";
    }
}
