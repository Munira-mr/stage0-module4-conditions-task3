package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000||salary<=0) {
            int tax = (salary / 100) * 15;
            int newSalary = salary - tax;

            System.out.println(newSalary);
        } else if (salary <= 20000||salary>10000) {
            int tax = (salary / 100) * 18;
            int newSalary = salary - tax;
            System.out.println(newSalary);
        } else if (salary > 20000) {
            int tax = (salary / 100) * 20;
            int newSalary = salary - tax;
            System.out.println(newSalary);
        }else {
            System.out.println("wrong input!");
        }
    }
}
