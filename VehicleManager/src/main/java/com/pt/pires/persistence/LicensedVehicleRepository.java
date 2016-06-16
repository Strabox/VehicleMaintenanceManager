package com.pt.pires.persistence;

import org.springframework.data.repository.CrudRepository;

import com.pt.pires.domain.VehicleLicensed;

public interface LicensedVehicleRepository extends CrudRepository<VehicleLicensed, String>{

}
