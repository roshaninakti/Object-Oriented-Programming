package oops;

public class PolymorphismConstractorOverLoading {
          double weight, height;
 PolymorphismConstractorOverLoading(){
          weight = 10;
          height = 20;
 }
 PolymorphismConstractorOverLoading(double w, double h){
          weight = w;
          height = h;
 }
 double area(){
          return 0.5/(height*weight);
 }
          
}