package com.spinachsoftware.dao;

import java.util.List;

import com.spinachsoftware.restful.entity.ZipcodeDetails;

public interface IZipcodeDetailsDAO {

	/**
	 * Gets details for zipcode.
	 * 
	 */
	public abstract ZipcodeDetails getZipCodeDetailsById(String id);
	
	/**
	 * Gets details for city.
	 * 
	 */
	public abstract List<ZipcodeDetails> getZipCodeDetailsByCity(String city);
	
	/**
	 * Gets details for state.
	 * 
	 */
	public abstract List<ZipcodeDetails> getZipCodeDetailsByState(String state);

}