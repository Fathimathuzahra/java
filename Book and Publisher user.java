import java.util.Scanner;

class Publisher {
    String name;
}

class Book extends Publisher {
    String title;
    void getDetails(String pub, String t) {
        name = pub;
        title = t;
    }
    void display(String type) {
        System.out.println(type + " Book - Title: " + title + ", Publisher: " + name);
    }
}

class Literature extends Book {}
class Fiction extends Book {}

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter category (literature/fiction): ");
        String category = sc.nextLine();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter publisher name: ");
        String publisher = sc.nextLine();

        if (category.equalsIgnoreCase("literature")) {
            Literature lit = new Literature();
            lit.getDetails(publisher, title);
            lit.display("Literature");
        } else if (category.equalsIgnoreCase("fiction")) {
            Fiction fic = new Fiction();
            fic.getDetails(publisher, title);
            fic.display("Fiction");
        } else {
            System.out.println("Invalid category.");
        }

        sc.close();
    }
}
