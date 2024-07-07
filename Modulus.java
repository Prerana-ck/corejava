class Modulus{

public static void main(String args[]){
System.out.println("main started");
mod(30,15);
mod(50,25);
System.out.println("main ended");
}

public static void mod(int num1, int num2){
System.out.println("mod method started");
System.out.println(num1 % num2);
System.out.println("mod method ended");
return;
}
}