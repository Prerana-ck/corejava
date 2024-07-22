class LoanApplicationRunner{

public static void main(String loan[]){
System.out.println("main started");
boolean isaccountcreated = LoanApplication.createUserAccount(null,null,null,1,1,1);
if(isaccountcreated==true){
LoanApplication.readUserDetails();
}
System.out.println("main ended");

}

}