# Zoo Simulator

**Zoo Simulator** to projekt w języku **Java**, którego celem jest symulacja podstawowych zachowań różnych zwierząt w ZOO. 

Projekt może być traktowany jako mini‑silnik symulacji z raportowaniem aktywności zwierząt.

## Struktura pakietów
```
zoo
├── app
│   └── Simulator.java
├── domain
│   ├── Animal.java
│   ├── Mammal.java
│   ├── Bird.java
│   ├── Reptile.java
│   ├── Lion.java
│   ├── Elephant.java
│   ├── Eagle.java
│   ├── Penguin.java
│   ├── Iguana.java
│   ├── Hummingbird.java
│   ├── Flyable.java
│   ├── Swimmable.java
│   ├── Trainable.java
│   └── Exportable.java
└── service
    ├── SimulationService.java
    └── ReportingService.java
```
## Główne elementy projektu

### 1. Abstrakcyjna klasa bazowa

```java
abstract class Animal
```

Pola:

* `name` (String)
* `age` (int, walidacja: age >= 0)

Metody:

* `eat()`
* `sleep()`
* `abstract String sound()`
* `String info()`

Klasa `Animal` implementuje interfejs `Exportable`, umożliwiający raportowanie danych.

### 2. Hierarchia dziedziczenia

* `Mammal extends Animal`
* `Bird extends Animal`
* `Reptile extends Animal`

Każda klasa pośrednia może posiadać własne pola (np. kolor futra, rozpiętość skrzydeł, kolor łusek).

Przykładowe klasy konkretne:

* `Lion`
* `Elephant`
* `Eagle`
* `Penguin`
* `Iguana`
* `Hummingbird`

### 3. Interfejsy – zdolności

Projekt wykorzystuje interfejsy opisujące zdolności zwierząt:

```java
Flyable    -> fly()
Swimmable -> swim()
Trainable -> performTrick()
```

Zwierzęta implementują tylko te interfejsy, które odpowiadają ich możliwościom.

Polimorfizm jest wykorzystywany podczas symulacji – zachowania są wywoływane na podstawie typu interfejsu.

### 4. Enkapsulacja i niezmienniki

* Wszystkie pola są `private`
* Dostęp zapewniają gettery
* Walidacja danych w konstruktorach (np. wiek >= 0)
* Stałe, np. `MAX_AGE_MAMMAL`

## Mini‑silnik symulacji

### SimulationService

Klasa odpowiedzialna za przeprowadzanie symulacji w turach:

* każda tura uruchamia:

  * jedzenie (`eat()`)
  * wydawanie dźwięku (`sound()`)
  * zdolności specjalne (latanie, pływanie, sztuczki)

Symulacja działa na polimorficznej kolekcji `List<Animal>`.

### ReportingService

Serwis raportujący dane o zwierzętach.

Aktualnie zaimplementowany format:

* CSV

Przykładowy output:

```
name;age;type
Lion;5;Lion
Eddie;4;Eagle
Kowalski;3;Penguin
```

Raport generowany jest na podstawie interfejsu `Exportable`.


## Diagram klas (uproszczony)
```
            Animal (abstract)
               |
   ----------------------------------------------
   |             	 |               			|
 Mammal        	 	 Bird          			 Reptile
   |             	 |               			|
 Lion,Elephant 	Eagle, Penguin.Hummingbird    Iguana
```

Interfejsy:

* Flyable
* Swimmable
* Trainable

## Technologie

* Java
