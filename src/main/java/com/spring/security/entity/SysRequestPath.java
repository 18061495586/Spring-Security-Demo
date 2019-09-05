package com.spring.security.entity;

import java.io.Serializable;

/**
 * 请求路径(SysRequestPath)实体类
 *
 * @author makejava
 * @since 2019-09-04 17:11:16
 */
public class SysRequestPath implements Serializable {
    private static final long serialVersionUID = -38398465698914714L;
    //主键id
    private Integer id;
    //请求路径
    private String url;
    //路径描述
    private String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}