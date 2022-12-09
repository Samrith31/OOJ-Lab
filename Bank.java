import java.io.*;
import java.util.*;
import java.lang.Math;
class Account {
Scanner sc = new Scanner(System.in);
String name;
int acc_no;
double bal,si;
int noofdeposits=0;
int noofwiths=0;

void creation() {
System.out.println("Enter your name");
name = sc.next();
System.out.println("Enter the Initial Amount");
bal = sc.nextFloat();
}


void display() {
System.out.println("Name : "+name);
System.out.println("Balance : "+bal);


}
void deposit() {
float amount;
 noofdeposits++;
System.out.println("Enter the amount to be deposited");
amount = sc.nextFloat();

bal = bal + amount;

System.out.println("Current balance : "+bal);
}


}


class CurrentAccount extends Account{

 public void chequebook(){
   bal=bal-50;
   System.out.println("50rs has been Deducted from the balance for the cheque book Entry");
  System.out.println("NO OF DEPOISTS: "+noofdeposits);
  System.out.println("NO OF Withdrawal: "+noofwiths);
   System.out.println("BALANCE: "+noofdeposits);

} 

public void withdrawal() {
float amt;
System.out.println("Enter the amount to be withdrawn");
amt = sc.nextFloat();
if(amt>bal) 
System.out.println("Balance insufficient");
else {
bal = bal - amt;
if(bal<1000) {
bal = bal -50;
System.out.println("50 rs is taken as service fee");
}
         System.out.println("Withdrawn : "+amt);
System.out.println("Current balance : "+bal);
}
}
}


class Savingsaccount extends Account {
 public void withdrawal() {
float amt;
System.out.println("Enter the amount to be withdrawn");
amt = sc.nextFloat();
if(amt>bal) 
System.out.println("Balance insufficient");
else
bal = bal - amt;
System.out.println("Withdrawn : "+amt);
System.out.println("Current balance : "+bal);
}
public void interest() {
System.out.println("Enter the rate of interest");
double r =0.06;
System.out.println("Enter the number of times interest applied per time period");
int n = sc.nextInt();
System.out.println("Enter the time elapsed");
int t = sc.nextInt();
si = bal*(1+(r/n));
System.out.println("Compound interest is "+(Math.pow(si,n*t)));
}
}




class Bank {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
Savingsaccount s = new Savingsaccount();
CurrentAccount c = new CurrentAccount();
System.out.println("\n1.Savings account\n2.Current account");
int choice = sc.nextInt();
switch(choice) {
case 1:
    
    

     s.creation();
     s.display();
    
     s.deposit();
     s.interest();
     s.withdrawal();
    break;


   
case 2:
   
     c.creation();
     c.display();
     c.chequebook();
     c.deposit();
     c.withdrawal();
    break;
default : System.out.println("Invalid choice");
}
}
}











  
   