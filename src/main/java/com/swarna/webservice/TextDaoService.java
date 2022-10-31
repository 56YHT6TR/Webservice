package com.swarna.webservice;

import org.springframework.stereotype.Component;

@Component
public class TextDaoService {
	Text obj=new Text();
	
	public String reverse(String str)
	{
		return(new StringBuilder(str).reverse().toString());
	}
	
}
