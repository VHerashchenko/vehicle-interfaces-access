package com.vh.entities;

import com.vh.entities.enums.LicenseType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Driver {
    LicenseType licenseType;
    int height;
    int size;
    Coordinates destinationPoint;
}