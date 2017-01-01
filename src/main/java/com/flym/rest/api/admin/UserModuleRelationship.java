package com.flym.rest.api.admin;

import com.flym.rest.api.BaseApiDomain;

/**
 * Created by carlis on 17-1-1.
 */
public class UserModuleRelationship extends BaseApiDomain {
    private String userId;
    private long moduleId;
    private int permission;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
