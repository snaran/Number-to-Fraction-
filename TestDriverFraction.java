
import java.util.*;
public class TestDriverFraction
{
    public static void main(String[]args)
    {
        //Creates original fraction
        int numer, denom;
        Fraction frac1;
        Scanner input = new Scanner(System.in);
        Boolean valid_input = false;
        while (!valid_input)
            try
            {
                //Creates menu to select operation, user types in number and it tells the computer what method to pick
                System.out.print("Enter \n 1 To add fractions \n 2 To subtract \n 3 To divide \n 4 To multiply" +
                        " \n 5 To check if you have the fractions simplest form \n 6 To check if it is a proper fraction " +
                        "\n 7 To compare two fractions \n 8 To convert the fraction to decimal \n 9 To invert the fraction \n " +
                        "10 To return the Absolute Value \n 0 To quit the program \n Make a choice: ");
                int answer = input.nextInt();

                //1, adds frac1 and frac2 and returns the result
                if(answer == 1)
                {
                    //Creates the first numerator and denominator & Fraction object
                    System.out.print("Enter numerator: ");
                    numer = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    denom = input.nextInt();

                    frac1 = new Fraction(numer,denom);

                    //Creates secondary Fraction object
                    System.out.print("Enter numerator: ");
                    int numer2 = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    int denom2 = input.nextInt();

                    Fraction frac2 = new Fraction(numer2, denom2);

                    //Adds, then calls toString
                    System.out.print(frac1.add(frac2));
                }
                //if 2, subtracts the first fraction from the second fraction and returns the result
                else if(answer == 2)
                {
                    //Creates the first numerator and denominator & Fraction object
                    System.out.print("Enter numerator: ");
                    numer = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    denom = input.nextInt();


                    frac1 = new Fraction(numer,denom);

                   //Creates a secondary fraction object
                    System.out.print("Enter numerator: ");
                    int numer2 = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    int denom2 = input.nextInt();

                    Fraction frac2 = new Fraction(numer2, denom2);

                    //Subtracts, then calls toString
                    System.out.print(frac1.sub(frac2));
                }
                //3rd option for division
                else if(answer == 3)
                {
                    //Creates the first numerator and denominator & Fraction object
                    System.out.print("Enter numerator: ");
                    numer = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    denom = input.nextInt();

                    frac1 = new Fraction(numer,denom);

                    //Creates a secondary fraction object
                    System.out.print("Enter numerator: ");
                    int numer2 = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    int denom2 = input.nextInt();

                    Fraction frac2 = new Fraction(numer2, denom2);

                    //Divides frac1/frac2
                    System.out.print(frac1.div(frac2));
                }
                //Returns the resulting fraction from multiplying frac1 x frac2
                else if(answer == 4)
                {
                    //Creates the first numerator and denominator & Fraction object
                    System.out.print("Enter numerator: ");
                    numer = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    denom = input.nextInt();

                    frac1 = new Fraction(numer,denom);

                    //Creates a secondary fraction object
                    System.out.print("Enter numerator: ");
                    int numer2 = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    int denom2 = input.nextInt();

                    Fraction frac2 = new Fraction(numer2, denom2);

                    //Multiples the fractions frac1 * frac2
                    System.out.print(frac1.mult(frac2));
                }
                //if 5, Checks if this is the fractions most simplest form
                else if(answer == 5)
                {
                    //Creates the first numerator and denominator
                    System.out.print("Enter numerator: ");
                    numer = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    denom = input.nextInt();

                    frac1 = new Fraction(numer,denom);

                    //Output true if the this is the fraction's simplest form
                    System.out.print("Is this the fraction's simplest form: " + frac1.isSimplestForm());
                }
                //if 6, Returns TRUE is the fraction is a proper fraction or FALSE if it is not
                else if(answer == 6)
                {
                    //Creates the first numerator and denominator
                    System.out.print("Enter numerator: ");
                    numer = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    denom = input.nextInt();

                    //Fraction object
                    frac1 = new Fraction(numer,denom);

                    System.out.print("Is this a proper fraction: " + frac1.properFrac());
                }
                //if 7, frac1 compares itself to frac2 and then checks for equality, graterThan or lessThan, and returns all 3
                //as different booleans
                else if(answer == 7)
                {
                    //Creates the first numerator and denominator & first fraction object
                    System.out.print("Enter numerator: ");
                    numer = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    denom = input.nextInt();

                    frac1 = new Fraction(numer,denom);

                    //Creates secondary fraction object
                    System.out.print("Enter numerator: ");
                    int numer2 = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    int denom2 = input.nextInt();

                    Fraction frac2 = new Fraction(numer2, denom2);

                    //Compares both the fractions values against each other, determining which is the smaller, which is the bigger and check for equality
                    System.out.println("Are the two fraction equal: " + frac1.equals(frac2));
                    System.out.println("Is the First fraction greater than the second: " + frac1.greaterThan(frac2));
                    System.out.println("Is the Second fraction grater than the first: " + frac1.lessThan(frac2));
                }
                //if 8, converts the fraction to decimal form
                else if(answer == 8)
                {
                    //Creates the first numerator and denominator
                    System.out.print("Enter numerator: ");
                    numer = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    denom = input.nextInt();

                    //Fraction object
                    frac1 = new Fraction(numer,denom);
                    //Converts the fraction into decimal form
                    System.out.print("Original: " + frac1 + "Decimal: " + frac1.convertToDecimal());
                }
                //if 9, inverts the fraction
                else if(answer == 9)
                {
                    //Creates the first numerator and denominator
                    System.out.print("Enter numerator: ");
                    numer = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    denom = input.nextInt();

                    //Fraction object
                    frac1 = new Fraction(numer,denom);
                    //Returns the Original + the Inverted version of the fraction
                    System.out.print("Original: " + frac1 + "Inverted: " +frac1.invert());
                }
                //if 10, calls fo the absolute value of the fraction
                else if(answer == 10)
                {
                    //Creates the first numerator and denominator
                    System.out.print("Enter numerator: ");
                    numer = input.nextInt();
                    System.out.print("Enter Denominator: ");
                    denom = input.nextInt();

                    //Fraction object
                    frac1 = new Fraction(numer,denom);
                    //Returns the absolute value of the object if either the numerator or denominator are negative
                    System.out.print(frac1.abs());
                }
                //if 0, simply display goodbye.
                else if(answer == 0)
                {
                    System.out.print("Goodbye!");
                }
                //If the user inputs a different number, simply display "Wrong input" and quit.
                else
                {
                    System.out.print("Wrong Input. Quitting...");
                }
                valid_input = true;
            }
            catch (InvalidDenominatorException e)
            {
                System.out.println("Denominator of Zero found – Please reenter");
            }
            catch (InputMismatchException e)
            {
                System.out.println("Non-digit character found – Please reenter");
            }
    }
}
