package com.example.usefragmentinvp.model;

public class Country {
    String name;
    String capital;
    String info;
    int flag;

    public Country(String name, String capital, String info, int flag) {
        this.name = name;
        this.capital = capital;
        this.info = info;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
