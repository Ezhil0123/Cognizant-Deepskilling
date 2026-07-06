package com.example;

public interface ExternalApi {

    String getData();

    String getDataById(int id);

    void saveData(String data);

    void deleteData();

}