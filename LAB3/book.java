import java.util.Scanner;

class book
{ String name,author;
  int price,num_pages;
  
  void book()
  { name="null";
    author="null";
	price=0;
	num_pages=0;
	}
  void get()
  { Scanner get=new Scanner(System.in);
    System.out.println("\nEnter the name:");
    name=get.next();
	System.out.println("Enter the author:");
	author=get.next();
	System.out.println("Enter the price:");
	price=get.nextInt();
	System.out.println("Enter the no of pages:");
	price=get.nextInt();
	}
  void out()
  { System.out.println("NAME: "+name);
    System.out.println("AUTHOR: "+author);
	System.out.println("PRICE: "+price);
	System.out.println("PAGES: "+num_pages);
  }
  public String toString()
  { return ("\nNAME: "+name+"\nAUTHOR: "+author+"\nPRICE: "+price+"\nPAGES :"+num_pages);
    }
 }
class book2Main
{ public static void main(String args[])
  { Scanner get=new Scanner(System.in);
    int n,ch;
    System.out.println("Enter the no of books to be entered:");
	n=get.nextInt();
    book b[]= new book[n];
	for(int i=0;i<n;i++)
     { b[i]=new book();
	   b[i].get(); 
	   }
	System.out.println("Display\n1.Function Method\n2.String method\nEnter choice:");
	ch=get.nextInt();
	switch(ch)
    { case 1: for(int i=0;i<n;i++)
              { b[i].out();}
		      break;
	  case 2: for(int i=0;i<n;i++)
              { System.out.println(b[i]);}
		      break;
	  default:System.out.println("Enter valid number");
	}
  }
}