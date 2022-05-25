package personDetails;

public class PersonList 
{
	Person head;
	int length=0;
	public void insert(String name,int age,String mail)
	{
		Person next=null;
		Person person=new Person(name,age,mail,next);
		if(head==null)
		{
			head=person;
			length++;
		}
		else
		{
			Person current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=person;
			length++;
		}
	}
	public void insertAtStart(String name,int age,String mail)
	{
		Person next=null;
		Person person=new Person(name,age,mail,next);
		person.next=head;
		head=person;
		length++;
	}
	
	public void insertAt(int index,String name,int age,String mail)
	{
		if(index>length)
		{
			System.out.println("Insetion not possible");
		}
		else 
		{
			if(index==0)
			{
				insertAtStart(name,age,mail);
			}
			else
			{
				Person next=null;
				Person person=new Person(name,age,mail,next);
				Person current=head;
				for(int i=0;i<index-1;i++)
				{
					current=current.next;
				}
				person.next=current.next;
				current.next=person;
				length++;
			}
		}
	}
	public void deleteAt(int index)
	{
		if(index>=length || index<0)
		{
			System.out.println("Deletion ot possible");
		}
		else
		{
			if(index==0)
			{
				head=head.next;
				length--;
			}
			else
			{
				Person current=head;
				for(int i=0;i<index-1;i++)
				{
					current=current.next;
				}
				current.next=current.next.next;
				length--;
			}
		}
	}
	public void deleteAtLast()
	{
		Person current=head;
		for(int i=0;i<length-2;i++)
		{
			current=current.next;
		}
		current.next=null;
		length--;
	}
	public void traverse()
	{
		Person person=head;
		while(person.next!=null)
		{
			System.out.println(person);
			person=person.next;
		}
		System.out.println(person);
	}
	public void length()
	{
		System.out.println("Length of list is: "+length);
	}
}
