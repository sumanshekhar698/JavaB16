package com.java.static_concept;

public class Student {

	String name;
	int id;
	String university;
	static String collegeName;// static things are NOT object lever, they are class level things
	Gender gender;// M F

	{
		System.out.println("Block 1");
	}

	{
		System.out.println("Block 2");
	}

	static {//static things are initialized before any object creation
		System.out.println("Static Block 3");
		sayMyCollege();
	}

	{
		System.out.println("Block 5");
	}

	static {
		System.out.println("Static Block 4");
		collegeName = "Not set yet!!";
	}

	public Student(String name, int id, String university, String collegeName, Gender gender) {
		System.out.println("Constructor Student called....");
		this.name = name;
		this.id = id;
		this.university = university;
		this.collegeName = collegeName;
		this.gender = gender;
	}

	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", university=" + university + ", collegeName=" + collegeName
				+ ", gender=" + gender + "]";
	}

	void sayMyNameAndCollege() {
		System.out.println("Name :" + name);
		sayMyCollege();
		System.out.println("College :" + collegeName);
		{

		}

	}

	static void sayMyCollege() {// non static things/object level things cannot be accessed directly in a static
								// context
//		System.out.println("Name :" + name + "\nId: " + id);
		System.out.println("College :" + collegeName);

	}

}
