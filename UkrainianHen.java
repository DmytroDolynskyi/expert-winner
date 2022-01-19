package hens;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 50;
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" "+"Моя страна - "+Country.UKRAINE;
    }
}
