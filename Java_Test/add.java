import java.util.Scanner;

public class add {
    public static void main(String[] args) {

        // addition of two numbers
        /*
         * int a=74,b=36;
         * int c=a+b;
         * System.out.print(c);
         */

        // division of two numbers
        /*
         * int a=50,b=3;
         * int c=a/b;
         * System.out.print(c);
         */

        // Take two inputs and gives the prooduct of them
        /*
         * Scanner sc=new Scanner(System.in);
         * System.out.println("First Number : ");
         * int a=sc.nextInt();
         * System.out.println("Second Number : ");
         * int b=sc.nextInt();
         * int c=a*b;
         * System.out.println("Product : "+c);
         */

        // sum (addition), multiply, subtract, divide and remainder of two numbers.
        /*
         * Scanner sc=new Scanner(System.in);
         * System.out.println("First Number : ");
         * int a=sc.nextInt();
         * System.out.println("Second Number : ");
         * int b=sc.nextInt();
         * System.out.println("Sum : "+(a+b));
         * System.out.println("Subtract : "+(a-b));
         * System.out.println("Product : "+a*b);
         * System.out.println("Division : "+a/b);
         */

        // program that takes a number as input and prints its multiplication table upto
        /*
         * Scanner sc=new Scanner(System.in);
         * System.out.println("First Number : ");
         * int a=sc.nextInt();
         * for(int i=1;i<=10;i++){
         * System.out.println(a+"*"+i +"="+ (a*i));
         */

        // Pattern
        /*
         * System.out.println("   J    a   v     v  a     ");
         * System.out.println("   J   a a   v   v  a a    ");
         * System.out.println("J  J  aaaaa   V V  aaaaa   ");
         * System.out.println(" JJ  a     a   V  a     a  ");
         */

        // program to print the area and perimeter of a circle.
        /*
         * float radius=7.5f;
         * double perimeter=2*3.14*radius;
         * double area=3.14*radius*radius;
         * System.out.println("perimeter "+perimeter);
         * System.out.println("area "+area);
         */

        // program that takes three numbers as input to calculate and print the average
        // of the numbers.
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("First Number : ");
         * int a = sc.nextInt();
         * System.out.println("Second Number : ");
         * int b = sc.nextInt();
         * System.out.println("Third Number : ");
         * int c = sc.nextInt();
         * int avg = (a + b + c) / 3;
         * System.out.println("Average : " + avg);
         */

        // program to print the area and perimeter of a rectangle.
        /*
         * float width = 5.6f;
         * float height = 8.5f;
         * double perimeter = 2 * (width+height);
         * double area = width*height;
         * System.out.println("perimeter " + perimeter);
         * System.out.println("area " + area);
         */

        // Pattern
        /*
         * for(int i=1;i<=9;i++){
         * if (i%2==0){
         * System.out.println(" * * * * *  ==================================");
         * }else{
         * System.out.println("* * * * * * ==================================");
         * }
         * }
         * for(int i=1;i<=6;i++){
         * System.out.println("==============================================");
         * }
         */

        // Java program to swap two variables.
        /*
         * int a = 10, b = 20;
         * a=a+b;
         * b=a-b;
         * a=a-b;
         * System.out.println("a: "+a);
         * System.out.println("b: "+b);
         */

        // Java program to print a face.
        /*
         * System.out.println(" +\"\"\"\"\"+ ");
         * System.out.println("[| o o |]");
         * System.out.println(" |  ^  | ");
         * System.out.println(" | '-' | ");
         * System.out.println(" +-----+ ");
         */

        // program to add two binary numbers.

        /*
         * int a = 10;
         * int b = 11;
         * String bin = " ";
         * String bin1 = " ";
         * while (a != 0) {
         * int a1 = a % 2;
         * bin = a1 + bin;
         * a = a / 2;
         * }
         * while (b != 0) {
         * int b1 = a % 2;
         * bin1 = b1 + bin1;
         * b = b / 2;
         * }
         * System.out.println(bin + bin1);
         */

        // multiply two binary numbers.
        /*
         * int a = 10;
         * int b = 11;
         * String bin = " ";
         * String bin1 = " ";
         * while (a != 0) {
         * int a1 = a % 2;
         * bin = a1+bin;
         * a = a / 2;
         * }
         * while (b != 0) {
         * int b1 = a % 2;
         * bin1 = b1 + bin1;
         * b = b / 2;
         * }
         * System.out.println((int) bin * (int) bin1);
         */

        // convert a decimal number to binary number.
        /*
         * int a = 5;
         * String bin = " ";
         * while (a != 0) {
         * int a1 = a % 2;
         * bin = a1+bin;
         * a = a / 2;
         * }
         * System.out.println(bin);
         */

        // convert a decimal number to hexadecimal number.
        /*
         * int a = 15;
         * String hex = " ";
         * while (a != 0) {
         * int a1 = a % 16;
         * if (a1 == 10) {
         * hex = 'a' + hex;
         * } else if (a1 == 11) {
         * hex = 'b' + hex;
         * } else if (a1 == 12) {
         * hex = 'c' + hex;
         * } else if (a1 == 13) {
         * hex = 'd' + hex;
         * } else if (a1 == 14) {
         * hex = 'e' + hex;
         * } else if (a1 == 15) {
         * hex = 'f' + hex;
         * } else {
         * hex = a1 + hex;
         * }
         * a = a / 16;
         * }
         * System.out.println(hex);
         */

        // convert a decimal number to octal number.
        /*
         * int a = 15;
         * String oct = " ";
         * while (a != 0) {
         * int a1 = a % 8;
         * oct = a1 + oct;
         * a = a / 8;
         * }
         * System.out.println(oct);
         */

        // convert a binary number to decimal number.
        /*
         * int n = 100;
         * int k = 0;
         * int dec = 0;
         * while (n != 0) {
         * int d = n % 10;
         * dec = dec + d * pow(2, k++);
         * n = n / 10;
         * }
         * 
         * System.out.println(dec);
         */

        // binary number to hexadecimal number.
        /*
         * // binary to decimal
         * int n = 1101;
         * int k = 0;
         * int dec = 0;
         * while (n != 0) {
         * int d = n % 10;
         * dec = dec + d * pow(2, k++);
         * n = n / 10;
         * }
         * // decimal to hexadecimal
         * String hex = " ";
         * while (dec != 0) {
         * int a1 = dec % 16;
         * if (a1 == 10) {
         * hex = 'a' + hex;
         * } else if (a1 == 11) {
         * hex = 'b' + hex;
         * } else if (a1 == 12) {
         * hex = 'c' + hex;
         * } else if (a1 == 13) {
         * hex = 'd' + hex;
         * } else if (a1 == 14) {
         * hex = 'e' + hex;
         * } else if (a1 == 15) {
         * hex = 'f' + hex;
         * } else {
         * hex = a1 + hex;
         * }
         * dec = dec / 16;
         * }
         * System.out.println(hex);
         */

        // binary number to a Octal number.
        // binary to decimal
        /*
         * int n = 111;
         * int k = 0;
         * int dec = 0;
         * while (n != 0) {
         * int d = n % 10;
         * dec = dec + d * pow(2, k++);
         * n = n / 10;
         * }
         * 
         * // decimal to octal
         * String oct = " ";
         * while (dec != 0) {
         * int a1 = dec % 8;
         * oct = a1 + oct;
         * dec = dec / 8;
         * }
         * System.out.println(oct);
         */

        // convert a octal number to a decimal number.
        /*
         * int n = 10;
         * int k = 0;
         * int dec = 0;
         * while (n != 0) {
         * int d = n % 10;
         * dec = dec + d * pow(8, k++);
         * n = n / 10;
         * }
         * 
         * System.out.println(dec);
         */

        // convert a octal number to a binary number.
        // octal number to a decimal number.
        /*
         * int n = 7;
         * int k = 0;
         * int dec = 0;
         * while (n != 0) {
         * int d = n % 10;
         * dec = dec + d * pow(8, k++);
         * n = n / 10;
         * }
         * 
         * // decimal number to binary number.
         * 
         * String bin = " ";
         * while (dec != 0) {
         * int a1 = dec % 2;
         * bin = a1 + bin;
         * dec = dec / 2;
         * }// decimal number to binary number.
         * 
         * String bin = " ";
         * while (dec != 0) {
         * int a1 = dec % 2;
         * bin = a1 + bin;
         * dec = dec / 2;
         * }
         * System.out.println(bin); number.
         * /*
         * int n = 100;
         * int k = 0;
         * int dec = 0;
         * while (n != 0) {
         * int d = n % 10;
         * dec = dec + d * pow(8, k++);
         * n = n / 10;
         * }
         * // decimal to hexadecimal
         * String hex = " ";
         * while (dec != 0) {
         * int a1 = dec % 16;
         * if (a1 == 10) {
         * hex = 'a' + hex;
         * } else if (a1 == 11) {
         * hex = 'b' + hex;
         * } else if (a1 == 12) {
         * hex = 'c' + hex;
         * } else if (a1 == 13) {
         * hex = 'd' + hex;
         * } else if (a1 == 14) {
         * hex = 'e' + hex;
         * } else if (a1 == 15) {
         * hex = 'f' + hex;
         * } else {
         * hex = a1 + hex;
         * }
         * dec = dec / 16;
         * }
         * System.out.println(hex);
         */

        // convert a hexadecimal to a decimal number.
        /*
         * int n = 25;
         * int k = 0;
         * int dec = 0;
         * while (n != 0) {
         * int d = n % 10;
         * dec = dec + d * pow(16, k++);
         * n = n / 10;
         * }
         * 
         * System.out.println(dec);
         */

        // convert a hexadecimal to a binary number.
        /*
         * //hexadecimal to a decimal number.
         * 
         * int n = 37;
         * int k = 0;
         * int dec = 0;
         * while (n != 0) {
         * int d = n % 10;
         * dec = dec + d * pow(16, k++);
         * n = n / 10;
         * }
         * 
         * // decimal number to binary number.
         * 
         * String bin = " ";
         * while (dec != 0) {
         * int a1 = dec % 2;
         * bin = a1 + bin;
         * dec = dec / 2;
         * }
         * System.out.println(bin);
         */

        // convert a hexadecimal to a octal number.
        // hexadecimal to a decimal number.
        /*
         * int n = 40;
         * int k = 0;
         * int dec = 0;
         * while (n != 0) {
         * int d = n % 10;
         * dec = dec + d * pow(16, k++);
         * n = n / 10;
         * }
         * 
         * // decimal to octal
         * String oct = " ";
         * while (dec != 0) {
         * int a1 = dec % 8;
         * oct = a1 + oct;
         * dec = dec / 8;
         * }
         * System.out.println(oct);
         */

        // Comparision operators
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("First Number : ");
         * int a = sc.nextInt();
         * System.out.println("Second Number : ");
         * int b = sc.nextInt();
         * if (a == b) {
         * System.out.println("a is equals to b");
         * }
         * if (a != b) {
         * System.out.println("a is not equals to b");
         * }
         * if (a < b) {
         * System.out.println("a is less than b");
         * }
         * if (a > b) {
         * System.out.println("a is greater than b");
         * }
         * if (a >= b) {
         * System.out.println("a is grater than or equals to b");
         * }
         * if (a <= b) {
         * System.out.println("a is less than or equals to b");
         * }
         */

        // compute the sum of the digits of an integer.
        /*
         * int n = 25;
         * int sum = 0;
         * while (n != 0) {
         * int a = n % 10;
         * sum = sum + a;
         * n = n / 10;
         * }
         * System.out.println(sum);
         */
    }

    public static int pow(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res = res * a;
        }

        return res;
    }
}
