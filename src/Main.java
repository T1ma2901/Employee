public class Main {
    public static void main(String[] args) {

        Specialist spec = new Specialist("Dan", "Broker", 28, 2000, 3);
        Specialist spec1 = new Specialist("Alex", "Freeman", 29, 2800, 4);
        Specialist spec2 = new Specialist("Johan", "De Marco", 30, 2000, 2);

        Developer dev = new Developer("Angelina", "Kim", 18, 1400, "Junior");
        Developer dev1 = new Developer("Tima", "Kaparov", 28, 3000, "Senior");
        Developer dev2 = new Developer("Oleg", "Kenzov", 30, 2200, "Middle");
        Developer dev3 = new Developer("Anna", "Smirnova", 25, 2000, "Middle");

        Manager mang = new Manager("Kristian", "Tramp", 36, 5000, true);
        Manager mang1 = new Manager("Sofia", "Kim", 37, 4500, false);
        CEO gendir = new CEO("Jhon", "Nikolson", 49, 9800, true, true);

        Employee[] allEmp = new Employee[]{spec, spec1, spec2, dev, dev1, dev2, dev3, mang, mang1, gendir};
        for (Employee i : allEmp) {
            if (i instanceof Specialist) {
                System.out.println("\n>>>Specialist<<<");
                i.print();
                ((Specialist) i).workWithClients();
            }
            if (i instanceof Developer) {
                System.out.println("\n>>>Developer<<<");
                i.print();
                ((Developer) i).writeCode();
            }
            if (i instanceof Manager) {
                if (i.equals(gendir)) {
                    System.out.println("\n>>>CEO<<<");
                    i.print();
                    gendir.goPublic();
                    break;
                }
                System.out.println("\n>>>Manager<<<");
                i.print();
                ((Manager) i).writeProcedures();
            }
        }
    }
}

//
//Пример распечатки фразы работника: "I am writing my awesome algorithm!"
//В классе Main необходимо создать 3-х, специалистов,
// 4-х разработчиков, 2-х менеджеров и 1-го CEO,
// распечатать все поля каждого объекта (print) и
// вызвать уникальные методы каждого объекта.