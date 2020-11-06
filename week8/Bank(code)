import java.util.Scanner;
import java.lang.Math;

class Account
{ String name,type,accno;
  double balance;
  
  void deposit()
  { Scanner get=new Scanner(System.in);
    double depo;
    System.out.println("Enter the deposit : ");
	depo=get.nextDouble();
	balance=balance+depo;
  }
  void withdraw()
  { Scanner get=new Scanner(System.in);
    double withdraw;
	System.out.println("Enter the amount to withdraw: (<"+balance+")");
	withdraw=get.nextDouble();
	balance=balance-withdraw;
	System.out.println("Balance : "+balance);
  }
}
  
class  Curr_acct extends Account
{ int intr=6;
  boolean cheque=true;
  void dispblnc()
  { System.out.println("Balance : "+balance);
  }
  void create()
  { Scanner get=new Scanner(System.in);
    System.out.println("Name :");
	name=get.next();
    type="current";
	System.out.println("Account No :");
	accno=get.next();	
	System.out.println("Balance :");
	balance=get.nextDouble();
  }
	
  void check()
  { System.out.println("\nMinimum Balance : "+5000);
    if(balance<5000)
	{ System.out.println("Penalty is imposed please deposit minimum " + (5000-balance+200)+"Rs\nRs 200 Service charge");
      deposit();
	  balance=balance-200;
	}
	else
	{ System.out.println("Balance : "+balance +"Safe");}
  }
  
}

class  Sav_acct extends Account
{ double intr=7;
  boolean cheque=false;
  void dispblnc()
  { System.out.println("Balance : "+balance);
  }
  void create()
  { Scanner get=new Scanner(System.in);
    System.out.println("Name :");
	name=get.next();
    type="savings";
	System.out.println("Account No :");
	accno=get.next();	
	System.out.println("Balance :");
	balance=get.nextDouble();
  }
	
  void calcint()
  { double interest;
    Scanner get=new Scanner(System.in);
    System.out.println("Enter time: ");
	int time;
	time=get.nextInt();
    interest=balance*Math.pow((1+intr/100),time)-balance;
	System.out.println("Interest : "+interest);
	balance=balance+interest;
	System.out.println("Balance : "+balance);
  }
  
}

class Bank
{ public static void main(String args[])
  { Scanner get=new Scanner(System.in);
    String type; 
    Sav_acct accs=new Sav_acct();
	Curr_acct accr=new Curr_acct();
	System.out.println("Enter type of account: (current/savings)");
	type=get.next();
	if(type.equals("savings"))
     accs.create();
    else if(type.equals("current"))
	 accr.create();
 
    int ch;
	do
	{ System.out.println("\n1.Deposit\n2.Display Balance\n3.Deposit Interest\n4.Withdrawl\n5.Check\n6.Cheque Boook(under developemnt)\n7.Exit");
      ch=get.nextInt();
	  switch(ch)
	  { case 1 : if(type.equals("savings"))
                  accs.deposit();
                 else
	              accr.deposit();
	             break;
		case 2 : if(type.equals("savings"))
                  accs.dispblnc();
                 else
	              accr.dispblnc();
 
		         break;
		case 3 : if(type.equals("savings"))
                  accs.calcint();
                 else
	              System.out.println("This account does not have this provision");
 		         break;
		case 4 : if(type.equals("savings"))
                  accs.withdraw();
                 else
	              accr.withdraw();
 		         break;
		case 5 : if(type.equals("savings"))
                  System.out.println("This account does not have this provision");
                 else
	              accr.check();
			     break;
        case 6 : if(type.equals("savings"))
                  System.out.println("This account does not have this provision");
                 else
	              System.out.println("This account does have this provision");
			     break;
		default : if(ch!=7)
		           System.out.println("Enter valid option");
	  }
	}while(ch!=7);
  }
}
