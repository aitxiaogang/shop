package com.xiaogang.shop.constants;

public enum Gender {
	MAN(1,"男"),WOMAN(0,"女");
	
	private Integer value;
	private String  name;
	
	private Gender(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
