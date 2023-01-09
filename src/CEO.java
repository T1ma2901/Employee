public class CEO extends Manager {
    boolean hasCompanyCar;

    public CEO() {

    }


    public CEO(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public CEO(boolean hasStocks, boolean hasCompanyCar) {
        super(hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public CEO(String firsName, String lastName, int age, int salary, boolean hasStocks, boolean hasCompanyCar) {
        super(firsName, lastName, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public void print() {
        super.print();
        System.out.println("Has Company car:" + hasCompanyCar);
    }

    public void goPublic() {
        System.out.println(firsName+" say: Я работаю над IPO");
    }

}
