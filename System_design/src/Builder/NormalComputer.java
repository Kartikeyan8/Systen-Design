package Builder;

public class NormalComputer implements Builder{
    Computer computer;
    public NormalComputer()
    {
        this.computer = new Computer();
    }
    @Override
    public void buildCPU() {
        computer.setCpu("Normal CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRam("Normal RAM");
    }

    @Override
    public void buildStorage() {
    computer.setStorage(8);
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
