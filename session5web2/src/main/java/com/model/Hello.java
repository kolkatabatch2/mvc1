package com.model;

public class Hello {

String greet;

public String getGreet() {
	return greet;
}

public void setGreet(String greet) {
	this.greet = greet;
}

@Override
public String toString() {
	return "Hello [greet=" + greet + ", getGreet()=" + getGreet() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}

	
}
