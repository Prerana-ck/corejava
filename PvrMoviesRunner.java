class PvrMoviesRunner{

public static void main (String args[]){
System.out.println("main started");
String name = "Munjya";
int price = PvrMovies.getMoviePrice(name);
System.out.println(price);

System.out.println("main ended");
}
}