public class TugasHarian2_Pemdas2_Meyda_Wikaromah_2110131220015{
    public static void main(String[] args){
        double gravity = -9.81;
        double fallingTime = 10;
        double initialVelocity = 0.0;
        double initialPosition = 0.0;
        double x;
        x = (0.5 * ((gravity * fallingTime) * (gravity * fallingTime)) + (initialVelocity * fallingTime) + (initialPosition));
        System.out.println(x);
    }
}