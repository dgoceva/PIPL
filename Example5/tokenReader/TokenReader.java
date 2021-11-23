// Simple text input class for Cornell CS
// H. Perkins  7/97, 8/97, 1/98, 6/98
// File input constructor added by M Godfrey, 1/98

// Inspired by an idea in J. Bishop "Java Gently", A-W, 1997.

package tokenReader;

import java.io.*;
import java.util.*;

public class TokenReader {

//	Simple text input from keyboard and files.  Input is parsed into tokens separated
//  by whitespace.  Tokens are returned as either int, double, or String values depending
//  on the input method.  If an int or double is requested and the next token is not a
//  properly formatted integer or floating-point number, an error message is written to
//  the console (actually System.err) and the method will repeatedly read tokens until
//  one with the proper format is read.
//
//  Here is an example of the use of this class by a client:
//
//		TokenReader in = new TokenReader(System.in);
//
//		int    k = in.readInt();
//		double d = in.readDouble();
//		String s = in.readString();
//      String t = in.readLine();
//
//  The identifiers s, d, k, and in are arbitrary.  Also, note that function readLine()
//  discards any unused input on the current line and returns the next input line
//  as a single string.
//
//  TokenReader input does not throw any IOExceptions.  To detect the end of the stream,
//  function eof is provided.  The expression
//
//		in.eof()
//
//  evaluates to true if the end of stream in has been encountered, false otherwise.
//  Example:
//
//		k = in.readInt();
//		while (!in.eof()) {
//			<process k>
//			k = in.readInt();
//		}
//
//  If an attempt is made to read past the end of the stream, an error message is
//  written to System.err and the input function evaluates to an unspecified result.
//
//  Finally, the operation
//
//		in.waitUntilEnter();
//
//  prints a message on the screen and then reads and discards a line of input.  It can
//  be used to pause execution to, for example, ensure that the console window remains
//  visible until the user chooses to terminate the program (a problem with the Windows
//  console window).
//
//  Class TokenReader can be used to read any InputStream, not just System.in.  Use the
//  desired stream as the parameter in the "new TokenReader(...)" allocation.
//
//  Technical note:  TokenReader is not derived from InputStream or any other stream class
//  because it does not provide the normal interface of a java.io input stream.


// Local state

private DataInputStream theStream;			// the stream being read
private boolean			eofReached = false;	// = "end of theStream has been encountered"
private String			S;					// current input line
private StringTokenizer	T;					// parser for current input line
											//	T==null means no more available tokens
											//	on this line (including when eofReached).


// Constructors:  a TokenReader object for input stream s or ds. (The second constructor
// is provided to reduce overhead if the desired stream is already a DataInputStream.)

public TokenReader(InputStream s)
{
	theStream = new DataInputStream(s);
}

public TokenReader(DataInputStream ds)
{
	theStream = ds;
}


// Constructor:  a TokenReader object connected to file fileName.

public TokenReader(String fileName) {
	try {
	    FileInputStream fis = new FileInputStream (fileName);
	    theStream = new DataInputStream(fis);
	} catch (FileNotFoundException e) {
	    System.err.println ("Sorry, couldn't find file " + fileName
		    + " for some reason.");
	}
}



// Yield next integer from stream.
// If the next token is not an integer, print an error message on System.err and
// continue reading input until an integer is read.
// If the end of the file is encountered before finding an integer, the smallest
// integer Integer.MIN_VALUE is returned.
public int readInt ()
{
	String item = ""; 	// next token as a string

	if (T == null)
		refresh();

	while (true) {
		if (eofReached)
			return Integer.MIN_VALUE;

		try {
			item = T.nextToken();
			return Integer.parseInt(item.trim());
		}
		catch (NoSuchElementException e) {
			refresh();
		}
		catch (NumberFormatException e) {
			System.err.println("Integer expected but input was \"" + item + "\".  Please try again.");
		}
	}
}


// Yield next double from stream.
// If the next token is not a double, print an error message on System.err and
// continue reading input until a floating-point number is read.
// If the end of the file is encountered before finding an double, a NaN is returned.
public double readDouble ()
{
	String item = "";	// next token as a string

	if (T == null)
		refresh();

	while (true) {
		if (eofReached)
			return Double.NaN;

		try {
			item = T.nextToken();
			return Double.valueOf(item.trim()).doubleValue();
		}
		catch (NoSuchElementException e) {
			refresh();
		}
		catch (NumberFormatException e) {
			System.err.println("Double expected but input was \"" + item + "\".  Please try again.");
		}
	}
}


// Yield next string from stream or an appropriate error message if
// attempting to read past eof.
public String readString ()
{
	if (T == null)
		refresh();

	while (true) {
		if (eofReached)
			return "readString called after reaching end of TokenReader stream.";

		try {
			return T.nextToken();
		}
		catch (NoSuchElementException e) {
			refresh();
		}
	}
}


// Yield the next input line from stream as a single string or an
//    appropriate error message if attempting to read past eof.
// Unused input remaining in the current line is discarded.
public String readLine ()
{
	refresh();
	if (eofReached)
		return "readLine called after reaching end of TokenReader stream.";

	// return new line and mark current line as fully read
		String line = S;
		T = null;
		return line;
}


// Yield "end of stream has been reached" (i.e. no more data)
public boolean eof()
{
	return eofReached;
}


// Write prompt to output, then wait until user enters an input line
public void waitUntilEnter()
{
	System.out.println();
	System.out.println("Press Enter to continue.");
	try {
		theStream.read();
	} catch (java.io.IOException e) {}
}


// Read next input line into S and initialize tokenizer T to parse it.
// Print appropriate error messages to System.err if attempting to read
// past end of stream or some other I/O error occurs.
private void refresh ()
{
	// print error message and return if eof already encountered.
		if (eofReached) {
			System.err.println("Attempt to read past end of TokenReader stream.");
			return;
		}

	// read next line into S and T
		try {
			S = theStream.readLine();
		}
		catch (EOFException e) {
			eofReached = true;
			T = null;
			return;
		}
		catch (IOException e) {
			System.err.println("Unexpected error reading TokenReader input.\nIOException: " + e);
			return;
		}

		if (S == null) {
			eofReached = true;
			T = null;
		} else
			T = new StringTokenizer(S);
}

}  // end of class TokenReader