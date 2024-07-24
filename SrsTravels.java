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

}