package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //One line comment

        /* Block comment
        Her i can
        write many
        lines of
        comments
         */
        
        /**
         * Integers (whole numbers)
         */
        byte byteInteger = 4;           //8 bit
        short shortInteger = 3423;      //16 bit
        int integer = 123;               //32 bit
        long longInteger = 240932409;   //64 bit

        /**
         * Decimal numbers
         */
        float floatDecimal = 10.6f;     //32 bit
        double doubleDecimal = 10.6;    //64 bit


        /**
         * char, can hold integer values
         */
        char letter = 'E';
        char letter2 = (char) integer; // {

        /**
         * boolean, very simple (for now :))
         */
        boolean bool = true;
    }

    public static double sum(double number1, double number2){
        return number1 + number2;
    }
}
