class House{


 int id;
 int noOfRooms ;
 int  noOfFloors ;
 String houseName ; 
 int areaInSqrt ;
 int noOfMembers;

public House(){
	System.out.println("House object is created");
}

public House(int id, int noOfRooms,int noOfFloors, String houseName, int areaInSqrt,int noOfMembers){
	System.out.println("House object   is created and initialized");
	this.id=id;
	this.noOfRooms=noOfRooms;
	this.noOfFloors=noOfFloors;
	this.houseName=houseName;
	this.areaInSqrt=areaInSqrt;
	this.noOfMembers=noOfMembers;
}

}