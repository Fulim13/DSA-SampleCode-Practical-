package client;

import adt.*;
import entity.*;
import java.util.Iterator;

public class TestSortedList {

    public static void main(String[] args) {
        SortedListInterface<Employee> eList = new SortedLinkedList<>();
        eList.add(new Clerk(7.50, 10, 5555, "Ben", 1500.00));
        eList.add(new Clerk(8.50, 20, 1234, "Zoe", 1900.00));
        eList.add(new Clerk(6.50, 5, 6666, "Dan", 1350.00));
        eList.add(new Clerk(7.00, 7, 7849, "Jim", 1200.00));
        eList.add(new Manager(5000, 3257, "Ann", 8000.00));
        eList.add(new Manager(3000, 1111, "Bob", 9000.00));
        eList.add(new Manager(4500, 2157, "Josh", 7000.00));
        System.out.println("\nEmployee List: \n" + eList);
        
        int id = 5555;
        Employee emp = new Clerk(id);
        System.out.println("\nRemove id " + id + ": " + eList.remove(emp));
        System.out.println("\nEmployee List: \n" + eList);
        
        int totalEmployee = 0;
        double totalPayroll = 0.0;
        Iterator<Employee> itr = eList.getIterator();
        System.out.printf("%-6s %-8s %-10s\n","EmpID","Emp Name","Salary (RM)");
        while(itr.hasNext()){
            emp = itr.next();
            totalPayroll += emp.computeMontlyPay();
            System.out.printf("%6d %-8s %10.2f\n",emp.getId(),emp.getName(),emp.computeMontlyPay());
        }
        System.out.println("Total employees :" + eList.getNumberOfEntries());
        System.out.printf("Total payroll for the month: RM %,.2f\n" , totalPayroll);

    }
}
