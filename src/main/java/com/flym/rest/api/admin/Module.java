package com.flym.rest.api.admin;

import com.flym.rest.api.BaseApiDomain;

/**
 * Created by carlis on 17-1-1.
 */
public class Module extends BaseApiDomain {
    private String name;
    private String path;
    private String sort;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
