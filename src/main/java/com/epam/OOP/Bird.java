package com.epam.OOP;

public class Bird extends Animal{

	public Bird() {
		super("blue",2,false);
	}

	@Override
	public String getDescription() {
		String numOfPaw = "paw";
		String isPur = "no";
		if (getNumberOfPaws() > 1) {
			numOfPaw = "paws";
		}
		if (isHasFur()) {
			isPur = "a";
		}
		return "This animal is mostly " + getColor() +
				". It has " + getNumberOfPaws() + " "+ numOfPaw +" and " + isPur + " fur. Moreover, it has 2 wings and can fly.";
	}
}
