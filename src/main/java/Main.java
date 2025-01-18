import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter login: ");
            String login = scanner.nextLine();

            if (login.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            try {
                Role role = UserMenu.userCheck(login, password);

                if (role == null) {
                    System.out.println("Invalid login or password. Try again");
                } else {
                    UserMenu.showMenu(role);
                    break;
                }
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println("Invalid login or password. Try again");
            }
        }
    }
}
