package com.sumarsono.spring.core;

public class Database {
    private static Database database;
    public static Database getInstance(){
        if(database == null){
            database = new Database();
        }
        return database;
    }
    public static Database getInstanceNew(){
        return new Database();
    }
    private Database(){
    }
}
