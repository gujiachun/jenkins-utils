package com.rainbow.jenkins.utils.string;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestStr {

	@Value("${test.msg}")
	private String name;
	
	public String getStr(){
		return "22=" + name;
	}
	
}
