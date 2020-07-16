import java.util.Random;
public class Ex01 {
    public static void main(String[] args)
    {
        int a=1;
        int b = 5;
        int max = 10;
        int res;
        double res2;
        for (a =1; a<max; a++)
        {
            res = a*b;
            System.out.println(res);
        }
        Random gerador = new Random();
        for (a=2; a<=max; a++)
        {
            int c=5;
            b = gerador.nextInt();
            res2 = (b*b)-(4*a*c);
            System.out.println(res2);
        }

    }
}
