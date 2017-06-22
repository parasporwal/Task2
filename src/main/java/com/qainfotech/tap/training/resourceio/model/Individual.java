package com.qainfotech.tap.training.resourceio.model;

import java.util.Map;
import java.lang.Integer;

import org.json.simple.JSONObject;

/**
 *
 * @author Ramandeep RamandeepSingh AT QAInfoTech.com
 */
public class Individual {
    
    private final String name;
    private final Integer id;
    private final Boolean active;
    
    public Individual(JSONObject jsonObject){
    	
    	this.name=jsonObject.get("name").toString();
    	this.id=Integer.parseInt(jsonObject.get("id").toString());
    	this.active=(Boolean)jsonObject.get("active");
       //throw new UnsupportedOperationException("Not implemented.");
    }
    
    @Override
	public String toString() {
		return "Individual [name=" + name + ", id=" + id + ", active=" + active + "]";
	}

	/**
     * get the name of individual
     * 
     * @return individual name
     */
    public String getName(){
        return name;
    }
    
    /**
     * get the employee of of individual
     * @return id
     */
    public Integer getId(){
        return id;
    }
    
    /**
     * get the active status of individual
     * 
     * @return 
     */
    public Boolean isActive(){
        return active;
    }
}
