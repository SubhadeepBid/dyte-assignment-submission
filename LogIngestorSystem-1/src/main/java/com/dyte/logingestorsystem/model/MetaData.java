package com.dyte.logingestorsystem.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class MetaData {
	
	private String parentResourceId;
	
	public MetaData() {
		// TODO Auto-generated constructor stub
	}

	public MetaData(String parentResourceId) {
		super();
		this.parentResourceId = parentResourceId;
	}

	public String getParentResourceId() {
		return parentResourceId;
	}

	public void setParentResourceId(String parentResourceId) {
		this.parentResourceId = parentResourceId;
	}

	@Override
	public String toString() {
		return "MetaData [parentResourceId=" + parentResourceId + "]";
	}

}
