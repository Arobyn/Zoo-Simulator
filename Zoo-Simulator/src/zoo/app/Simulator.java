package zoo.app;

import zoo.domain.*;
import zoo.service.ReportingService;
import zoo.service.SimulationService;

import java.util.ArrayList;
import java.util.List;

public class Simulator {
    public static void main(String[] args) {
        // 1. Inicjalizacja ZOO (Polimorficzna kolekcja)
        List<Animal> myZoo = new ArrayList<>();

        try {
            // Dodajemy różne zwierzęta
            myZoo.add(new Lion(5, "Gold"));
            myZoo.add(new Eagle("Eddie", 4, 2.5));
            myZoo.add(new Penguin("Kowalski", 3, 0.5));
            myZoo.add(new Iguana("Ziggy", 2, "Green"));

            // Test walidacji (odkomentuj żeby sprawdzić błąd)
            // myZoo.add(new Lion(-1, "Error"));

        } catch (IllegalArgumentException e) {
            System.err.println("Błąd tworzenia zwierzęcia: " + e.getMessage());
        }

        // 2. Uruchomienie Serwisów
        SimulationService simService = new SimulationService();
        ReportingService reportService = new ReportingService();

        // Wyświetlenie stanu początkowego
        System.out.println("Zwierzęta w ZOO: " + myZoo.size());
        for(Animal a : myZoo) {
            System.out.println(a.info());
        }

        // 3. Start Symulacji (np. 3 tury)
        simService.runSimulation(myZoo, 3);

        // 4. Generowanie Raportu
        reportService.generateCSVReport(myZoo);
    }
}