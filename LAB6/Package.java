package CIE;
public class Student
{ public String usn,name;
 public int sem;
}
package CIE;
import java.util.Scanner;
public class Internals extends Student
{ public int cie[]=new int[5];
 Scanner get=new Scanner(System.in);
 public void geti()
 { System.out.println("Enter Details: ");
 System.out.println("USN :");
usn = get.next();
System.out.println("NAME :");
name =get.next();
System.out.println("SEMESTER :");
sem =get.nextInt();
System.out.println("CIE MARKS :");
for(int i=0;i<5;i++)
{ System.out.println("Subject "+(1+i));
 cie[i]=get.nextInt(); }
 }
 public void dispi()
 { System.out.println("\nUSN :"+usn);
 System.out.println("NAME :"+name);
System.out.println("SEMESTER :"+sem);
System.out.println("CIE :");
for(int i=0;i<5;i++)
{ System.out.printf("%d\t",cie[i]); }
System.out.println("\nSEE :");
 }
}
package SEE;
import java.util.Scanner;
public class Externals extends CIE.Student
{ public int see[]=new int[5];
 Scanner get=new Scanner(System.in);

 public void getm()
 { for(int i=0;i<5;i++)
{ System.out.println("Subject "+(1+i));
 see[i]=get.nextInt(); }
 }
 public void dispsm()
 {for(int i=0;i<5;i++)
{ System.out.printf("%d\t",see[i]); }
 }
}
import java.util.Scanner;
import CIE.*;
import SEE.*;
class TotalMarks
{ public static void main(String args[])
 { Scanner get=new Scanner(System.in);
 int n;
System.out.println("Enetr the no of students: ");
n=get.nextInt();
 CIE.Internals ints[]=new CIE.Internals[n];
SEE.Externals exts[]=new SEE.Externals[n];
 for(int i=0;i<n;i++)
{ ints[i]=new CIE.Internals();
 exts[i]=new SEE.Externals();
 ints[i].geti();
 System.out.println("SEE MARKS :");
 exts[i].getm();
}
for(int i=0;i<n;i++)
{ ints[i].dispi();
 int total=0;
 exts[i].dispsm();
 for(int j=0;j<5;j++)
 { total=total+ints[i].cie[j]+exts[i].see[j];}
 System.out.println("\nTOTAL MARKS : "+total);
}
 }
}
