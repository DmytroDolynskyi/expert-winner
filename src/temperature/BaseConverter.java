package temperature;
import javax.swing.*;

class TemperatureConverter{
    double temperature;

    public String convertTemp(double temperature, char convertTo){
        if (convertTo == 'F' || convertTo == 't'){
            this.temperature = (temperature*9/5+32);
            return String.valueOf(this.temperature)+" градусов по Фаренгейту";
        } else if(convertTo == 'K' || convertTo == 'c'){
            this.temperature = (temperature+273.15);
            return String.valueOf(this.temperature)+" градусов по Кельвину";
        } else return "Неверно выбран аргумент";

    }
}
public class BaseConverter{
    public static void main(String[] args){
        char convertTo =  JOptionPane.showInputDialog("Введите букву 'K' для преобразования в градусы по Кельвину и букву 'F' для преобразования в градусы по Фаренгейту").charAt(0);

        int temperature = Integer.parseInt(JOptionPane.showInputDialog("Введите значение градусов"));

        TemperatureConverter t = new TemperatureConverter();
        JOptionPane.showMessageDialog(null, t.convertTemp(temperature, convertTo));
    }
}