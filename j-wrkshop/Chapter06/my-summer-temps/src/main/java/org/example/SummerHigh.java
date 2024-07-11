package org.example;

public class SummerHigh {
    
    private City base;
    private City noEmissionCuts;
    private City moderateEmissionCuts;

    public SummerHigh(City base, City noEmissionCuts, City moderateEmissionCuts) {
        this.base = base;
        this.noEmissionCuts = noEmissionCuts;
        this.moderateEmissionCuts = moderateEmissionCuts;
    }


    public City getBase() {
        return base;
    }

    public void setBase(City base) {
        this.base = base;
    }

    public City getNoEmissionCuts() {
        return noEmissionCuts;
    }

    public void setNoEmissionCuts(City noEmissionCuts) {
        this.noEmissionCuts = noEmissionCuts;
    }

    public City getModerateEmissionCuts() {
        return moderateEmissionCuts;
    }

    public void setModerateEmissionCuts(City moderateEmissionCuts) {
        this.moderateEmissionCuts = moderateEmissionCuts;
    }
}
