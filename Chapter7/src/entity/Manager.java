package entity;

public class Manager extends Employee{
    
    private double allowance;

    public Manager() {
    }

    public Manager(int id) {
        super(id);
    }

    public Manager(double allowance, int id, String name, double basicSalary) {
        super(id, name, basicSalary);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    

    @Override
    public double computeMontlyPay() {
        return getBasicSalary() + allowance;
    }
    

    @Override
    public String toString() {
        return super.toString() + String.format("%10.2f", allowance);
    }
    
    
    
}
