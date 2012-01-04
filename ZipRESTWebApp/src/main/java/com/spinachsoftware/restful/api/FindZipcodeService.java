package com.spinachsoftware.restful.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spinachsoftware.dao.IZipcodeDetailsDAO;
import com.spinachsoftware.restful.entity.ZipcodeDetails;

@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Component
public class FindZipcodeService 
{
	@Autowired
	private IZipcodeDetailsDAO zipcodeDetailsDAO;
	
	@GET
	@Path("findbyzipcode/{zipcode}")
	public ZipcodeDetails findzipcodeDetails( @PathParam("zipcode") String zipcode)
	{
		ZipcodeDetails details = zipcodeDetailsDAO.getZipCodeDetailsById(zipcode);
		if (details != null)
			return details;
		else
			return new ZipcodeDetails(String.valueOf(zipcode), "Not Found", "Not Found");
	}
	
	@GET
	@Path("findbycity/{city}")
	public List<ZipcodeDetails> findByCity(@PathParam("city") String city)
	{
		return zipcodeDetailsDAO.getZipCodeDetailsByCity(city);
	}
	
	@GET
	@Path("findbystate/{state}")
	public List<ZipcodeDetails> findByState(@PathParam("state") String state)
	{
		return zipcodeDetailsDAO.getZipCodeDetailsByState(state);
	}
	
}
