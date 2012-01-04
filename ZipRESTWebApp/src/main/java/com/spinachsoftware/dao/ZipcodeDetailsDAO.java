package com.spinachsoftware.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.spinachsoftware.restful.entity.ZipcodeDetails;

public class ZipcodeDetailsDAO implements IZipcodeDetailsDAO 
{

	private List<ZipcodeDetails> allzipcodes;
	
	/* Initialize and populate the constructor with some default zipcodes.
	 */
	public ZipcodeDetailsDAO()
	{
		this.allzipcodes = new ArrayList<ZipcodeDetails>(Arrays.asList(new ZipcodeDetails("55401", "Minneapolis","Minnesota"), new ZipcodeDetails("55436", "Minneapolis", "Minnesota"), new ZipcodeDetails("55414", "Arden Hills", "Minnesota")));
	}

	/* 
	 * Find a unique zipcode by id
	 * @param id to be searched
	 * @return unique zipcode matched or null.
	 */
	public ZipcodeDetails getZipCodeDetailsById(String id) 
	{
        for (ZipcodeDetails zipcodeDetails : this.allzipcodes) 
        {
        	if(zipcodeDetails.getZipcodeId().equals(id))
        		return zipcodeDetails;
		}
        return null;
	}

	/* 
	 * Find all zipcodes for the city
	 * @param cityName to be searched
	 * @return List of ZipcodeDetails that are matched or an empty list.
	 */
	public List<ZipcodeDetails> getZipCodeDetailsByCity(String cityName) 
	{
		List<ZipcodeDetails> matchedZipcodes = new ArrayList<ZipcodeDetails>();
		for (ZipcodeDetails zipcodeDetails : this.allzipcodes) 
		{
			if (zipcodeDetails.getCityName().equalsIgnoreCase(cityName))
			{
				matchedZipcodes.add(zipcodeDetails);
			}
		}
		return matchedZipcodes;
	}
	
	/* 
	 * Find all zipcodes for the state
	 * @param stateName to be searched
	 * @return List of ZipcodeDetails that are matched or an empty list.
	 */
	public List<ZipcodeDetails> getZipCodeDetailsByState(String stateName) 
	{
		List<ZipcodeDetails> matchedZipcodes = new ArrayList<ZipcodeDetails>();
		for (ZipcodeDetails zipcodeDetails : this.allzipcodes) 
		{
			if (zipcodeDetails.getState().equalsIgnoreCase(stateName))
			{
				matchedZipcodes.add(zipcodeDetails);
			}
		}
		return matchedZipcodes;
	}

}
