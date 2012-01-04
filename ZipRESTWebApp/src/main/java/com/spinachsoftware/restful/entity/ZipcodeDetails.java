package com.spinachsoftware.restful.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;


@SuppressWarnings("serial")
@XmlRootElement
public class ZipcodeDetails implements Serializable
{
	private String zipcodeId;
	
	private String cityName;
	
	private String state;
	
	// default no-argument constructor
	public ZipcodeDetails()
	{
	}
	
	// default constructor
	public ZipcodeDetails(String zipcode, String city, String state)
	{
		this.zipcodeId = zipcode;
		this.cityName = city;
		this.state = state;
	}
	
	public String getZipcodeId() 
	{
		return zipcodeId;
	}

	public void setZipcodeId(String zipcodeId) 
	{
		this.zipcodeId = zipcodeId;
	}

	public String getCityName() 
	{
		return cityName;
	}

	public void setCityName(String cityName) 
	{
		this.cityName = cityName;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

}
