import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingMain {

	private final static Logger LOGGER = Logger.getLogger(LoggingMain.class.getName());
    static private FileHandler fileTxt;
    static private SimpleFormatter formatterTxt;

    static private FileHandler fileHTML;
    static private Formatter formatterHTML;

    static public void setup() throws IOException {

        // suppress the logging output to the console
//        Logger rootLogger = Logger.getLogger("");
//        Handler[] handlers = rootLogger.getHandlers();
//        if (handlers[0] instanceof ConsoleHandler) {
//            rootLogger.removeHandler(handlers[0]);
//        }

        LOGGER.setLevel(Level.INFO);
        fileTxt = new FileHandler("Logging.txt");
        fileHTML = new FileHandler("Logging.html");

        // create a TXT formatter
        formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);
        LOGGER.addHandler(fileTxt);

        // create an HTML formatter
        formatterHTML = new MyHtmlFormatter();
        fileHTML.setFormatter(formatterHTML);
        LOGGER.addHandler(fileHTML);
    }
	static public void doSomethingAndLog() {
        // set the LogLevel to Severe, only severe Messages will be written
        LOGGER.setLevel(Level.SEVERE);
        LOGGER.severe("Severe Log 1");
        LOGGER.warning("Warning Log 1");
        LOGGER.info("Info Log 1");
        LOGGER.finest("Really not important 1");

        // set the LogLevel to Info, severe, warning and info will be written
        // finest is still not written
        LOGGER.setLevel(Level.INFO);
        LOGGER.severe("Severe Log 2");
        LOGGER.warning("Warning Log 2");
        LOGGER.info("Info Log 2");
        LOGGER.finest("Really not important 2");

        // set the LogLevel to ALL, all logging will be written
        LOGGER.setLevel(Level.ALL);
        LOGGER.severe("Severe Log 3");
        LOGGER.warning("Warning Log 3");
        LOGGER.info("Info Log 3");
        LOGGER.config("Config Log 3");
        LOGGER.fine("Fine Log 3");
        LOGGER.finer("Finer Log 3");
        LOGGER.finest("Really not important 3");
        
        // set the LogLevel to OFF, no logging will be written
        LOGGER.setLevel(Level.OFF);
        LOGGER.severe("Severe Log 4");
        LOGGER.warning("Warning Log 4");
        LOGGER.info("Info Log 4");
        LOGGER.config("Config Log 4");
        LOGGER.fine("Fine Log 4");
        LOGGER.finer("Finer Log 4");
        LOGGER.finest("Really not important 4");
	}
	public LoggingMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			setup();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            throw new RuntimeException("Problems with creating the log files");
		}
		doSomethingAndLog();

	}

}
