class Spotify{

static String usrname;
static int phnumber;
static String eMail;
static String passwrd;
static String reenterPasswrd;

public static boolean createUserAccount(String userName, int phoneNumber , String email , String password , String 
                                         reEnterPassword){
										 
boolean isAccountCreated = false;
boolean isUserName = false;
boolean isPhonenumber = false;
boolean isEmail = false;
boolean isPassword = false;
boolean isReEnterPaswrd = false;


if(userName!=null){
usrname=userName;
isUserName=true;
}
else
System.out.println("invalid user name");

if(phoneNumber>=0){
phnumber=phoneNumber;
isPhonenumber=true;
}
else
System.out.println("Invalid phoneNumber");

if(email!=null){
eMail=email;
isEmail=true;
}
else
System.out.println("Invalid email");

if(password!=null){
passwrd=password;
isPassword=true;
}
else
System.out.println("Invalid password");

if(reEnterPassword!=null){
reenterPasswrd=reEnterPassword;
isReEnterPaswrd=true;
}
else
System.out.println("Invalid reentered password");
		
		if(isUserName==true && isPhonenumber==true && isEmail==true && isPassword==true && isReEnterPaswrd==true){
	isAccountCreated=true;
		}
		return isAccountCreated;
		}
		
		public static void readUserDetails(){
		System.out.println("The user name is : " + usrname);
		System.out.println("The phoneNumber is :  " + phnumber);
		System.out.println("The eMail is : " + eMail);
		System.out.println("The password is : " + passwrd);
		System.out.println("The reentered password is : " + reenterPasswrd);
		
		
		}


}