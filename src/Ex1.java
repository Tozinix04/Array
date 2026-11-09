import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {

        int[] tablou = {21, 44, 57, 87, 95};

        System.out.println(Arrays.toString(tablou));

        System.out.println(tablou.length);

        tablou[0] = 5;
        System.out.println(tablou[0]);

        tablou[tablou.length - 1] = 99;
        System.out.println(Arrays.toString(tablou));
    }
}