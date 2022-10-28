package compaunds;
import intefaces.IComposit;
import primitives.Passenger;
import java.util.ArrayList;
import java.util.List;

public class EconomyClass implements IComposit {
    public List<Passenger> passengers;
    private int amount;
    public static final int maxAmount=150;
    public static final int maxWeight=20;
    // конструктор с параметром - количество пассажиров
    public EconomyClass(int a){
        if(this.setAmount(a))
        this.passengers=new ArrayList<>();
        for(int i=0;i<a;i++)
            passengers.add(new Passenger());
    }

    public boolean setAmount(int amount) {
        if(amount<=maxAmount) {
            this.amount = amount;
            return true;
        }
        else {
            System.err.println("Amount is too big");
            return false;
        }
    }
    @Override
    public boolean add(IComposit i) {
        if(i instanceof Passenger) {
            if (((Passenger) i).getWeightLuggage() <= maxWeight) {
                this.passengers.add((Passenger) i);
                this.amount++;
                return true;
            }
        }
        System.err.println("This entity isn't Passenger or passenger's luggage is over");
        return false;
    }

    @Override
    public boolean remove(IComposit i) {
        if(i instanceof Passenger) {
            if(this.passengers.contains((Passenger) i)) {
                this.passengers.remove(i);
                this.amount--;
                return true;
            }
        }
        return false;
    }
    @Override
    public IComposit get(IComposit i) {
        return this;
    }

    public int getSummaryWeight(){
        int s=0;
        for(Passenger p:this.passengers){
            s+=p.getWeightLuggage();
        }
        return s;
    }
    public int  removeLuggage(int w){
        if(w<=this.getSummaryWeight()) {
            System.out.println(w + " kg of luggage were delete");
            return this.getSummaryWeight() - w;
        }
        System.err.println("Luggage of economy class was totally deleted but aircraft is overload ");
         return -1;
    }
}
   