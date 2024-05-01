
package com.becoder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Recipe{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(length =2000)
	private String title;

	@Column(length = 10000)
	private String description;

	


	
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

	

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", title=" + title + ", description=" + description +"]";
		
	}

}
