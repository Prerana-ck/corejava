class JuiceAdda{

static int start =0;
 static String juiceNames[]={null,null,null,null,null,null};

public static boolean addJuiceName(String juiceName){


boolean isJuiceNameAdded=false;

if(start>=juiceNames.length)
System.out.println("Array index is out of bound");

 else if (juiceName!=null){
 juiceNames[start++]=juiceName;
 isJuiceNameAdded=true; 
 }
 
 else
 System.out.println("Invalid juice name");


return isJuiceNameAdded;
}


public static void displayJuiceName(){
for(String juiceName : juiceNames)
	System.out.println(juiceName);

return;
}
}