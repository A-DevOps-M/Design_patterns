package patterns.adapter;

public class CustomLogger {

    public LogWriter logWriter;

    public CustomLogger(LogWriter logWriter){
        this.logWriter = logWriter;
    }

    public void write(String text){
        logWriter.out(text);
    }
}
