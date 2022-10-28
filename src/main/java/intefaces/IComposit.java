package intefaces;

public interface IComposit {
    boolean add(IComposit i);
    boolean remove(IComposit i);
    IComposit get(IComposit i);
}
