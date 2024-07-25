class SrsTravelsRunner{

public static void main(String products[]){
System.out.println("main started");

boolean placeAdded = SrsTravels.addTouristPlace("Goa");
System.out.println("The product is added:" + placeAdded);

placeAdded=SrsTravels.addTouristPlace("Oaty");
System.out.println("The product is added:" + placeAdded);

placeAdded=SrsTravels.addTouristPlace("Mysore");
System.out.println("The product is added:" + placeAdded);

placeAdded=SrsTravels.addTouristPlace("Coorg");
System.out.println("The product is added:" + placeAdded);

placeAdded=SrsTravels.addTouristPlace("Kodaikannal");
System.out.println("The product is added:" + placeAdded);

placeAdded=SrsTravels.addTouristPlace("Nandhi Hills");
System.out.println("The product is added:" + placeAdded);

placeAdded=SrsTravels.addTouristPlace("Belur");
System.out.println("The product is added:" + placeAdded);

placeAdded=SrsTravels.addTouristPlace("Jog Falls");
System.out.println("The product is added:" + placeAdded);

placeAdded=SrsTravels.addTouristPlace("Charmudi ghatt");
System.out.println("The product is added:" + placeAdded);

placeAdded=SrsTravels.addTouristPlace("Dhudh sagar");
System.out.println("The product is added:" + placeAdded);

placeAdded=SrsTravels.addTouristPlace("Chikkmagalur");
System.out.println("The product is added:" + placeAdded);

SrsTravels.displayPlaceNames();

boolean isPlaceUpdated= SrsTravels.updatePlaceName("Halebidd","Nandhi Hills");
System.out.println("place name is updated" + isPlaceUpdated);

SrsTravels.displayPlaceNames();

boolean isPlaceDeleted = SrsTravels.deletePlaceName("Dhudh sagar");
System.out.println("place name is deleted" + isPlaceDeleted);

SrsTravels.displayPlaceNames();
}
}