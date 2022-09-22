package _04_animals_inheritance;

public class Animal {

	private String name;
	private String furColor;
	private boolean isGirl;
	private boolean isChonky;

	Animal(String name, String furColor, boolean isGirl, boolean isChonky) {
		this.name = name;
		this.furColor = furColor;
		this.isGirl = isGirl;
		this.isChonky = isChonky;
	}

	public void printName() {
		System.out.println("Hello, my name is " + name + "!");
	}

	public void play() {
		if (!isChonky) {
			System.out.println(name + " epically plays.");
		} else {
			System.out.println(name + " does not have enough energy to play, it is too chonky.");
		}
	}
	
	public void eat() {
		if(isChonky) {
			System.out.println("NOMNOMNOMNOMNOMNOMNOMNOMNOMNOMNOMNOMNOMNOMNOMNOMNOMNOMNOMNOM");
			System.out.println("You are all out of food.");
		} else {
			System.out.println("munch munch munch\nYour pet is full now.");
		}
	}
	
	public void sleep() {
		System.out.println("Your pet slept and got " + furColor + " fur all over your bed.");
	}

}
