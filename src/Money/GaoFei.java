package Money;

public class GaoFei implements Income {
    private double gaoFei;

    public GaoFei(double bonus) {
        if(bonus < 0){
            throw new IllegalArgumentException("Bonus must be greater than 0");
        }
        this.gaoFei = bonus;
    }

    @Override
    public double getTax() {
        if(gaoFei <= 10000){
            return 0;
        }else{
            return (gaoFei - 10000) * 0.2;
        }
    }
}
