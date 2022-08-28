package interfaces;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new Logger[]{new DataBaseLogger(), new FileLogger(), new SmsLogger()});

        Customer customer1 = new Customer(2, "Eyser", "Engin");

        customerManager.add(customer1);
    }
}
