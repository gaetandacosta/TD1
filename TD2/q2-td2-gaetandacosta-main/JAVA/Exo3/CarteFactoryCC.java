package Exo3;

public class CarteFactoryCC extends CarteFactory{


    @Override
    public Carte fabriquerVisa() {
        return new VisaCC();
    }

    @Override
    public Carte fabriquerMasterCard() {
        return new MCCC();
    }
}
