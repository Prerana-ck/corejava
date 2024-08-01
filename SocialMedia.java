class SocialMedia{


int id;
 String name;
 String profileName;
String email;

public SocialMedia(){
	System.out.println("SOcial media object is created");
}

public SocialMedia(int id, String name, String profileName, String email){
	System.out.println("Social media object is created and initialized");
	this.id=id;
	this.name=name;
	this.profileName=profileName;
	this.email=email;
	
}

}