public class UserMenu {
    private static final User user1 = new User("twD@A.oGAgTZ835weWfd", ")lK0p!rwSg", Role.ADMIN);
    private static final User user2 = new User("3Mu@XaY7Efu3TR.Ht-Mj", "T;YP+vI65hCn", Role.USER);

    public static Role userCheck(String login, String password) throws WrongLoginException, WrongPasswordException{

        if (!login.matches("[a-zA-Z0-9@._-]{20,}") || login.length() < 20) {
            throw new WrongLoginException();
        }

        if (!password.matches("[a-zA-Z0-9{}\\[\\](),.;&?!_\\-+]{8,}") || password.length() < 8) {
            throw new WrongPasswordException();
        }

        if (login.equals(user1.getLogin()) && password.equals(user1.getPassword())) {
            return user1.getRole();
        } else if (login.equals(user2.getLogin()) && password.equals(user2.getPassword())) {
            return user2.getRole();
        } else {
            return null;
        }

    }

    public static void showMenu(Role role) {
        if (role == Role.ADMIN) {
            System.out.println("1. File");
            System.out.println("2. Create new user");
            System.out.println("3. exit");
        } else if (role == Role.USER) {
            System.out.println("1. File");
            System.out.println("2. Get play list");
            System.out.println("3. exit");
        }
    }
}
