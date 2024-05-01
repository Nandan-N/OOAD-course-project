
package com.becoder.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class indian{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(length =2000)
	private String title;

	@Column(length = 10000)
	private String description;

	@Lob
	 @Column(length = 10485760) // Length for storing image data (10 MB)
	    private byte[] imageData;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	  public byte[] getImageData() {
	        return imageData;
	    }

	    public void setImageData(byte[] imageData) {
	        this.imageData = imageData;
	    }

	@Override
	public String toString() {
		return "indian [id=" + id + ", title=" + title + ", description=" + description +",imageData="+ Arrays.toString(imageData)+"]";
		
	}

}
