import java.util.Objects;
import java.util.Scanner;

public class Client extends Person implements Callable, Actions{
    Scanner in = new Scanner(System.in);
    String clientOrder;
    public String address;

    public Client(String name, String phoneNumber, int id, String clientOrder, String address) {
        super(name, phoneNumber, id);
        this.clientOrder = clientOrder;
        this.address = address;
    }

    @Override
    public void info() {
        System.out.println("name: " + getName());
        System.out.println("phone-number: " + getPhoneNumber());
        System.out.println("id: " + getId());
        System.out.println("order: " + clientOrder);
        System.out.println("address: " + address);
    }

    public void order() {
        System.out.println("You ordered " + clientOrder + "\nWe will deliver it to you soon");
    }

    @Override
    public void call() {
        System.out.println("Calling to courier...");
        System.out.println("Calling to the couries... x - end the call");
        String callEnd = in.next();
        if (Objects.equals(callEnd, "x")) {
            System.out.println("call completed");

        }else {
            System.out.println("Courier will be in 10 minutes");
        }
    }

    @Override
    public void action() {
        System.out.println("Choose action 1 - order, 2 call");
        int choseAction;
        choseAction = in.nextInt();
        if (choseAction == 1) {
            order();
        } else if (choseAction == 2) {
            call();
        }
    }
}
