class Ajio{

static String userName;
static String eMail;
static String userGender;
static long userNumber ;
static String passwrd;
public static boolean createUserAccount(String name, String email , String gender, long phoneNumber , String password){
boolean isAccountCreated = false;
 userName= name;
eMail = email;
userGender = gender;
userNumber = phoneNumber;
String passwrd = password;
isAccountCreated = true;
System.out.println("The account is created " + isAccountCreated);
return isAccountCreated;
}

public static void readUserDetails(){
System.out.println("Fetching user details..");
System.out.println("The name of the user is: " + userName);
System.out.println("The email id of user is: " + eMail);
System.out.println("The gender of user is: " + userGender);
System.out.println("The phone number of user is : " + userNumber);
System.out.println("The password of user is: " + passwrd);
return ;


}


}