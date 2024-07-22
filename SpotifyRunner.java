class SpotifyRunner{

public static void main(String app[]){
System.out.println("main started");
boolean isaccountcreated = Spotify.createUserAccount(null,1,null,null,null);
if(isaccountcreated==true){
Spotify.readUserDetails();

}
System.out.println("main ended");

}


}