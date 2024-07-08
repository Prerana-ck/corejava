class Microwave{

static boolean isConnected = false;


       public static void turnOn( ){
              System.out.println("Start of turnOn");
                if(isConnected==false){
                  isConnected = true;
                 System.out.println("Microwave is turned on");
	       }
	              System.out.println("end of turnOn");
	           return ;
}

   public static void turnOff(){
    System.out.println("start of turnOff");
	 if(isConnected==true){
	   isConnected = false;
	    System.out.println("Microwaves is turned off");
		}
     System.out.println("end of turnOff");
	 return ;
   }
}