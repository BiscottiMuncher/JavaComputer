public class CPU {
    //Adding the variables to the CPU class that will control it
    private String cpuName;
    private double cpuTemp;
    private double cpuClock;
    private int cpuCoreCount;
    private int cpuThreadCount;
    private int cpuCache;
    private double cpuPowerConsumption;

    //Constructor for the CPU Class

    public CPU(String cpuName ,double cpuTemp, double cpuClock, int cpuCoreCount, int cpuThreadCount, int cpuCache, double cpuPowerConsumption){
        this.cpuName = cpuName;
        this.cpuTemp = cpuTemp;
        this.cpuClock = cpuClock;
        this.cpuCoreCount = cpuCoreCount;
        this.cpuThreadCount = cpuThreadCount;
        this.cpuCache = cpuCache;
        this.cpuPowerConsumption = cpuPowerConsumption;
    }

    //Accessor method for CPU
    public String getCpuName(){
        return cpuName;
    }
    public double getCpuTemp(){
        return cpuTemp;
    }
    public double getCpuClock(){
        return cpuClock;
    }
    public int getCpuCoreCount(){
        return cpuCoreCount;
    }
    public int getCpuThreadCount(){
        return cpuThreadCount;
    }
    public int getCpuCache(){
        return cpuCache;
    }
    public double getCpuPowerConsumption(){
        return cpuPowerConsumption;
    }

    //Mutator Methods for CPU
    public void setCpuName(String newCpuName){
        this.cpuName = newCpuName;
    }
    public void setCpuTemp(double newCpuTemp){
        this.cpuTemp = cpuTemp;
    }
    public void setCpuClock(double newCpuClock){
        this.cpuClock = newCpuClock;
    }
    public void setCpuCoreCount(int newCpuCoreCount){
        this.cpuCoreCount = newCpuCoreCount;
    }
    public void setCpuThreadCount(int newCpuThreadCount){
        this.cpuThreadCount = newCpuThreadCount;
    }
    public void setCpuCache(int newCpuCache){
        this.cpuCache = newCpuCache;
    }
    public void setCpuPowerConsumption(double newCpuPowerConsumption){
        this.cpuPowerConsumption = cpuPowerConsumption;
    }

    //CPU toString

    public String toString(){
       return "CPU "+ cpuName + "\n CpuClock: " + cpuClock+ " MHz \n CoreCount: " + cpuCoreCount + "\n ThreadCount: " +cpuThreadCount + "\n CpuCache: " + cpuCache + " KB's\n CpuTemp: " + cpuTemp + " Degrees Celsius\n CpuTDP: " + cpuPowerConsumption + " W";
    }

}
