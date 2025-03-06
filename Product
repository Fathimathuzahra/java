import java.util.Scanner;
class Produ
{
int pcode;
String pname;
int price;
 public Produ(int pcode,String pname,int price)
{
this.pcode = pcode;
this.pname = pname;
this.price = price;
}



public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);


System.out.println("Enter details of 3 products:");

Produ[] produ = new Produ[3];

for(int i = 0; i < 3; i++)
{
System.out.println("Enter pcode:");
 int pcode = scanner.nextInt();
scanner.nextLine();
System.out.println("Enter pname:");
String pname = scanner.nextLine();


System.out.println("Enter price:");
int price = scanner.nextInt();
scanner.nextLine();

 produ[i] = new Produ(pcode, pname,price);
}
Produ lowestPriceProduct = produ[0];

for(int i = 1; i < 3; i++)
{
if(produ[i].price < lowestPriceProduct.price)
{

lowestPriceProduct = produ[i];
}
}

System.out.println("Product with lowest price:");

System.out.println("Code: " + lowestPriceProduct.pcode);
System.out.println("Name: " + lowestPriceProduct.pname);
System.out.println("Price: " + lowestPriceProduct.price);
}
}
