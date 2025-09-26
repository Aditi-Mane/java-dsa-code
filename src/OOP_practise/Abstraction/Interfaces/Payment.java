package OOP_practise.Abstraction.Interfaces;

// First interface
interface Payment {
    void pay(double amount);
}

// Second interface
interface Refund {
    void refund(double amount);
}

// Class implementing multiple interfaces
class CreditCardPayment implements Payment, Refund {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card");
    }
}

// Another class implementing multiple interfaces
class UPIPayment implements Payment, Refund {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to UPI Wallet");
    }
}

class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Refund r1 = new CreditCardPayment();

        Payment p2 = new UPIPayment();
        Refund r2 = new UPIPayment();

        p1.pay(2000);
        r1.refund(500);

        p2.pay(1500);
        r2.refund(300);
    }
}
