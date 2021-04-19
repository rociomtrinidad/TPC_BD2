package com.grupo_bd2.tpc.config;

public class Config {

    private String dbUri;
    private static Config config = null;

    public static Config getInstance() {

        if(config==null) {
            config = new Config();
        }

        return config;
    }

    private Config() {
        this.dbUri = "mongodb://localhost:27017";
    }

    public String getDbUri() {
        return dbUri;
    }
    public void setDbUri(String dbUri) {
        this.dbUri = dbUri;
    }

}
