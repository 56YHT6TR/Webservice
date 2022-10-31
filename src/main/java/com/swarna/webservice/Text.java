package com.swarna.webservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Text {
	@Id
	@GeneratedValue
	private Integer id;
	private String inputStr;

	
	public Text(Integer id, String inputStr) {
		super();
		this.id = id;
		this.inputStr = inputStr;
	}

	public Text() {
		
	}

	public String getInputStr() {
		return inputStr;
	}

	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	@Override
	public String toString() {
		return "Text [id=" + id + ", inputStr=" + inputStr + "]";
	}
	

	
	

}
