public class BmiService {
    public  static float calculate (float height , float weight) { //функция расчета BMI
        float bodyMileIndex = weight / (height * height);
        return bodyMileIndex;
    }
}
