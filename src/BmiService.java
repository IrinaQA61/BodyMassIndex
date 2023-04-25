public class BmiService {
    public double calculate (int weight, double height){
        double bmi = weight / (height*height); // считаем ИМТ
        return bmi; // возвращаем рассчитанный индекс массы тела
    }
}
