import java.util.Scanner;
/*
 * Author: Leoro, Pamela Angel
 * Version@01/23/24
 * Introduction to Computing Final Project
 */


public class Converter {
    public static void main(String[] args) {
        System.out.println("WELCOME TO OUR CONVERTER!\n");

        Scanner scanner = new Scanner(System.in);
        x:
        do{
            System.out.println("Choose an action: ");
            System.out.println(" 1. Decimal to Binary \n 2. Decimal to Octal \n 3. Decimal to Hexadecimal" + //
                               "\n 4. Binary to Decimal \n 5. Octal to Decimal \n");
            System.out.print("Choice: ");
            int action = scanner.nextInt();

            if(action==1){
                Scanner inputDeci = new Scanner(System.in);
                System.out.print("Input a decimal number: ");
                int deciNum = inputDeci.nextInt();

                StringBuilder reversedDeci = new StringBuilder();

                while(deciNum > 0){
                    int rem = deciNum % 2;
                    reversedDeci.append(rem);
                    deciNum = deciNum / 2;
                }
                System.out.println("In binary it is: " + reversedDeci.reverse() + "\n");

            } else if (action==2){
                Scanner inputOct = new Scanner(System.in);
                System.out.print("Input a decimal number: ");
                int deciNum = inputOct.nextInt();

                StringBuilder reversedDeci = new StringBuilder();

                while(deciNum > 0){
                    int rem = deciNum % 8;
                    reversedDeci.append(rem);
                    deciNum = deciNum / 8;
                }
                System.out.println("In octal it is: " + reversedDeci.reverse() + "\n");

            } else if (action==3){
                Scanner inputDeci = new Scanner(System.in);
                System.out.print("Input a decimal number: ");
                int deciNum = inputDeci.nextInt();

                int[] remainders = new int[40];
                int index = 0;

                while (deciNum > 0) {
                    int rem = deciNum % 16;
                    remainders[index++] = rem;
                    deciNum /= 16;
                }
                System.out.print("In hexadecimal number it is: ");
                for (int i = index - 1; i >= 0; i--) {
                    int digit = remainders[i];
                    if (digit < 10) {
                        System.out.print(digit);
                    } else if (digit==10){
                        System.out.print("A");
                    } else if(digit==11){
                        System.out.print("B");
                    } else if (digit==12){
                        System.out.print("C");
                    } else if (digit==13){
                        System.out.print("D");
                    } else if (digit==14){
                        System.out.print("E");
                    }else if (digit==15){
                        System.out.print("F");
                    }
                }
                System.out.println();
                System.out.println();
                System.out.println();

            } else if (action==4){
                Scanner inputBin = new Scanner(System.in);
                System.out.print("Input a binary number: ");
                int binNum = inputBin.nextInt();

                int deciNum = 0;
                int base = 1;

                while (binNum > 0) {
                    int rem = binNum % 10;
                    binNum = binNum / 10;
                    deciNum += rem * base;
                    base *= 2;
                }
                System.out.println("In decimal number it is: " +deciNum + "\n");

            } else if (action==5){
                Scanner inputOct = new Scanner(System.in);
                System.out.print("Input an octal number: ");
                int octNum = inputOct.nextInt();

                int deciNum2 = 0;
                int base = 1;

                while (octNum > 0) {
                    int rem = octNum % 10;
                    octNum = octNum / 10;
                    deciNum2 += rem * base;
                    base *= 8;
                }
                System.out.println(deciNum2 + "\n");

            }else{
                System.out.println("Invalid Input." + "\n");
            }
            System.out.print("Do you want to continue (Type '1' if Yes or '2' if No)? : ");
            int option= scanner.nextInt();
            if (option==1){
                continue x;
            } else if(option==2){
                System.out.println("Thank you for using our converter!");
                break;
            } else{
                System.out.println("Invalid Input!");
                break;
            }

        } while (true);
             scanner.close();
    }
}
