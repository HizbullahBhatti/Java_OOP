
public class Animal {

	
private double weight;
	
private int age;
	
private boolean canSwim;
	
	
public Animal()
	{
		
	weight=0.000001;
		
	age=1;
		
	canSwim=true;
	}
	
	
public Animal(double weight, int age,boolean swim)
	{
		
	this.weight=weight;
		
	this.age=age;
		
	this.canSwim=swim;
	}
	
	
public void setSwim(boolean swim)
	
{
	this.canSwim=swim;
}
	
	
public boolean canSwim()
	
{
		return canSwim;
	
}
	
	
public void setWeight(double weight)
	{
		
		this.weight=weight;
	}
	
public void setAge(int age)
	
{this.age=age;}
	
	
public int  getAge()
	
{
		return age;
	}
	 
	
public double getWeight()
	
{
		return weight;
	}
	
	
public String move()
	{
		return " ";
	}
	
	
public String sound()
	{
		return " ";
	}
	
	
public String sound(int i)
	{
		return " ";
	}
	
	
	
	
public String toString()
	{return "weight: " + this.weight +" age: "+ this.age;}
	
	
	
}
