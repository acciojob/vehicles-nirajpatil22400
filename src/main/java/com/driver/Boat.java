package com.driver;

public class Boat implements WaterVehicle {

    private String name;

    private int capacity;

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