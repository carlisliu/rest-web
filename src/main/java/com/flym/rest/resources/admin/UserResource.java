package com.flym.rest.resources.admin;

import com.codahale.metrics.annotation.Timed;
import com.flym.rest.api.admin.SysUser;
import com.flym.rest.resources.Result;
import io.dropwizard.jersey.params.LongParam;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by carlis on 17-1-1.
 */
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    public UserResource() {
    }

    @GET
    @Timed
    public Result<SysUser> findAll() {
        Result<SysUser> result = new Result<SysUser>();
        result.setResult(null);
        return result;
    }

    @Path("/{userId}")
    @GET
    @Timed
    public Result<SysUser> find(@PathParam("name") LongParam userId) {
        //final String value = String.format(template, name.orElse(defaultName));
        SysUser user = findSysUserById(userId.get());
        Result<SysUser> result = new Result<SysUser>();
        result.setResult(user);
        return result;
    }

    private SysUser findSysUserById(long userId) {
        return null;
    }

    @PUT
    @Timed
    public Result<SysUser> save(@NotNull @Valid SysUser sysUser) {
        SysUser user = findSysUserById(sysUser.getId());
        Result<SysUser> result = new Result<SysUser>();
        if (user != null) {
            result.setError("user already existed.");
        } else {
            saveSysUser(sysUser);
            result.setResult(user);
        }
        return result;
    }

    private SysUser saveSysUser(SysUser user) {
        return user;
    }

    @POST
    @Timed
    public Result<SysUser> update(@NotNull @Valid SysUser sysUser) {
        SysUser user = findSysUserById(sysUser.getId());
        Result<SysUser> result = new Result<SysUser>();
        if (user != null) {
            result.setError("user already existed.");
        } else {
            saveSysUser(sysUser);
            result.setResult(user);
        }
        return result;
    }

    private SysUser updateSysUser(SysUser user) {
        return user;
    }

    @DELETE
    @Timed
    public Result<SysUser> delete(@NotNull @Valid SysUser sysUser) {
        SysUser user = findSysUserById(sysUser.getId());
        Result<SysUser> result = new Result<SysUser>();
        if (user != null) {
            throw new WebApplicationException("user already existed.", Response.Status.NOT_FOUND);
        } else {
            saveSysUser(sysUser);
            result.setResult(user);
        }
        return result;
    }
}
