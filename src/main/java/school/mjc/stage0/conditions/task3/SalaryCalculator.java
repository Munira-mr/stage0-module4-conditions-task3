package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000||salary<=0) {
            float tax = (salary / 100) * 15;
            float newSalary = salary - tax;

            System.out.println(newSalary);
        } else if (salary <= 20000||salary>10000) {
            float tax = (salary / 100) * 18;
            float newSalary = salary - tax;
            System.out.println(newSalary);
        } else if (salary > 20000) {
            float tax = (salary / 100) * 20;
            float newSalary = salary - tax;
            System.out.println(newSalary);
        }else {
            System.out.println("wrong input!");
        }
    }
}
