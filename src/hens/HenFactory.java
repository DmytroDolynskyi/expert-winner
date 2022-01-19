package hens;

public class HenFactory {

    static Hen getHen(String country) {
        Hen hen = null;
        if (country.equals(Country.UKRAINE)) {
            hen=new UkrainianHen();
        }else if(country.equals(Country.POLAND)){
            hen=new PolishHen();
        }else if(country.equals(Country.MOLDOVA)){
            hen=new MoldovanHen();
        }else if(country.equals(Country.BELARUS)){
            hen=new BelarusianHen();
        }
        return hen;
    }
}