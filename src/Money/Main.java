package money;

public class Main {
    public static void main(String[] args){
        try{
            Income[] incomes = new Income[]{
                    new Salary(7500),
                    new GaoFei(15000)
            };
            double total = 0;
            for(Income income:incomes){
                total += income.getTax();
            }
            System.out.println(total);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
