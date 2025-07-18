import java.lang.Math;
public class FloatTable {
    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] b = {2.0, 3.0, 4.0, 5.0, 6.0};

        
        System.out.println("a | b | pow(a, b)");
        System.out.println("--|---|----------");

        for (int i = 0; i < a.length; i++) {
	    int result = (int) Math.pow(a[i], a[i]);
            System.out.printf("%d | %d | %d%n", (int)a[i], (int)b[i], result);
        }
    } 
} 