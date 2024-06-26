package Clase;

import java.time.LocalDate;

public class PremiumPlan extends BasicPlan {
    private int id;
    private int cashback;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public PremiumPlan(){};
    public PremiumPlan(int cashback) {
        this.cashback = cashback;
    }
    public PremiumPlan(BasicPlan b){
        super(b.getPret(),b.getStartDate());
    }

    public PremiumPlan(int pret, LocalDate startDate, int cashback) {
        super(pret, startDate);
        this.cashback = cashback;
    }

    public int getCashback() {
        return cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }
}
