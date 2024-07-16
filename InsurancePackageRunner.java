class InsurancePackageRunner{

public static void main(String args[]){
System.out.println("main started");
 String name= "Sbi Insurance";
double price=InsurancePackage.find(name);
System.out.println(price);

System.out.println("main ended");
return;
}

}