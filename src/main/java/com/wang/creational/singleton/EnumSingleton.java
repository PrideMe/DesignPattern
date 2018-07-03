package com.wang.creational.singleton;

/**
 * @author wang.
 * @date 2018/7/3.
 * Description: 基于枚举机制实现单例，
 */
public enum EnumSingleton {
    INSTANCE;
    private DBConnection connection;
    EnumSingleton() {
        connection = new DBConnection();
    }
    public DBConnection getInstance() {
        return connection;
    }
}
class DBConnection{}