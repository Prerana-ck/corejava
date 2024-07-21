class Snapdeal{

static double phNumber;
static String eMail;
static String userName;
static String dOB;
static String passwrd;

public static boolean createUserAccount(double phoneNumber, String email, String name, String dob, String password){
boolean isAccountCreated = false;
 phNumber = phoneNumber;
 eMail=email;
 userName=name;
 dOB=dob;
 passwrd=password;
 isAccountCreated=true;
 System.out.println("The account is created: " + isAccountCreated);
return isAccountCreated;
}

public static void readUserDetails(){
System.out.println("Fetching user details..");
System.out.println("The phone number of user is:" + phNumber);
System.out.println("The email of the user is:" + eMail);
System.out.println("The name of the user is:" + userName);
System.out.println("The date of birth of user is:" + dOB);
System.out.println("The password entered by user is:" + passwrd);
return;
}

}