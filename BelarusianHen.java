package hens;

public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 35;
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" "+"Моя страна - "+Country.BELARUS;
    }
}
