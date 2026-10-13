package PREP2025.stage1;

import java.util.Scanner;

public class Circumference {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter a radius: ");
            double rad = in.nextInt();


            cicumference(rad);
            in.close();
        }

        static double cicumference(double rad) {
            double area = Math.PI * (rad*rad);
            System.out.println(area);

            return area;
        }
    }
