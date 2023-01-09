public class Specialist extends Employee {
    int level;

    public Specialist() {
    }

    public Specialist(String firsName, String lastName,
                      int age, int salary, int level) {
        super(firsName, lastName, age, salary);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void print() {
        super.print();
        System.out.println("Level: "+level);
    }

    public void workWithClients() {
        System.out.println(firsName+" say: Я работаю с клиентами ");
    }

}
