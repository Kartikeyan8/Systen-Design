package memento;

public class Originator {
    public int h;
    public int w ;
    public Originator(int h, int w)
    {
        this.h = h;
        this.w = w;
    }
    public void seth (int h)
    {
        this.h = h;
    }
    public void setw(int w)
    {
        this.w = w;
    }
    public Memento createMemento()
    {
        return new Memento(this.h,this.w);
    }
    public void restoreMemento(Memento ob)
    {
        this.h = ob.h;
        this.w = ob.w;
    }
}
