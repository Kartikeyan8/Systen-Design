package stratergy;

public class Context {
    PaymentStratergy ob;
    public void setContext(PaymentStratergy ob)
    {
        this.ob = ob;
    }
    public void payNow(int amount)
    {
        if (ob == null)
        {
            System.out.println("strat not set");
        }
        ob.pay(amount);
    }

}
