package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

@Table(name = "tbl_userinfo")//告诉java实体类跟数据库中的tbl_userinfo表存在orm关系
public class UserInfo implements Serializable {
    /**
     *
     @Id告诉mybatis框架，此列是主键
     */
    @Id
    private Integer id;
    /**
     *
     @Column告诉mybatis框架，此属性是对应数据库中的列名，
     如果属性名跟列名相同，此处可以不写
     */
    @Column(name = "username")
    private String username;

    private String password;

    private Date createtime;

    /**
     * 凡事加上  @Transient注解的属性，不进行持久化，不跟数据库对应
     */
    @Transient
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}