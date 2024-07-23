class XworkzRunner{

public static void main(String reg[]){
System.out.println("main started");
boolean isAccountCreated = Xworkz.createUserAccount(null,1,1,null,null,null,null,null);
if(isAccountCreated==true){
Xworkz.readUserDetails();
}
System.out.println("main ended");
}

}