import java.util.Scanner;

public class Courier extends Person implements Deliverable, Callable, Actions {
    Scanner in = new Scanner(System.in);
    String orderForDelivery;
    String addressOfClient;

    public Courier(String name, String phoneNumber, int id, String orderForDelivery, String addressOfClient) {
        super(name, phoneNumber, id);
        this.orderForDelivery = orderForDelivery;
        this.addressOfClient = addressOfClient;
    }

    @Override
    public void info() {
        System.out.println("name: " + getName());
        System.out.println("phone-number: " + getPhoneNumber());
        System.out.println("id: " + getId());
        System.out.println("order: " + orderForDelivery);
        System.out.println("address: " + addressOfClient);
        action();
    }

    @Override
    public void deliver() {
        System.out.println("Deliver the " + orderForDelivery + " product to the address " + addressOfClient);
    }

    @Override
    public void call() {
        System.out.println("Calling to the client... 0 - end the call");
        if (in.next() == "x") {
            System.out.println("call completed");
        }
    }

    @Override
    public void action() {
        System.out.println("Choose action 1 - order, 2 - call , 3 - info");
        int choseAction;
        choseAction = in.nextInt();
        if (choseAction == 1) {
            deliver();
        } else if (choseAction == 2) {
            call();
        } else if (choseAction == 3) {
            info();
        }
    }
}

