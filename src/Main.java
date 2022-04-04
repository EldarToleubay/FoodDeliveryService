import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Eldar", "+77784267525", 123, "Pizza", "Abay avenue, 55");
        Scanner in = new Scanner(System.in);
        System.out.println("Who are you? 1 - Client , 2 - Courier");
        int identification = in.nextInt();
        int choseAction;
        if (identification == 1) {
            client1.action();
        } else if (identification == 2) {
            Courier courier1 = new Courier("Ivan", "7777", 124, client1.clientOrder, client1.address);
            courier1.action();
        }


    }
}
