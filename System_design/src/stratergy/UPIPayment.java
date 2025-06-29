package stratergy;

import stratergy.PaymentStratergy;

public class UPIPayment implements PaymentStratergy {

    @Override
    public void pay(int amount) {
        System.out.println("Paid in UPI  " + amount );
    }
}