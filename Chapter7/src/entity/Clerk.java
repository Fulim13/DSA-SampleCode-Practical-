package entity;

public class Clerk extends Employee {

    private double overtimeRate;
    private int overtimeHours;

    public Clerk() {
    }

    public Clerk(int id) {
        super(id);
    }

    public Clerk(double overtimeRate, int overtimeHours, int id, String name, double basicSalary) {
        super(id, name, basicSalary);
        this.overtimeRate = overtimeRate;
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double computeOvertimePay(){
        return overtimeHours * overtimeRate;
    }
    
    @Override
    public double computeMontlyPay() {
        return getBasicSalary() + computeOvertimePay();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%10.2f %6d", overtimeRate,overtimeHours);
    }

}
