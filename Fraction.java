// Program 2 - Fraction Class
// Samuel Naranjo
// COSC 237.181
// Spring 2017
public class Fraction
{
    private int numer;
    private int denom;

    // alternate constructor
    public Fraction(int numer, int denom) throws InvalidDenominatorException
    {
        this.numer = numer;
        this.denom = denom;
    }
    public Fraction(Fraction otherFrac)
    {
        this.numer = otherFrac.numer;
        this.denom = otherFrac.denom;
    }

    // getters
    public int getNumer()
    {
        //Returns the numerator
        return numer;
    }

    public int getDenom()
    {
        //Returns the denominator
        return denom;
    }

    // standard methods
    public String toString()
    {
        //Converts to mixed fraction only for output
        if(numer > denom && denom > 1)
        {
            return (numer + "/" + denom + " or " + (numer/denom) + " " +
                    (numer % denom) + "/" + denom);
        }
        //Won't convert the fraction to a mixed number
        else
            return (numer + "/" + denom);
    }

    public boolean equals(Fraction rFrac)
    {
        //Create temp fraction objects
        //getNumer() + getDenom() calls for the first fraction, rFrac is the second.
        Fraction tempFrac1 = new Fraction(getNumer(),getDenom());
        Fraction tempFrac2 = new Fraction(rFrac.numer, rFrac.denom);
        //Reduce the objects
        tempFrac1 = tempFrac1.reduce(getNumer(),getDenom());
        tempFrac2 = tempFrac2.reduce(rFrac.numer,rFrac.denom);
        //Returns true if both the denominator and numerator are equal
        return tempFrac1.numer == tempFrac2.numer && tempFrac1.denom == tempFrac2.denom;
    }
    //Returns the greater common denominator used for the reduce method, not called upon the test driver
    public static int gcd(int x, int y)
    {
        // Temp value holder to swap values
        int temp, n;
        //
        if(x < y)
        {
            temp = x;
            x = y;
            y = temp;
        }
        //n holds the remainder
        n = x%y;
        // while the mod result does not yield 0
        while(n != 0)
        {
            x = y;
            y = n;
            n = x%y;
        }
        return y;

    }
    //Returns the addition of the first fraction object and the second fraction object and returns its simplest form.
    public Fraction add(Fraction rFrac) throws InvalidDenominatorException
    {
        // Cross Multiplication then add
        int valOne = (this.numer * rFrac.denom) + (this.denom*rFrac.numer);

        //Making the denominators equivalent
        int valTwo = this.denom * rFrac.denom;

        //Returns the reduced fraction
        return reduce(valOne,valTwo);
    }
    //Returns the subtraction of the first fraction object and the second fraction object and returns its simplest form
    public Fraction sub(Fraction rFrac)
    {
        // Cross multiplication then subtract
        int valOne = (this.numer * rFrac.denom) - (rFrac.numer * this.denom);

        //Making the denominators equivalent
        int valTwo = this.denom * rFrac.denom;

        //Returns the reduced fraction
        return reduce(valOne,valTwo);
    }
    //Returns the multiplication of the first fraction object and the second fraction object to its simplest form
    public Fraction mult(Fraction rFrac)
    {
        //Linear Multiplication
        int valOne = this.numer*rFrac.numer;
        int valTwo = this.denom*rFrac.denom;

        //Returns the reduced fraction
        return reduce(valOne,valTwo);
    }
    //Returns the division of the first fraction object and the second fraction object to its simplest form
    public Fraction div(Fraction rFrac)
    {
        //Inverse multiplication of the second fraction
        int valOne = this.numer * rFrac.denom;
        int valTwo = this.denom * rFrac.numer;

        return reduce(valOne,valTwo);
    }
    //Returns TRUE if this is the fraction's simples form, FALSE if it is not
    public boolean isSimplestForm()
    {

        //Checks if the top is equal to 1
        if(this.numer == 1)
        {
            return true;
        }
        else
        return false;
    }
    //Returns the reduced fraction. EX: (2/4) Returns (1/2)
    public Fraction reduce(int x, int y)
    {
        //Stores the greater common denominator on gcdVal
        int gcdVal = gcd(x,y);
        //reduce the numerator
        x = x/gcdVal;
        //reduce the denominator
        y = y/gcdVal;
        // Produces a new reduced fraction
        return new Fraction(x,y);
    }
    //Returns TRUE if the fraction is a proper fraction or FALSE if it is not
    public boolean properFrac()
    {
        //Checks if the numerator is greater than the denominator
        if(this.numer < this.denom)
        {
            return true;
        }
        else
            return false;
    }
    //Returns the fraction's absolute value only when either the numerator or the denominator are negative
    public Fraction abs()
    {
        //Checks if numerator is less than 0
        if(getNumer() < 0)
        {
            numer = getNumer()*-1;
        }
        //Checks if denominator is less than 0
        else if(getDenom() < 0)
        {
            denom = getDenom()*-1;
        }
        //Checks for two negative numbers
        else if(getDenom()<0 && getNumer()<0)
        {
            numer = getNumer()*-1;
            denom = getDenom()*-1;
        }
        //Returns new fraction object with only positive values
        return new Fraction(numer,denom);
    }
    //Returns True if the first fraction object is LESS THAN the secondary object
    public boolean lessThan(Fraction rFrac)
    {
        //Creates two fraction objects
        Fraction Frac1 = new Fraction(getNumer()*rFrac.getDenom(),
                getDenom()*rFrac.getNumer());
        Fraction Frac2 = new Fraction(rFrac.getNumer()*getDenom(),
                rFrac.getDenom()*getDenom());

        return Frac1.getNumer() < Frac2.getNumer();
    }
    //Returns true if the first fraction object is GRATER THAN the second fraction object
    public boolean greaterThan(Fraction rFrac)
    {
        //IF rFrac is NOT lessThen the other fraction AND it doesn't equal the other fraction
        return !lessThan(rFrac) && !equals(rFrac);
    }
    //This method returns the decimal number for the fraction. EX: (1/2) returns 0.5
    public double convertToDecimal()
    {
        //Stores the value of the denominator and numerators as double and returns a double division
        double decimalNum = getNumer();
        double decimalDenom = getDenom();
        return decimalNum/decimalDenom;
    }
    //This method returns the inverted fraction. EX: (5/3) returns (3/5)
    public Fraction invert()
    {
        //Returns a new fraction object with inverted numbers
        return new Fraction(getDenom(),getNumer());
    }
}
