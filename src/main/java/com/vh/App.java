package com.vh;


import com.vh.entities.Coordinates;
import com.vh.entities.Driver;
import com.vh.entities.FuelMaster;
import com.vh.entities.Vehicle;
import com.vh.entities.enums.FuelType;
import com.vh.entities.enums.LicenseType;
import com.vh.entities.enums.TankCapacity;
import com.vh.interfaces.VehicleDriverAccessInterface;
import com.vh.interfaces.VehicleFuelMasterAccessInterface;

public class App {

    public static void main( String[] args ) {

        Vehicle vehicle = new Vehicle(TankCapacity.LOW, LicenseType.B, FuelType.NORMAL, new Coordinates(1, 5), 20, 150);
        VehicleFuelMasterAccessInterface vehicleForFuelMaster = vehicle;
        VehicleDriverAccessInterface vehicleForDriver = vehicle;
        Driver driver = new Driver(LicenseType.B, 180, 25, new Coordinates(10,15));
        FuelMaster fuelMaster = new FuelMaster(FuelType.NORMAL);

        vehicleForFuelMaster.fuelVehicle(fuelMaster.getFuelType());
        vehicleForDriver.settingSeat(driver.getSize(), driver.getHeight());
        try{
            vehicleForDriver.drive(driver.getLicenseType(), driver.getDestinationPoint());
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}