public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarMultiply(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector vectorMultiply(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    public double vectorAngle(Vector vector) {
        return scalarMultiply(vector) / (length() * vector.length());
    }

    public Vector vectorPlus(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z);
    }

    public Vector vectorMinus(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z);
    }

    public static Vector[] newVectors(int n) {
        Vector[] newVectors = new Vector[n];
        for (int el = 0; el < newVectors.length; el++) {
            newVectors[el] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return newVectors;
    }
}