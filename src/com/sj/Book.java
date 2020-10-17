package com.sj;

public class Book implements Comparable<Book> {
	
	 int id;
	 String title, author;
	 double price;
	
	public Book(){
	}
	
	public Book(int id, String title, String author, double price){
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString(){
		return "\nTitle: " + title + "\nAuthor: " + author +
				"\nID: " + id + "\nPrice: " + price + "\n";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	//public int compareTo(Book b) {
		// TODO Auto-generated method stub
		//return this.id-b.id;
	//}

	// @Override
	public int compareTo(Book b) {
		// TODO Auto-generated method stub
		return this.id-b.id;
	}

}


	