package tms.sensors;

import java.util.Arrays;

public class DemoPressurePad extends DemoSensor implements PressurePad
{
    public DemoPressurePad(int[] data, int threshold){
        super(data, threshold);
    }

    public int countTraffic(){
        return getCurrentValue();
    }

    public int getCongestion(){
        float congestionRate = ((float) countTraffic() / (float) getThreshold()) * 100;
        int cRate = Math.round(congestionRate);
        return cRate;
    }

    public String toString(){
        return "PP:" + threshold + ":" + Arrays.toString(data);
    }
}
