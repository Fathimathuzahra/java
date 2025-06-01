Q)Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer) 
and static nested class RAM (memory, manufacturer). Create an object of CPU and print 
information of Processor and RAM.


code:

import java.util.Scanner;
class cpu{
int price;
cpu(int p){
this.price=p;
}
class Processor{
int cores;
String manufacturer;

Processor(int c,String m){
this.cores=c;
this.manufacturer=m;
}
void display(){

System.out.println("Processor : "+this.cores+" "+this.manufacturer);

}
}
static class Ram{
String memory;
String manufacturer;
Ram(String m,String ma){

this.memory=m;
this.manufacturer=ma;
}
void display(){
System.out.println("Ram : "+this.memory+" "+this.manufacturer);

}
}
void display(){
System.out.println("Price : "+this.price);
}

public static void main(String[] args){
cpu c=new cpu(40000);
cpu.Processor p=c.new Processor(4,"intel");
cpu.Ram r=new Ram("8gb","crucial");
c.display();
p.display();
r.display();
}
}



output:

Price : 40000
Processor : 4 intel
Ram : 8gb crucial


