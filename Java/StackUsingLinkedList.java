import java.util.Scanner;

class Stack
{
	int data;
	Stack next;
	Stack(int data)
	{
		this.data=data;
		next=null;
		
	}
}

public class StackUsingLinkedList {
	
	static Stack head=null;
	static void InsBeg()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element");
		int d=sc.nextInt();
		Stack p=new Stack(d);
		
		if(head==null)
		{
			head=p;
		}
		else
		{
			p.next=head;
			head=p;
		}
	}

	static void DelBeg()
	{
		if(head==null)
		{
			System.out.println("Stack Empty already-Underflow");
		}
		else
		{
			
			head=head.next;
		}
	}
	
	static void display()
	{
		Stack temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println();
			System.out.println("1 InsBeg 2 DelBeg 3 Display");
			System.out.println("enter choice");
			int choice= sc.nextInt();
			switch(choice)
			{
			case 1:
					InsBeg();
					break;
			case 2:
					DelBeg();
					break;
			case 3: 
					display();
					break;
			case 4:
					System.exit(0);
			}
		}

		
	}

}