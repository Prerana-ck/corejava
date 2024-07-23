class Amazon{

static String frstName;
static String lstName;
static String passwrd;;
static String reEnterPasswrd;



public static boolean createAccount(String firstName, String lastName, String password, String reEnterPassword){

boolean isAccountCreated = false;

      boolean isaccountvalidate=validateUserDetails(firstName,lastName,password,reEnterPassword);
	  
if(isaccountvalidate==true){
	isAccountCreated=true;
 System.out.println("The account is created:" + isAccountCreated);
}
else
System.out.println("The account is created: " + isAccountCreated);
 
return isAccountCreated;
}


public static boolean validateUserDetails(String firstName, String lastName, String password, String reEnterPassword){
boolean isUserDetailsValidated = false;
boolean isFirstName = false;
boolean isLastName = false;
boolean isPassword = false;
boolean isReEnterPswrd=false;

if(firstName!=null){
	frstName=firstName;
	isFirstName=true;
}
else
	System.out.println("Invalid first name");
if(lastName!=null){
	lstName=lastName;
	isLastName=true;
}
else
	System.out.println("Invalid last name");
if(password!=null){
	 passwrd=password;
	 isPassword=true;
}
else
	System.out.println("Invalid password");
if(reEnterPassword!=null){
	 reEnterPasswrd=reEnterPassword;
	 isReEnterPswrd=true;
}
else
	System.out.println("Invalid reentered password");

if(isFirstName==true && isLastName==true && isPassword==true && isReEnterPswrd==true){
	isUserDetailsValidated=true;
	System.out.println("The acount is validated : " + isUserDetailsValidated);
}
	
	
	return isUserDetailsValidated;
}


public static void readUserDetails(){
System.out.println("The first name of user is:" + frstName);
System.out.println("The last name of user is:" + lstName);
System.out.println("The password entered by user is:" + passwrd);
System.out.println("The reentered password by user is:" + reEnterPasswrd);
return ;
}

}