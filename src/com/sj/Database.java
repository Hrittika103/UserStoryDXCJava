package com.sj;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class Database {
	Scanner sc = new Scanner(System.in);

	TreeSet<Book> tset;
	public Database(){
	
		in();
	}
	public void in()
	{
		tset = new TreeSet<Book>();
		Book b1 = new Book(1, "abc","xyz",678);
		Book b2 = new Book(2, "yui","uyz",984);
		Book b3 = new Book(3, "poi","poz",765);
		tset.add(b1);
		tset.add(b2);
		tset.add(b3);
	}
	public void view()
	{
		
		Iterator<Book> itr = tset.iterator();
		while(itr.hasNext())
		{
			
			
			System.out.println(itr.next());
		}
	}
	public void viewById(int id , String title)
	{
		for(Book b : tset)
		if(b.id==id||b.title.equals(title)) {
			System.out.println(b);
		}
		
		
	}




public void inset()
{
	System.out.println("Enter ID");
	int id = sc.nextInt();
	System.out.println("Enter Name");
	String title = sc.next();
	System.out.println("Enter AUTHOR");
	String author  = sc.next();
	System.out.println("Enter cost");
	double price = sc.nextDouble();
	Book b = new Book( id ,title,author , price);
	tset.add(b);
	
	
}
public void delete(int id)
{
	boolean notFound=true;
	Iterator<Book> itr = tset.iterator();
	while(itr.hasNext())
	{
		Book tsetTemp = itr.next();
		if(tsetTemp.id==id)
		{
			notFound=false;
			itr.remove();
				System.out.println("Book deleted");
				break;
	}
	}
	if(notFound)
	{
		System.out.println("No book found by this id");
	}
}

public void update(int id , String title, String author, double price)
{
	Iterator<Book>itr = tset.iterator();
	while(itr.hasNext()) {
		if(itr.next().id==id)
		{
			itr.remove();;
			Book b = new Book(id ,title,author, price);
			tset.add(b);
		}
	}
}
	
}
