class LinkedInRunner{

public static void main(String args[]){
System.out.println("main started");
boolean accountcreated = LinkedIn.createUserDetails(1,null,null,null,null,1,null,null,null,null,null,null);
if(accountcreated==true){
LinkedIn.readUserDetails();
}
System.out.println("main ended");
}

}