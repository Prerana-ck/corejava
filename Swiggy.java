class Swiggy{
static int price;
public static int getStartersPrice(String starterName){
if(starterName=="Mushroom Manchurian"){return price=500;}
if(starterName=="Gobi Manchurian"){return price=400;}
if(starterName=="Palak Paneer"){return price=250;}
if(starterName=="Paneer Tikka"){return price=200;}
if(starterName=="Cheese Noodles"){
return price=250;
}
if(starterName=="Shawarma"){
return price=300;
}
if(starterName=="Chilli Panner"){
return price=250;
}
if(starterName=="Aloo Tikka"){
return price=250;
}
if(starterName=="American Babycorn"){
return price=150;
}
if(starterName=="Babycorn Manchurian"){
return price=250;
}
if(starterName=="Schewn Noodles"){
return price=250;
}
if(starterName=="Palak Roll"){
return price=250;
}
if(starterName=="Babycorn Chilli"){
return price=200;
}
if(starterName=="Gobi Chilli"){
return price=250;
}
if(starterName=="Gobi Noodles"){
return price=280;
}
if(starterName=="Pani Puri"){
return price=250;
}
if(starterName=="Golgappa"){
return price=150;
}
if(starterName=="Masal Puri"){
return price=250;
}
if(starterName=="Suka Puri"){
return price=250;
}
if(starterName=="Chilli Noodles"){
return price=250;
}
return 0;
}

public static int getStartersPrice(String starterName, int quantity){
if(starterName=="Mushroom Manchurian"){return price=500*quantity;}
if(starterName=="Gobi Manchurian"){return price=400*quantity;}
if(starterName=="Palak Paneer"){return price=250*quantity;}
if(starterName=="Paneer Tikka"){return price=200*quantity;}
if(starterName=="Cheese Noodles"){
return price=250*quantity;
}
if(starterName=="Shawarma"){
return price=300*quantity;
}
if(starterName=="Chilli Panner"){
return price=250*quantity;
}
if(starterName=="Aloo Tikka"){
return price=250*quantity;
}
if(starterName=="American Babycorn"){
return price=150*quantity;
}
if(starterName=="Babycorn Manchurian"){
return price=250*quantity;
}
if(starterName=="Schewn Noodles"){
return price=250*quantity;
}
if(starterName=="Palak Roll"){
return price=250*quantity;
}
if(starterName=="Babycorn Chilli"){
return price=200*quantity;
}
if(starterName=="Gobi Chilli"){
return price=250*quantity;
}
if(starterName=="Gobi Noodles"){
return price=280*quantity;
}
if(starterName=="Pani Puri"){
return price=250*quantity;
}
if(starterName=="Golgappa"){
return price=150*quantity;
}
if(starterName=="Masal Puri"){
return price=250*quantity;
}
if(starterName=="Suka Puri"){
return price=250*quantity;
}
if(starterName=="Chilli Noodles"){
return price=250*quantity;
}
return 0;
}



}