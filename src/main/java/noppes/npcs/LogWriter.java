// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.io.OutputStream;
import java.util.logging.StreamHandler;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.logging.LogRecord;
import java.util.logging.Formatter;
import java.io.FileOutputStream;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Handler;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

public class LogWriter
{
    private static final String name = "CustomNPCs";
    private static final Logger logger;
    private static final SimpleDateFormat dateformat;
    private static Handler handler;
    
    public static void info(final Object msg) {
        LogWriter.logger.log(Level.FINE, msg.toString());
        LogWriter.handler.flush();
    }
    
    public static void error(final Object msg) {
        LogWriter.logger.log(Level.SEVERE, msg.toString());
        LogWriter.handler.flush();
    }
    
    public static void error(final Object msg, final Exception e) {
        LogWriter.logger.log(Level.SEVERE, msg.toString());
        LogWriter.logger.log(Level.SEVERE, e.getMessage(), e);
        LogWriter.handler.flush();
    }
    
    public static void except(final Exception e) {
        LogWriter.logger.log(Level.SEVERE, e.getMessage(), e);
        LogWriter.handler.flush();
    }
    
    static {
        logger = Logger.getLogger("CustomNPCs");
        dateformat = new SimpleDateFormat("HH:mm:ss");
        try {
            final File dir = new File("logs");
            if (!dir.exists()) {
                dir.mkdir();
            }
            final File file = new File(dir, "CustomNPCs-latest.log");
            final File lock = new File(dir, "CustomNPCs-latest.log.lck");
            final File file2 = new File(dir, "CustomNPCs-1.log");
            final File file3 = new File(dir, "CustomNPCs-2.log");
            final File file4 = new File(dir, "CustomNPCs-3.log");
            if (lock.exists()) {
                lock.delete();
            }
            if (file4.exists()) {
                file4.delete();
            }
            if (file3.exists()) {
                file3.renameTo(file4);
            }
            if (file2.exists()) {
                file2.renameTo(file3);
            }
            if (file.exists()) {
                file.renameTo(file2);
            }
            (LogWriter.handler = new StreamHandler(new FileOutputStream(file), new Formatter() {
                @Override
                public String format(final LogRecord record) {
                    final StackTraceElement element = Thread.currentThread().getStackTrace()[8];
                    final String line = "[" + element.getClassName() + ":" + element.getLineNumber() + "] ";
                    final String time = "[" + LogWriter.dateformat.format(new Date(record.getMillis())) + "][" + record.getLevel() + "]" + line;
                    if (record.getThrown() != null) {
                        final StringWriter sw = new StringWriter();
                        final PrintWriter pw = new PrintWriter(sw);
                        record.getThrown().printStackTrace(pw);
                        return time + sw.toString();
                    }
                    return time + record.getMessage() + System.getProperty("line.separator");
                }
            })).setLevel(Level.ALL);
            LogWriter.logger.addHandler(LogWriter.handler);
            LogWriter.logger.setUseParentHandlers(false);
            final Handler consoleHandler = new ConsoleHandler();
            consoleHandler.setFormatter(LogWriter.handler.getFormatter());
            consoleHandler.setLevel(Level.ALL);
            LogWriter.logger.addHandler(consoleHandler);
            LogWriter.logger.setLevel(Level.ALL);
            info(new Date().toString());
        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
