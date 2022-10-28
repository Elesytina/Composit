package primitives;
import intefaces.IComposit;
import java.util.ArrayList;
import java.util.List;

public class Stewardess implements IComposit{
    public static final int amount=6;
    public static List <Stewardess> stewardesses=new ArrayList<>();

    @Override
    public boolean add(IComposit i) {
        if((i instanceof Stewardess)&& stewardesses.size()<amount){
            stewardesses.add((Stewardess) i);
            return true;
        }
        throw new RuntimeException("There ate 6 stewardesses, it's impossible to add more");
    }

    @Override
    public boolean remove(IComposit i) {
        if((i instanceof Stewardess)&& stewardesses.contains((Stewardess) i)){
            stewardesses.remove((Stewardess) i);
            return true;
        }
        System.err.println("Can't delete stewardess");
        return false;
    }

    @Override
    public IComposit get(IComposit i) {
        return this;
    }
}

