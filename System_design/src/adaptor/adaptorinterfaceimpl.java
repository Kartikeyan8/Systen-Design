package adaptor;

public class adaptorinterfaceimpl implements adaptorinterface{
    WeightMachine weightMachine;
    public adaptorinterfaceimpl(WeightMachine weightMachine)
    {
        this.weightMachine = weightMachine;
    }
    @Override
    public int getWeightInKg() {
        return weightMachine.getWeightInPound()*2;
    }
}
