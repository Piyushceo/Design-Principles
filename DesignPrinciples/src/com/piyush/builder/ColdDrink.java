package com.piyush.builder;

public abstract class ColdDrink implements Item {

	public Packing packing() {
		return new Bottle();
	}
	public abstract float price();
}
