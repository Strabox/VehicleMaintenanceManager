package com.pt.pires.controllers.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pt.pires.controllers.ControllerExceptionHandler;
import com.pt.pires.services.local.ILicenseService;

/**
 * Rest endpoints for license services
 * @author André
 *
 */
@RestController
public class LicenseControllerRest extends ControllerExceptionHandler {

	@Autowired
	@Qualifier("licenseService")
	private ILicenseService licenseService;
	
	
	/**
	 * Verify if a given license is valid or not
	 * @param license Given license through HTTP Get Parameter
	 * @return 200 (OK) if valid, 4XX (NOT OK) otherwise
	 */
	@RequestMapping(value = "/license",method = RequestMethod.GET,params = {"license"})
	public ResponseEntity<String> validateLicense(@RequestParam(value = "license", required = true) String license) {
		System.out.println("[Validate License] " + license);
		if(!licenseService.validateLicense(license)) {
			return new ResponseEntity<String>(HttpStatus.CONFLICT);
		}
		else { 
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}
	
}
