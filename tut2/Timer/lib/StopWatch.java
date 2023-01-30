package Timer.lib;

public class StopWatch {
    
    /*Note: Enum::TimeType can either be defined here or in its own file*/ 
    public enum TimeType {
        nanoSeconds, milliSeconds, seconds
    }
    long start;
    long end;
    TimeType timeType;

    //Constructor
    public StopWatch(TimeType t) {
        start= 0;
        end=  0;
        timeType = t ;
    }

    public void start() {
        if (timeType==TimeType.nanoSeconds)
            start = System.nanoTime();
        else
            start = System.currentTimeMillis();
    }

    public void stop() {
        if (timeType==TimeType.nanoSeconds)
            end = System.nanoTime();
        else
            end = System.currentTimeMillis();
    }

    public long getTime() {
        if (timeType==TimeType.seconds)
            return ((end-start)/1000);
        else
            return end-start;
    }

}

