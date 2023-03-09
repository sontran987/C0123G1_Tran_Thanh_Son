package ss4_lop_va_doi_tuong_trong_java.exercises;

import java.util.Scanner;

public class StopWatch {
long startTime=0;
long endTime=0;
boolean running=true;
    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    public void start(){
    this.startTime=System.currentTimeMillis();
    this.running=true;
    }
    public void stop(){
    this.endTime=System.currentTimeMillis();
    this.running=false;
    }
    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (endTime - startTime);
        }
        return elapsed;
    }
    public static void main(String[] args){
    StopWatch stopWatch=new StopWatch();
    System.out.println(stopWatch.getElapsedTime());
    }
}
