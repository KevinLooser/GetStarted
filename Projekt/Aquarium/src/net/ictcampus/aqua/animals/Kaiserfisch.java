package net.ictcampus.aqua.animals;

public class Kaiserfisch {
	private int birthyear;
	private float length;
	
	public Kaiserfisch(int by, float l) {
		this.birthyear = by;
		this.length = l;
	}
	
	public String sayInfos() {
		return "I have a length of " + length + " cm.";
	}
	
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	

}
