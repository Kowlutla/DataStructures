package personDetails;

public class Person 
{
	String name;
	int age;
	String mail;
	Person next;
	public Person(String name,int age,String mail,Person next)
	{
		this.name=name;
		this.age=age;
		this.mail=mail;
		this.next=next;
	}
	public String toString()
	{
		return name+"\t\t"+age+"\t\t"+mail;
	}
}
