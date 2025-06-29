package Builder;

public class Director {
    public void construct(Builder b)
    {
        b.buildCPU();
        b.buildRAM();
        b.buildStorage();
        b.getResult();
    }

}
