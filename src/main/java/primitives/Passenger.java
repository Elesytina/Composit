package primitives;
import intefaces.IComposit;
public class Passenger implements IComposit {
    private int weightLuggage;
    public Passenger(int w){
        this.weightLuggage=w;
    }
    public Passenger(){
        this.weightLuggage=20;
    }
    public int getWeightLuggage() {
        return this.weightLuggage;
    }

    @Override
    public boolean add(IComposit i) {
        return false;
    }
    @Override
    public boolean remove(IComposit i) {
        return false;
    }
    @Override
    public IComposit get(IComposit i) {
        return this;
    }
}
