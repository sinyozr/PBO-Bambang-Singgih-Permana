public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setplatNomor("B 0838 XY");
        motor1.setkecepatan(50);
        motor1.displayInfo();

        Motor motor2 = new Motor();
        motor2.setplatNomor("N 9840 AB");
        motor2.setstatusMesin(true);
        motor2.setkecepatan(40);
        motor2.displayInfo();

        Motor motor3 = new Motor();
        motor3.setplatNomor("D 8343 CV");
        motor3.setkecepatan(60);
        motor3.displayInfo();

    }

}