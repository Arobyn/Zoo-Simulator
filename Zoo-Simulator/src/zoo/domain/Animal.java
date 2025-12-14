package zoo.domain;

public abstract class Animal implements Exportable {
    // Enkapsulacja: pola prywatne
    private String name;
    private int age;

    public Animal(String name, int age) {
        // Walidacja niezmienników (Age >= 0)
        if (age < 0) {
            throw new IllegalArgumentException("Wiek nie może być ujemny!");
        }
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + " je: Omnomnom.");
    }

    public void sleep() {
        System.out.println(this.name + " śpi: Zzz...");
    }

    // Metoda abstrakcyjna
    public abstract String sound();

    public String info() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    // Implementacja Exportable
    public String toCSV() {
        return this.name + ";" + this.age + ";" + this.getClass().getSimpleName();
    }

    // Gettery (potrzebne, bo pola są prywatne)
    public String getName() { return name; }
    public int getAge() { return age; }
}