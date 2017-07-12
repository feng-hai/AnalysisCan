
package com.gimis.emcs.ps.msg.gpsbody.impl.struct;

public class SwitchState
{
    /*
     * 紧急报警
     */
    private byte switch1Alarm;

    /*
     * 钥匙开关
     */
    private byte switch1Key;

    /*
     * 保留开关
     */
    private byte switch1High;

    /*
     * 小时计开关
     */
    private byte switch1Engworking;

    /*
     * 外接电正极状态
     */
    private byte switch1Positive;

    /*
     * 外接电负极状态
     */
    private byte switch1Negative;

    /*
     * 搭铁极状态
     */
    private byte switch1Hulled;

    /*
     * GSM天线报警
     */
    private byte switch1GsmAntenna;

    /*
     * 有无转速信号 1有 0无
     */
    private byte rpmState;

    public byte getSwitch1Alarm()
    {
        return switch1Alarm;
    }

    public void setSwitch1Alarm(byte switch1Alarm)
    {
        this.switch1Alarm = switch1Alarm;
    }

    public byte getSwitch1Key()
    {
        return switch1Key;
    }

    public void setSwitch1Key(byte switch1Key)
    {
        this.switch1Key = switch1Key;
    }

    public byte getSwitch1High()
    {
        return switch1High;
    }

    public void setSwitch1High(byte switch1High)
    {
        this.switch1High = switch1High;
    }

    public byte getSwitch1Engworking()
    {
        return switch1Engworking;
    }

    public void setSwitch1Engworking(byte switch1Engworking)
    {
        this.switch1Engworking = switch1Engworking;
    }

    public byte getSwitch1Positive()
    {
        return switch1Positive;
    }

    public void setSwitch1Positive(byte switch1Positive)
    {
        this.switch1Positive = switch1Positive;
    }

    public byte getSwitch1Negative()
    {
        return switch1Negative;
    }

    public void setSwitch1Negative(byte switch1Negative)
    {
        this.switch1Negative = switch1Negative;
    }

    public byte getSwitch1Hulled()
    {
        return switch1Hulled;
    }

    public void setSwitch1Hulled(byte switch1Hulled)
    {
        this.switch1Hulled = switch1Hulled;
    }

    public byte getSwitch1GsmAntenna()
    {
        return switch1GsmAntenna;
    }

    public void setSwitch1GsmAntenna(byte switch1GsmAntenna)
    {
        this.switch1GsmAntenna = switch1GsmAntenna;
    }

    public byte getRpmState()
    {
        return rpmState;
    }

    public void setRpmState(byte rpmState)
    {
        this.rpmState = rpmState;
    }

}
