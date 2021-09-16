package com.vh.entities;

import com.vh.entities.enums.FuelType;
import com.vh.entities.enums.LicenseType;
import com.vh.entities.enums.TankCapacity;
import com.vh.entities.exceptions.FuelException;
import com.vh.interfaces.VehicleDriverAccessInterface;
import com.vh.interfaces.VehicleFuelMasterAccessInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle implements VehicleDriverAccessInterface, VehicleFuelMasterAccessInterface {
    private TankCapacity tankCapacity;
    private LicenseType type;
    private FuelType fuelType;
    private Coordinates coordinates;

    private int seatSize;
    private int seatHeight;

    @Override
    public void drive(LicenseType licenseType, Coordinates coordinates) throws IllegalAccessException {
        if(!licenseType.equals(type)){
            throw new IllegalAccessException();
        }
        else if(tankCapacity.equals(TankCapacity.LOW)){
            throw new FuelException(tankCapacity);
        }
        else if (coordinates.equals(this.coordinates)){
            throw new IllegalAccessException();
        }
        else{
            this.coordinates = coordinates;
            tankCapacity = TankCapacity.LOW;
        }
    }

    @Override
    public void settingSeat(int seatSize, int seatHeight) {
        this.seatSize = seatSize;
        this.seatHeight = seatHeight;
    }

    @Override
    public void fuelVehicle(FuelType fuelType) {
        if(tankCapacity.equals(TankCapacity.FULL)){
            throw new FuelException(tankCapacity);
        }
        else {
            tankCapacity = TankCapacity.FULL;
        }
    }
}
