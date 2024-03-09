public class FullQueueException extends Exception{
    public FullQueueException(){super();}

    public void setStackTrace(StackTraceElement[] stackTrace){
        StackTraceElement[] stackTrace1 = Throwable.getStackTrace();
    }

}