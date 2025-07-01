import java.util.Random;
import java.util.Scanner;

    public class DieRollar
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            Random random = new Random();
            String playAgain;

            do
            {
                int rollCount = 0;
                boolean tripleFound = false;
                System.out.println("Roll       Die1       Die2        Die3        Sum");
                System.out.println("---------------------------------------------------");

                while (!tripleFound)
                {
                    rollCount++;
                    int die1 = random.nextInt(6) + 1;
                    int die2 = random.nextInt(6) + 1;
                    int die3 = random.nextInt(6) + 1;
                    int sum = die1 + die2 + die3;

                    System.out.printf("%-8d\t%-8d\t%-8d\t%-8d\t%-8d\n", rollCount, die1, die2, die3, sum);

                    if (die1 == die2 && die2 == die3)
                    {
                        tripleFound = true;
                    }
                }

                System.out.print("Do you want to play again? (Y/N): ");

                playAgain = in.nextLine();

                if (playAgain.equalsIgnoreCase("Y"))
                {
                    System.out.println();
                }
            }
            while (playAgain.equalsIgnoreCase("Y"));

            in.close();
        }
    }
