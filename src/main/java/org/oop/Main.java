package org.oop;
import java.util.Scanner;
import org.oop.apps.Permutations;
import org.oop.apps.Stocks;
import org.oop.apps.WaterContainer;

public class Main {
    public static void main(String[] args) {
        try (Scanner numberScanner = new Scanner(System.in)) {
            System.out.print("Выберите программу (1, 2, 3): ");
            int option = numberScanner.nextInt();

            switch (option) {
                case 1 -> {
                    Permutations.main(args);
                    return;
                }
                case 2 -> {
                    Stocks.main(args);
                    return;
                }
                case 3 -> {
                    WaterContainer.main(args);
                    return;
                }
            }
            throw new NumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Неправильный номер программы");
        }
    }
}
