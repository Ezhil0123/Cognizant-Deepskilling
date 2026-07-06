package com.example;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public String fetchById(int id) {
        return api.getDataById(id);
    }

    public void save(String data) {
        api.saveData(data);
    }

    public void delete() {
        api.deleteData();
    }

    public void process(Logger logger) {
        logger.start();
        logger.log("Processing...");
        logger.end();
    }
}