package entity;

public class Student {

    private long id;		// Assumption: id is a 4-digit number
    private String name;
    private double cgpa;
    private static int fold_digits = 4;

    public Student() {
    }

    public Student(long id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int hashCode() {
        int divisor = (int)Math.pow(10,fold_digits);
        long quotient = id;
        long sum = 0;
        
        while(quotient > 0){
            sum += quotient % divisor;
            quotient /= divisor;
        }
        return (int)sum;
    } 

    public boolean equals(Object o) {
        if (o == null || !(o instanceof Student)) {
            return false;
        }

        Student s = (Student) o;
        return this.id == s.id;
    }

    public String toString() {
        return String.format("%15d %-20s %10.2f", id, name, cgpa);
    }
}
