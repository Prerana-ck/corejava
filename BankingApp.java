class BankingApp {

static int accNumber;
static String usrId;
static String passwrd;
static String reEnterPswrd;
static int mpin;

public static boolean createUserAccount(int accountNumber, String userId , String password ,String reEnterPassword ,int mPin){

boolean isAccountCreated = false;
boolean isAccountNumber = false;
boolean isUserId = false;
boolean isPassword = false;
boolean isReEnterPswrd= false;
boolean isMpin =false;

if(accountNumber>=0) {
 accNumber=accountNumber;
 isAccountNumber=true;
}
else
 System.out.println("Invalid accountNumber");

if(userId!=null){
 usrId=userId;
 isUserId=true;
}
else
System.out.println("Invalid user id");

if(password!=null){
passwrd=password;
isPassword=true;
}
else
System.out.println("Invalid password");

if(reEnterPassword!=null){
reEnterPswrd=reEnterPassword;
isReEnterPswrd=true;
}
else
System.out.println("Invalid reentered password");

if(mPin>=0){
mpin=mPin;
isMpin=true;
}
else
	System.out.println("Invalid mpin");

if(isAccountNumber==true && isUserId==true && isPassword==true && isReEnterPswrd==true && isMpin==true){
 isAccountCreated=true;
}
return isAccountCreated;

}

public static void readUserDetails(){
System.out.println("Fetching user details..");
System.out.println("The account number is: " + accNumber);
System.out.println("The user id is: " + usrId);
System.out.println("The password entered is: " + passwrd);
System.out.println("The reneterd password is: " + reEnterPswrd);
System.out.println("The mpin is : " + mpin);
return;
}
}