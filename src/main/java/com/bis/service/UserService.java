package com.bis.service;

import java.util.ArrayList;
import com.bis.dto.UserDto;
import com.mongodb.DBObject;

public interface UserService{
    /**
     * 
     * @return List of User's
     */
    public ArrayList<UserDto> getAll();

    /**
     * 
     * @param userDto
     * @return true if user added successfully or false not added
     */
    public boolean addUser(UserDto user);
    /**
     * 
     * @param user
     * @return true or false;
     */
    public boolean editUser(UserDto user);
    /**
     * 
     * @param id
     * @return true if user deleted or false if not successfully
     */
    public boolean deleteUser(String id);
    /**
     * 
     * @param id
     * @return Mongodb Objects
     */
    public DBObject getDBObject(String id);

    /**
     * 
     * @param id
     * @return user details
     */
    public UserDto findUser(String id);
}