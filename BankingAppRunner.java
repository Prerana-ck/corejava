class BankingAppRunner{

public static void main(String yono[]){
System.out.println("main started");
boolean isaccountcreated = BankingApp.createUserAccount(1, null,null,null,1);
if(isaccountcreated==true){
BankingApp.readUserDetails();
}
System.out.println("main ended");

}

}