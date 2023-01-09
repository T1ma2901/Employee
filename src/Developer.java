public class Developer extends Employee {
    String grades;

    public Developer() {

    }

    public Developer(String grades) {
        this.grades = grades;
    }

    public Developer(String firsName, String lastName, int age, int salary, String grades) {
        super(firsName, lastName, age, salary);
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public void print() {
        super.print();
        System.out.println("Grades: "+grades);
    }

    public void writeCode() {
        System.out.println(firsName+" say: Я пишу код");
    }

}
