
package com.gimis.emcs.ps.msg.gpsbody.impl.struct;

public class GpsState
{
    /*
     * 天线未接 true-未接
     */
    private byte switch1Key;

    /*
     * 是否精确定位 1-精确定位
     */
    private byte gpsStateLocate;

    /*
     * 收到的星数
     */
    private byte gpsStateSignal;

    /*
     * 模块状态  1- 模块异常
     */
    private byte gpsStateModule;
    
    /*
     * 是否电池供电 0=外电工作，1=电池工作
     */
    private Byte powerBatteryState;

    public byte getSwitch1Key()
    {
        return switch1Key;
    }

    public void setSwitch1Key(byte switch1Key)
    {
        this.switch1Key = switch1Key;
    }

    public byte getGpsStateLocate()
    {
        return gpsStateLocate;
    }

    public void setGpsStateLocate(byte gpsStateLocate)
    {
        this.gpsStateLocate = gpsStateLocate;
    }

    public byte getGpsStateSignal()
    {
        return gpsStateSignal;
    }

    public void setGpsStateSignal(byte gpsStateSignal)
    {
        this.gpsStateSignal = gpsStateSignal;
    }

    public byte getGpsStateModule()
    {
        return gpsStateModule;
    }

    public void setGpsStateModule(byte gpsStateModule)
    {
        this.gpsStateModule = gpsStateModule;
    }

    public Byte getPowerBatteryState()
    {
        return powerBatteryState;
    }

    public void setPowerBatteryState(Byte powerBatteryState)
    {
        this.powerBatteryState = powerBatteryState;
    }
}
