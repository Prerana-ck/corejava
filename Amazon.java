class Amazon{

static String frstName;
static String lstName;
static String passwrd;;
static String reEnterPasswrd;



public static boolean createAccount(String firstName, String lastName, String password, String reEnterPassword){

boolean isAccountCreated = false;
 frstName=firstName;
 lstName=lastName;
 passwrd=password;
 reEnterPasswrd=reEnterPassword;
isAccountCreated= true;
System.out.println("The acount is created:" + isAccountCreated);
return isAccountCreated;
}

public static void readUserDetails(){
System.out.println("The first name of user is:" + frstName);
System.out.println("The last name of user is:" + lstName);
System.out.println("The password entered by user is:" + passwrd);
System.out.println("The reentered password by user is:" + reEnterPasswrd);
return ;
}

}