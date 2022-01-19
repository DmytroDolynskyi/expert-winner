package hens;

public class Result {
    public static void main(String[] args) {
        Hen hen1 = HenFactory.getHen(Country.UKRAINE);
        Hen hen2 = HenFactory.getHen(Country.POLAND);
        Hen hen3 = HenFactory.getHen(Country.MOLDOVA);
        Hen hen4 = HenFactory.getHen(Country.BELARUS);
        String s1=hen1.getDescription()+". Я несу "+hen1.getCountOfEggsPerMonth()+" яиц в месяц.";
        String s2=hen2.getDescription()+". Я несу "+hen2.getCountOfEggsPerMonth()+" яиц в месяц.";
        String s3=hen3.getDescription()+". Я несу "+hen3.getCountOfEggsPerMonth()+" яиц в месяц.";
        String s4=hen4.getDescription()+". Я несу "+hen4.getCountOfEggsPerMonth()+" яиц в месяц.";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
