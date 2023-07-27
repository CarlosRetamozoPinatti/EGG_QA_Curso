import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> countriesSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("Ingrese un país (o escriba 'salir' para finalizar): ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("salir")) {
                    break;
                }
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("El país no puede estar vacío.");
                }
                if (!Character.isUpperCase(input.charAt(0))) {
                    throw new IllegalArgumentException("El país debe empezar con mayúscula.");
                }
                if (!countriesSet.add(input)) {
                    System.out.println("El país ya ha sido ingresado anteriormente.");
                }
            }
            System.out.println("\nPaíses ingresados:");
            displayCountries(countriesSet);
            TreeSet<String> sortedCountries = new TreeSet<>(countriesSet);
            System.out.println("\nPaíses ordenados alfabéticamente:");
            displayCountries(sortedCountries);
            System.out.print("\nIngrese el país que desea eliminar: ");
            String countryToDelete = scanner.nextLine();
            if (countriesSet.contains(countryToDelete)) {
                countriesSet.remove(countryToDelete);
                System.out.println("\nPaíses después de eliminar " + countryToDelete + ":");
                displayCountries(countriesSet);
            } else {
                System.out.println("El país no se encontraba en la lista.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void displayCountries(Collection<String> countries) {
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
