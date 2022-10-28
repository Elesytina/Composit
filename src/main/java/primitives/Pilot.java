package primitives;
import intefaces.IComposit;
import java.util.ArrayList;
import java.util.List;

public class Pilot implements IComposit {
    public static final int amount=2;
    public static List<Pilot> pilots=new ArrayList<>();

    @Override
    public boolean add(IComposit i) {
        if((i instanceof Pilot)&& pilots.size()<amount){
            this.pilots.add((Pilot) i);
            return true;
        }
       throw new RuntimeException("There ate 2 pilots, it's impossible to add more");
    }

    @Override
    public boolean remove(IComposit i) {
        if((i instanceof Pilot)&& pilots.contains((Pilot) i)){
            pilots.remove((Pilot) i);
            return true;
        }
        System.err.println("Can't delete pilot");
        return false;
    }

    @Override
    public IComposit get(IComposit i) {
        return this;
    }
}
