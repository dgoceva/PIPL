public class Root2 {
    public static void Root2Main() {
        int i = 2;
        double r = Math.sqrt(i);
        
        System.out.format("The square root of %d is %f.%n", i, r);
        
        System.out.format("%f, %1$+020.10f %n", Math.PI);

        System.out.format("%f, %<+020.10f %n", Math.PI);

    }
}
//#  The format specifiers for general, character, and numeric types have the following syntax:
//
//    %[argument_index$][flags][width][.precision]conversion
//  
//
//The optional argument_index is a decimal integer indicating the position of the argument in the 
//argument list. The first argument is referenced by "1$", the second by "2$", etc.
//
//The optional flags is a set of characters that modify the output format. The set of valid flags 
// depends on the conversion.
//
//The optional width is a non-negative decimal integer indicating the minimum number of characters 
// to be written to the output.
//
//The optional precision is a non-negative decimal integer usually used to restrict the number of characters. The specific behavior depends on the conversion.
//
//The required conversion is a character indicating how the argument should be formatted. The set of valid 
//conversions for a given argument depends on the argument's data type.
//
//# The format specifiers for types which are used to represents dates and times have the following syntax:
//
//    %[argument_index$][flags][width]conversion
//  
//
//The optional argument_index, flags and width are defined as above. 
//
//The format specifiers which do not correspond to arguments have the following syntax:
//
//    %[flags][width]conversion
//  
//
//The optional flags and width is defined as above.
//
//The required conversion is a character indicating content to be inserted in the output. 
//
//The three conversions used here are:
//
//    * d formats an integer value as a decimal value.
//    * f formats a floating point value as a decimal value.
//    * n outputs a platform-specific line terminator. 
//
//Here are some other conversions:
//
//    * x formats an integer as a hexadecimal value.
//    * s formats any value as a string.
//    * tB formats an integer as a locale-specific month name. 