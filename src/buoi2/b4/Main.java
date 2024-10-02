package buoi2.b4;

public class Main {
    public static void main(String[] args) {
        // Thời gian 2 xe gặp nhau
        /*double t = 2.25;
        double vCar = 54;
        double vBike = 38;

        // Tính quãng đường xe máy đi được:
        double sBike = vBike * t;
        double sCar = vCar *t;
        double sAB = sBike + sCar;
        System.out.println("Quãng đường AB = "+ sAB);*/
        double t = 2.5;
        double vLeg = 4.2;
        double sAB = t * vLeg;
        double vBicycle = vLeg * 2.5;
        System.out.println("Thời gian nó đi hết AB là: "+(sAB/ vBicycle));
    }
}
