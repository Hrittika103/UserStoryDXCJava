package com.sj;
import java.util.Scanner;
public class Admin
{
	public static void main(String[] args)
	{
		 try (Scanner sc = new Scanner(System.in)) {
			Database db = new Database();
             char k;
do
{
System.out.println("press 1 to view all books ");
System.out.println("press 2 to search  books ");
System.out.println("press 3 to add a  book ");
System.out.println("press 4 to delete a book ");
System.out.println("press 5 to update a book ");
int choice = sc.nextInt();
switch(choice)
{
case 1:
			db.view();
			break;
case 2:
			System.out.println("Enter the book details(id and title) to be searched:");	
			
			  int id = sc.nextInt();
			  String title= sc.next();
			   db.viewById(  id, title);
            break;	
case 3 :
			System.out.println("Enter the book details to be inserted:");
			 db.inset();
			 break;
case 4 :
			System.out.println("Enter the book details(id) to be deleted:");
			int id1=sc.nextInt();
			 db.delete(id1);
			 break;
case 5 :
	System.out.println("Enter the book details(id , title, author and price) for update:");
	int idu = sc.nextInt();
	String title1= sc.next();
	String author = sc.next();
	double price = sc.nextDouble();
	
	 db.update(idu, title1, author, price);
	 break;
			 
			default:
				break;
}

				System.out.println("Press Y for main menu");
				k=sc.next().charAt(0);
}  
  while(k=='Y'||k=='y');
		}
		
		      
			}
		
	
}


