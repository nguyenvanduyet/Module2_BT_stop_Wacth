import java.util.Date;

public class StopWacth {
    private Date startTime;
    private Date endTime;
    StopWacth(){
        this.startTime=new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return getEndTime();
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }
}


