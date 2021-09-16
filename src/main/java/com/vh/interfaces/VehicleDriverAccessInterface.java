package com.vh.interfaces;

import com.vh.entities.Coordinates;
import com.vh.entities.enums.LicenseType;

public interface VehicleDriverAccessInterface {

    void drive(LicenseType licenseType, Coordinates coordinates) throws IllegalAccessException;

    void settingSeat(int seatSize, int seatHeight);
}
