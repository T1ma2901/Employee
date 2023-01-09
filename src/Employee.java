public class Employee {
    String firsName;
    String lastName;
    int age;
    int salary;

    public String getFirsName() {
        return firsName;
    }

    public Employee() {
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String firsName, String lastName, int age, int salary) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void print(){
        System.out.println("\nFirst name: "+firsName+"\nLast name: "+lastName+"\nAge: "+age+"" +
                "\nSalary: "+salary);
    }

}
