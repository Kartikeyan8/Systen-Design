package Builder;

public class GamingComputer implements Builder {
    Computer computer;
    public GamingComputer()
    {
        this.computer= new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCpu("Gaming CPU");
    }

    @Override
    public void buildRAM() {
    computer.setRam("Gaming Ram");
    }

    @Override
    public void buildStorage() {
        computer.setStorage(24);
    }

    @Override
    public Computer getResult() {
        return computer;
    }

}
