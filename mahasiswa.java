import *;

public class Tester{
	private String name;
	prvate int age;
	
	public static void main (String[] args) {
		System.out.println("Halo mahasiswa!");
		
	}
	
	public Mahasiswa(){
		this.name = "faizah afifah";
		this.age = 20;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
}	