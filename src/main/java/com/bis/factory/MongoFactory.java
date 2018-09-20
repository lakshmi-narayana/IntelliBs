package com.bis.factory;

import com.bis.config.AppConstant;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

import org.apache.log4j.Logger;

public class MongoFactory{
    private static final Logger logger = Logger.getLogger(MongoFactory.class);
    private static Mongo mongo;

    private MongoFactory()
    {

    }
    public static Mongo getMongo(){
        if(mongo == null)
        {
            try{
                mongo = new Mongo(AppConstant.HOST_NAME);
                logger.info("Created a Mongo Connection instances");
            }
            catch(MongoException me)
            {
                logger.error(me);
            }
        }
        return mongo;
    }
    public static DB getDb(String dbName)
    {
        return getMongo().getDB(dbName);
    }
    public static DBCollection getCollection(String dbName, String dbCollection)
    {
        return getDb(dbName).getCollection(dbCollection);
    }
}