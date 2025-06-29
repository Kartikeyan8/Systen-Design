package memento;

public class Memento {
    int h;
    int w ;
    public Memento(int h,int w)
    {
        this.h = h;
        this.w= w;

    }
    public int geth()
    {
        return h;
    }
    public int getw()
    {
        return w;
    }
}
