import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Estudante[] e = new Estudante[10];

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int room = sc.nextInt();
            e[room] = new Estudante(nome, email, room);
            sc.nextLine();
        }

        System.out.println("Busy rooms:");
        if (e[0] != null) {
            String name = e[0].getNome();
            String email = e[0].getEmail();
            System.out.println("0: " + name + ", " + email);
        }

        for (int i = 1; i < e.length; i++) {
            if (e[i] != null) {
                String nome1 = e[i].getNome();
                String email1 = e[i].getEmail();
                System.out.println(i + ": " + nome1 + ", " + email1);
            }
        }

        sc.close();
    }
}