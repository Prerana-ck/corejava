class Myntra{

static String userName;
static String eMail;
static long userNumber;
static String passwrd;
static String reEnterPasswrd;
static String userGender;

public static boolean createUserAccount(String name , String email , long phoneNumber , String password , String reEnterPassword , String gender){
 boolean isAccountCreated = false;
 userName=name;
 eMail=email;
 userNumber=phoneNumber;
 passwrd=password;
 reEnterPasswrd=reEnterPassword;
 userGender=gender;
 
 isAccountCreated=true;
 System.out.println("The user account is created : " + isAccountCreated);
 return isAccountCreated;

}

public static void readUserDetails(){
System.out.println("Fetching user details..");
System.out.println("The name of user is: " + userName);
System.out.println("The user number is : " + userNumber);
System.out.println("The email id of user is: " + eMail);
System.out.println("The password entered by user is : " + passwrd);
System.out.println("The reentered password by user is:" + reEnterPasswrd);
System.out.println("The gender of user is: " + userGender);
return;

}


}