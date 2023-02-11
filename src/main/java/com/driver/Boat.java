package com.driver;

public class Boat implements WaterVehicle {

    private String name;

    private int capacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public int getVehicleCapacity() {
        // TODO Auto-generated method stub
        return capacity;
    }

    @Override
    public String getVehicleName() {
        // TODO Auto-generated method stub
        return name;
    }

}