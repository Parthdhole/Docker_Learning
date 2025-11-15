package com.tcs.mvc.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "hospitals")
public class Enitiy {
	  @Id
	  
	  private Long id;
	  private String name;
	  private String location;
	  private Double rating;
	  public Long getId() {
		  return id;
	  }
	  public void setId(Long id) {
		  this.id = id;
	  }
	  public String getName() {
		  return name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	  public String getLocation() {
		  return location;
	  }
	  public void setLocation(String location) {
		  this.location = location;
	  }
	  public Double getRating() {
		  return rating;
	  }
	  public void setRating(Double rating) {
		  this.rating = rating;
	  }
	  public Enitiy(Long id, String name, String location, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.rating = rating;
	  }
	  public Enitiy() {
		  
	  }
	  
	  
}
