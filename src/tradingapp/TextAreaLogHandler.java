/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradingapp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import javax.swing.JTextArea;

/**
 *
 * @author Muhe
 */
public class TextAreaLogHandler extends Handler {

    private final JTextArea m_textArea;

    TextAreaLogHandler(JTextArea textArea)
    {
        m_textArea = textArea;
    }
    
    @Override
    public void publish(LogRecord record) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        m_textArea.append( sdf.format(cal.getTime()) );
        m_textArea.append(": ");
        m_textArea.append(record.getMessage());
        m_textArea.append("\r\n");
    }

    @Override
    public void flush() {
    }

    @Override
    public void close() throws SecurityException {
    }
    
}
