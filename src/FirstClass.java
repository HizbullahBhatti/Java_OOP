
public class FirstClass {
	String name;
	String fname;
	int  age;
	char gender;
	
	public FirstClass() {
		name = "";
		fname = "";
		age = 0;
		gender = ' ';
	}
	
	public FirstClass(String n ,String f) {
		name = n;
		fname = f;
	}
	
	public FirstClass(int a , char g) {
		age = a;
		gender = g;
	}
	
	
	public FirstClass(String n ,String f , int a , char g) {
		name = n;
		fname = f;
		age = a;
		gender = g;
		
	}
	public String toString() {
		return ("Name: " + name + " Father Name: " + fname + " Gender: " + gender + " Age: " + age);
	}
	
	
	

}
