package com.flym.rest.api.auth;

import com.flym.rest.api.BaseApiDomain;
import com.flym.rest.api.admin.Department;
import com.flym.rest.api.admin.Module;

import java.util.List;

/**
 * Created by carlis on 17-1-1.
 */
public class User extends BaseApiDomain {
    private String userId;
    private String name;
    private String nickname;
    private String email;
    private String cell;
    private String password;
    private List<Department> departments;
    private List<Module> modules;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}
