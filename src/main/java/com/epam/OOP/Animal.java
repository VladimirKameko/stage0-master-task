package com.epam.OOP;

public class Animal {

	private String color;
	private int numberOfPaws;
	private boolean hasFur;

	public Animal(String color, int numberOfPaws, boolean hasFur) {
		this.color = color;
		this.numberOfPaws = numberOfPaws;
		this.hasFur = hasFur;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfPaws() {
		return numberOfPaws;
	}

	public void setNumberOfPaws(int numberOfPaws) {
		this.numberOfPaws = numberOfPaws;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	public String getDescription() {
		String numOfPaw = "paw";
		String isPur = "no";
		if (numberOfPaws > 1) {
			numOfPaw = "paws";
		}
		if (hasFur) {
			isPur = "a";
		}
		return "This animal is mostly " + color +
				". It has " + numberOfPaws + " "+ numOfPaw +" and " + isPur + " fur.";

	}
}
