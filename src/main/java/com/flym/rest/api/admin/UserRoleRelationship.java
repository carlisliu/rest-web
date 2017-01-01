package com.flym.rest.api.admin;

import com.flym.rest.api.BaseApiDomain;

/**
 * Created by carlis on 17-1-1.
 */
public class UserRoleRelationship extends BaseApiDomain {
    private String userId;
    private long roleId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }
}
