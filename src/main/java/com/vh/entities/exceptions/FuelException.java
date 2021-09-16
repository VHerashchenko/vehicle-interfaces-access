package com.vh.entities.exceptions;

import com.vh.entities.enums.TankCapacity;

public class FuelException extends RuntimeException {
    public FuelException(TankCapacity tankCapacity){
        super(tankCapacity.toString());
    }
}
