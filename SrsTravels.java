import java.util.Arrays;
class SrsTravels{

static String touristPlaces[]={null,null,null,null,null,null,null,null,null,null};
static int start=0;

public static boolean addTouristPlace(String placeName){
boolean isPlaceAdded = false;

if(start>=touristPlaces.length)
System.out.println("Array index is out of bound");
  else if(placeName!=null){
  touristPlaces[start++]=placeName;
  isPlaceAdded=true;
}
else
  System.out.println("Invalid place name");


return isPlaceAdded;
}

public static void displayPlaceNames(){
for(String placeName :touristPlaces)
System.out.println(placeName);
return;
}

public static boolean updatePlaceName(String newPlaceName , String oldPlaceName){
	 boolean isTouristPlaceUpdated = false;
	 
	 for(int position=0 ; position<touristPlaces.length; position++){
		 if(touristPlaces[position]==oldPlaceName){
			 touristPlaces[position]=newPlaceName;
		
			 isTouristPlaceUpdated=true;
			 	 
		 }
	 }
	 if(isTouristPlaceUpdated==false){
		 System.out.println(oldPlaceName + "not found");
	 }
	
	return isTouristPlaceUpdated;
}

public static boolean deletePlaceName(String placeName){
	boolean isTouristPlaceDeleted = false;
	
	int position , newposition ;
	for(position=0 , newposition=0; position<touristPlaces.length ; position++ ){
		if(touristPlaces[position]!=placeName){
			touristPlaces[newposition]=touristPlaces[position];
			newposition++;
		}
		else
			isTouristPlaceDeleted=true;
	}
	 
	 int newlength = newposition;
	 touristPlaces= Arrays.copyOf(touristPlaces,newlength);

 if(isTouristPlaceDeleted==false){
	 System.out.println(placeName + "not found");
 }
 return isTouristPlaceDeleted;
}

}