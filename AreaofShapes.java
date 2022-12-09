 import java.util.Scanner;

 abstract class Shape{

    int a;
    int b;
    abstract void printArea();
}
 

 class Rectangle extends Shape{
    
   public void printArea(){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of length");
       a=sc.nextInt();
       System.out.println("Enter the value of breath");
       b=sc.nextInt();

       int c=a*b;
       System.out.println("The area of the Rectangle is :"+c);
}
}

class Triangle extends Shape{
    
   public void printArea(){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of length");
       a=sc.nextInt();
       System.out.println("Enter the value of height");
       b=sc.nextInt();

       double c=(a*b)*(0.5);
       System.out.println("The area of the Triangle is :"+c);
}
}

class Circle extends Shape{
    
   public void printArea(){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of Radius");
       a=sc.nextInt();
       

       double c=(3.14*a*a);
       System.out.println("The area of the Circle is :"+c);
}
}




  class Area{
   public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
         Triangle t=new Triangle();
         Rectangle r=new Rectangle();
         Circle c=new Circle();


          System.out.println("choose to calculate area");
          
          System.out.println("1.Rectangle");
            System.out.println("2.Triangle");
             System.out.println("3.Circle");
           System.out.println("Enter Your Choice");
           int choice=sc.nextInt();
           
           if(choice==1){
            t.printArea();
} 
        else if(choice==2){
            r.printArea();
} 
   else if(choice==3){
            c.printArea();
} 
  else{
            System.out.println("Wrong Choice");
} 






}
}