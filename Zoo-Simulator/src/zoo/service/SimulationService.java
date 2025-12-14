package zoo.service;

import zoo.domain.*;
import java.util.List;

public class SimulationService {

    public void runSimulation(List<Animal> animals, int turns) {
        System.out.println("=== ROZPOCZĘCIE SYMULACJI ===");

        for (int i = 1; i <= turns; i++) {
            System.out.println("\n--- TURA " + i + " ---");

            for (Animal animal : animals) {
                // 1. Podstawowe czynności (wszystkie zwierzęta)
                System.out.print("[" + animal.getClass().getSimpleName() + " " + animal.getName() + "]: ");
                animal.eat();
                System.out.println("   Dźwięk: " + animal.sound());

                // 2. Wykorzystanie polimorfizmu i rzutowania (instanceof) do specyficznych zdolności

                // Czy umie latać?
                if (animal instanceof Flyable) {
                    ((Flyable) animal).fly();
                }

                // Czy umie pływać?
                if (animal instanceof Swimmable) {
                    ((Swimmable) animal).swim();
                }

                // Czy da się go wytresować?
                if (animal instanceof Trainable) {
                    System.out.print("   Sztuczka: ");
                    ((Trainable) animal).performTrick();
                }
            }
        }
        System.out.println("\n=== KONIEC SYMULACJI ===");
    }
}
