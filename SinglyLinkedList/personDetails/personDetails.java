package personDetails;

public class personDetails 
{
	public static void main(String[] args) 
	{	
		PersonList list=new PersonList();
		list.insert("kowlutla",19,"kowlutla21131@gmail.com");
		list.insert("kowlutla",19,"kowlutla1119@gmail.com");
		list.insertAtStart("Sudeepthi", 19, "Deepumarvada@gmail.com");
		list.insertAt(0, "Harikrishna", 24,"Harikirishna@gmail.com");
		list.insertAt(3, "Harikrishna", 24,"kirishna@gmail.com");
		list.insertAt(5, "Aruna Ranga", 26,"Arun@gmail.com");
		list.deleteAtLast();
		list.traverse();
		list.length();
	}

}
