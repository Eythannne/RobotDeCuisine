import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Saisissez le nom d'un ingrédients :");
        String nom = scanner.nextLine();
        System.out.println("Saisissez la quanitie de l'ingrédients :");
        double quantite = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Saisissez l'unité que vous souhaitez :");
        String unite = scanner.nextLine();

        Ingrédients monIngredient = new Ingrédients(nom, quantite, unite);

        System.out.println("Quantite de l'ingredient : " + monIngredient.getQuantite());
        System.out.println("unite de l'ingredient : " + monIngredient.getUnite());
        System.out.println("nom de l'ingredient : " + monIngredient.getNom());


    }

}
