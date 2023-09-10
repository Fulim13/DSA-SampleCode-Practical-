package entity;

public abstract class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private double basicSalary;
    
    public abstract double computeMontlyPay();

    public Employee() {
    }

    // Searching Purpose
    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return String.format("%6d %-8s %10.2f", id, name, basicSalary);
    }

    @Override
    public int compareTo(Employee o) {
        if(this.id > o.id)
            return 1;
        else if (this.id == o.id)
            return 0;
        else 
            return -1;
    }

}
