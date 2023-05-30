package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户实体类")
public class User {

    @ApiModelProperty(value = "用户唯一标识")
    private Long id;

    @ApiModelProperty(value = "用户姓名")
    private String username;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "Select_priv")
    private String Select_priv;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getSelect_priv() {
        return Select_priv;
    }
    public void setSelect_priv(String Select_priv) {
        this.Select_priv = Select_priv;
    }

    public User(Long id, String username, String password, String Select_priv) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.Select_priv = Select_priv;
    }

    public User() {
    }
}
