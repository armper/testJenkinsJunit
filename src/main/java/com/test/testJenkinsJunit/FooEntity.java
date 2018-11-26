package com.test.testJenkinsJunit;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FooEntity {

	
	@Id
	private Long id;
	
	private String name;

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

	@Override
	public String toString() {
		return "FooEntity [id=" + id + ", name=" + name + "]";
	}
	
	
}
