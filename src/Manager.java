public class Manager extends Employee {
    boolean hasStocks;

    public Manager() {

    }

    public Manager(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public Manager(String firsName, String lastName, int age, int salary, boolean hasStocks) {
        super(firsName, lastName, age, salary);
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public void print() {
        super.print();
        System.out.println("Has stocks: "+hasStocks);
    }

    public void writeProcedures() {
        System.out.println(firsName+" say: Я разрабатываю процедуры");
    }

}
