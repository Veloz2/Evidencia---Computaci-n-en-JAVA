//Aqui inicializamos el programa para que funcione como se espera
public class Main {
    public static void main(String[] args) {

        Login login = new Login();

        if (login.newLogin()) {
            Sistema sistema = new Sistema();
            Menu menu = new Menu(sistema);
            menu.mostrar();
        }

    }
}