package ai0514;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {

        for (int i=2;i<=9;i++)
        {
            for(int j=1;j<10;j++)
            {
                System.out.printf("%d*%d=%d\t",i,j,i*j);
            }
            System.out.println();

        }
    }
}
