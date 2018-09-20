package com.bis.serviceImpl;

import com.bis.service.UserService;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.bis.config.AppConstant;
import com.bis.dto.UserDto;
import com.bis.factory.MongoFactory;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Random;
@Transactional
public class UserServiceImpl implements UserService{
    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
    
    public ArrayList<UserDto> getAll(){
        logger.info("Inside UserServiceImpl getAll()");
        ArrayList<UserDto> userList = new ArrayList<UserDto>();
        DBCollection dbCollection = MongoFactory.getCollection(AppConstant.MONGO_DB_NAME, AppConstant.DB_COLLECTION);

        DBCursor dbCursor = dbCollection.find();
        while(dbCursor.hasNext())
        {
            DBObject dbObject = dbCursor.next();
            UserDto userDto = new UserDto();
            userDto.setId(dbObject.get("id").toString());
            userDto.setName(dbObject.get("name").toString());
            userList.add(userDto);
        }
        logger.debug("total user records : " + userList.size());
        
        return userList;
    }

    public boolean addUser(UserDto user){
        boolean result = false;
        logger.info("Inside UserService addUser()");
        Random random = new Random();
        try{
            DBCollection dbCollection = MongoFactory.getCollection(AppConstant.MONGO_DB_NAME, AppConstant.DB_COLLECTION);
            BasicDBObject basicDbObject = new BasicDBObject();
            basicDbObject.put("id", String.valueOf(random.nextInt(100)));
            basicDbObject.put("name", user.getName());
            dbCollection.insert(basicDbObject);
            result = true;
        }catch(Exception ex)
        {
            logger.error("An Occurred while saving a new User to MongoDB : " + ex.getMessage());
            result =false;
        }

        return result;
    }
    public boolean editUser(UserDto user){
        boolean result = false;
        logger.debug("Updating User Information Details");
        try{
            BasicDBObject updateDbObj = (BasicDBObject) getDBObject(user.getId());
            DBCollection dbCollection = MongoFactory.getCollection(AppConstant.MONGO_DB_NAME, AppConstant.DB_COLLECTION);
            BasicDBObject editUserObject = new BasicDBObject();
            editUserObject.put("id", user.getId());
            editUserObject.put("name",user.getName());
            dbCollection.update(updateDbObj, editUserObject);
            result = true;
        }
        catch(Exception xe){
            logger.error("Error Ocurred while updating User : " + xe);
            result = false;
        }
        return result;
    }
    public boolean deleteUser(String id){
        boolean result = false;
        logger.debug("Delete user by userId");
        try {
            BasicDBObject userObject = (BasicDBObject) getDBObject(id);
            DBCollection dbCollection = MongoFactory.getCollection(AppConstant.MONGO_DB_NAME, AppConstant.DB_COLLECTION);
            dbCollection.remove(userObject);
            result = true;
        } catch (Exception e) {
            logger.error("Error occured while deleting user : " + e);
            result = false;
        }
        return result;
    }
    public DBObject getDBObject(String id){
        DBCollection dbCollection = MongoFactory.getCollection(AppConstant.MONGO_DB_NAME, AppConstant.DB_COLLECTION);
        DBObject dbObject = new BasicDBObject();
        dbObject.put("id", id);
        return dbCollection.findOne(dbObject);
    }
    public UserDto findUser(String id){
        UserDto user = new UserDto();
        DBCollection dbCollection = MongoFactory.getCollection(AppConstant.MONGO_DB_NAME, AppConstant.DB_COLLECTION);
        DBObject dbObject = new BasicDBObject();
        dbObject.put("id", id);

        DBObject userObject = dbCollection.findOne(dbObject);
        user.setId(userObject.get("id").toString());
        user.setName(userObject.get("name").toString());
        return user;
    }
    
}