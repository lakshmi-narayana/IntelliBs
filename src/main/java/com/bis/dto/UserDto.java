package com.bis.dto;

import java.io.Serializable;

public class UserDto implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;

    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}