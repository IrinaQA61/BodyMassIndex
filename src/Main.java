// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 66; // вес в килограммах
        double height = 1.64; // рост в метрах
        double bmi = service.calculate(weight, height); // считаем ИМТ
        String bmiResult = String.format("%.2f",bmi); // округляем до 2-х знаков
        System.out.println("Ваш вес: " + weight + " кг.");
        System.out.println("Ваш рост: " + height*100 + " см.");
        System.out.println("Ваш индекс массы тела: " + bmiResult);
    }
}