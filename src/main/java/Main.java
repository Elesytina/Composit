import compaunds.*;
import primitives.Passenger;
import primitives.Pilot;

public class Main {
    public static void main(String[] args) {
        FirstClass firstClass=new FirstClass(1);
        firstClass.addAll(9,200);
       Boarding boarding1=new Boarding(new EconomyClass(150),new BusinessClass(20), firstClass,
               2, 6);
       boarding1.removeLuggage();
    }
}
