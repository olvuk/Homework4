public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия.");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 2;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градуса/ов, можно идти без шапки.");
        }
        else {
            System.out.println("На улице " + temperature + " градуса/ов, нужно надеть шапку.");
        }

        }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 85;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        //Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
        //Если человеку от 7 до 18 лет, то ему нужно ходить в школу.
        //Если человеку больше 18 лет, но меньше 24, то его место в университете.
        //А если человеку больше 24, то ему пора ходить на работу.

        int age = 28;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университет.");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        //Как правило, на аттракционах действуют ограничения для детей по возрасту:
        //Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        //Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
        //Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        //Напишите программу, которая выводит в консоль сообщение в формате:
        // «Если возраст ребенка равен …, то ему … (в зависимости от возраста дописать нужное: нельзя кататься на аттракционе, можно кататься на аттракционе в сопровождении / без сопровождения взрослого)».

        int age = 21;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему нельзя кататься на аттракционе.");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататься без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        //Вместимость одного вагона поезда — 102 человека.
        // Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
        //С помощью условного оператора и конструкции else напишите программу,
        // которая выводит в консоль сообщение о том, есть ли место в вагоне,
        // сидячее или стоячее, или вагон уже полностью забит.

        int capacity = 102;
        int numberOfSeats = 60;
        int numberOfStandees = capacity - numberOfSeats;
        int numberOfPassengers = 85;
        if (numberOfPassengers < numberOfSeats) {
            System.out.println("В вагоне есть свободные сидячие места.");
        }
        else
            if (numberOfPassengers >= numberOfSeats && numberOfPassengers < capacity) {
                System.out.println("В вагоне есть свободные стоячие места.");
            }
            else
                if (numberOfPassengers >= capacity) {
                    System.out.println("В вагоне нет свободных мест.");
                }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int one = 1;
        int two = 3;
        int three = 7;

        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        }
        else
            if (two > one && two > three) {
                System.out.println("Наибольшее число " + two);
            }
            else
                System.out.println("Наибольшее число " + three);

        }
    }