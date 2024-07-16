class RechargePlansRunner {

public static void main(String args[]){
System.out.println("main started");
 String name= "Jio Link";
 int price= RechargePlans.getRechargePlans(name);

System.out.println(price);

System.out.println("main ended");
return;
}

}