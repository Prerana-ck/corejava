class AmazonRunner{

public static void main(String data[]){
System.out.println("main started");
boolean isAccountcreated=Amazon.createAccount(null,null,null,null);
if(isAccountcreated==true){
	Amazon.readUserDetails();
}

System.out.println("main ended");


}


}