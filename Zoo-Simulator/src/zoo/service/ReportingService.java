package zoo.service;

import zoo.domain.Exportable;
import java.util.List;

public class ReportingService {

    public void generateCSVReport(List<? extends Exportable> items) {
        System.out.println("\n--- GENEROWANIE RAPORTU (CSV) ---");
        System.out.println("name;age;type");
        for (Exportable item : items) {
            System.out.println(item.toCSV());
        }
        System.out.println("---------------------------------");
    }
	
	 public void generateCSVReportByAge(List<? extends Exportable> items) {
        System.out.println("\n--- GENEROWANIE RAPORTU (CSV) ---");
        System.out.println("name;age;type");
        items.stream()
             .filter(item -> item instanceof Animal)
             .map(item -> (Animal) item)
             .sorted(Comparator.comparingInt(Animal::getAge))
             .forEach(animal -> System.out.println(animal.toCSV()));

        System.out.println("---------------------------------");
    }
}
}