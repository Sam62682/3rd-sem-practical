public class p52 {
    public double x;
    public double y;

    public p52(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "p52(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        p52 v1 = new p52(2, 3);
        p52 v2 = new p52(4, 5);

        System.out.println("p52 1: " + v1);
        System.out.println("p52 2: " + v2);

        p52 v3 = new p52(v1.x + v2.x, v1.y + v2.y);
        System.out.println("v1 + v2 = " + v3);

        p52 v4 = new p52(v1.x - v2.x, v1.y - v2.y);
        System.out.println("v1 - v2 = " + v4);

        double scalar = 3;
        p52 v5 = new p52(v1.x * scalar, v1.y * scalar);
        System.out.println("v1 * " + scalar + " = " + v5);

        double dotProduct = (v1.x * v2.x) + (v1.y * v2.y);
        System.out.println("Dot product of v1 and v2 = " + dotProduct);

        double magnitudeV1 = Math.sqrt(v1.x * v1.x + v1.y * v1.y);
        System.out.println("Magnitude of v1 = " + magnitudeV1);
    }
}