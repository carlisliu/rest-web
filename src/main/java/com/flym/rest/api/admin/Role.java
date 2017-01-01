package com.flym.rest.api.admin;

import com.flym.rest.api.BaseApiDomain;

/**
 * Created by carlis on 17-1-1.
 */
public class Role extends BaseApiDomain {
    private String name;
    private long moduleId;
    private int permission;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getModuleId() {
        return moduleId;
    }

    public void setModuleId(long moduleId) {
        this.moduleId = moduleId;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }
}
