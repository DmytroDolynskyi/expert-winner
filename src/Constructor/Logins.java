package Constructor;
import java.util.Scanner;

public class Logins {
    private static Object Login;

    public static void main(String[] args) {
        Users login1 = new Users("Login1", "Password1");
        Users login2 = new Users("Login2", "Password2");
        Users login3 = new Users("Login3", "Password3");
        Scanner input = new Scanner(System.in);
        String username;
        String pass;
        String login = login1.getLogin();
        String Password = login1.getPassword();
        System.out.println("Введите имя пользователя: ");
        username = input.nextLine();
        System.out.println("Введите пароль: ");
        pass = input.nextLine();
        if(username.equals(login) && pass.equals(Password)){
        System.out.println("Имя пользователя и пароль совпадают");
        } else {
            System.out.println("Имя пользователя или пароль не совпадают");
        }
    }
}

class Users{
    private String login;
    private String password;

    public Users(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void login(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setlogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
