package Money;


public class Salary implements Income {
    private double salary;

    public Salary(double salary) {
        if(salary < 0){
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
        this.salary = salary;
    }

    @Override
    public double getTax() {
        if(salary <= 5000){
            return 0;
        }else{
            return (salary - 5000) * 0.1;
        }
    }
}
