package Exo3;

public class CarteFactoryCD extends CarteFactory{

    @Override
    public Carte fabriquerVisa() {
        return new VisaCD();
    }

    @Override
    public Carte fabriquerMasterCard() {
        return new MCCD();
    }
}
