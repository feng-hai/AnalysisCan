
package com.gimis.emcs.ps.msg.gpsbody.impl.struct;

public class AlarmState
{
    /*
     * 是否电池供电 0=外电工作，1=电池工作
     */
    private byte switch3PowerBattery;

    /*
     * Mcu是否线束断开 0=MCU断开，1=MCU正常连接
     */
    private byte mcuConnected;

    /*
     * 外部电源电压低(馈电状态) 0=外部电源正常，1=电压低
     */
    private byte switch3InputVlotage;

    /*
     * 内部电池充电状态
     */
    private byte switch3BatteryCharge;

    /*
     * 是否超速 0=不超速，1=超速
     */
    private byte switch3Speed;

    /*
     * 紧急报警 0=不报警，1=报警
     */
    private byte alarmOff;

    /*
     * 开盒报警 0=不报警，1=报警
     */
    private byte boxOff;

    /*
     * 越界报警 0=正常，1=报警
     */
    private byte switch3OverStep;

    /*
     * MCU通信异常 0=正常，1=报警  ,改为了天线线束剪断报警
     */
    private byte mcuLinkerror;

    /*
     * RS232通讯仪表提示状态
     */
    private byte switch3Rs232clusterSend;
    
    /*
     * 开关量采集3,报警状态
     * 仪表CAN心跳状态
     * 0=正常；1=异常
     */
    private Byte switch3CanPositionState;
    
    
    /*
     * 开关量采集3,报警状态
     * MCU-CAN心跳状态
     * 0=正常；1=异常
     */
    private Byte switch3McuCanState;

    
    public Byte getSwitch3CanPositionState()
    {
        return switch3CanPositionState;
    }

    public void setSwitch3CanPositionState(Byte switch3CanPositionState)
    {
        this.switch3CanPositionState = switch3CanPositionState;
    }

    public Byte getSwitch3McuCanState()
    {
        return switch3McuCanState;
    }

    public void setSwitch3McuCanState(Byte switch3McuCanState)
    {
        this.switch3McuCanState = switch3McuCanState;
    }

    public byte getSwitch3PowerBattery()
    {
        return switch3PowerBattery;
    }

    public void setSwitch3PowerBattery(byte switch3PowerBattery)
    {
        this.switch3PowerBattery = switch3PowerBattery;
    }

    public byte getMcuConnected()
    {
        return mcuConnected;
    }

    public void setMcuConnected(byte mcuConnected)
    {
        this.mcuConnected = mcuConnected;
    }

    public byte getSwitch3InputVlotage()
    {
        return switch3InputVlotage;
    }

    public void setSwitch3InputVlotage(byte switch3InputVlotage)
    {
        this.switch3InputVlotage = switch3InputVlotage;
    }

    public byte getSwitch3BatteryCharge()
    {
        return switch3BatteryCharge;
    }

    public void setSwitch3BatteryCharge(byte switch3BatteryCharge)
    {
        this.switch3BatteryCharge = switch3BatteryCharge;
    }

    public byte getSwitch3Speed()
    {
        return switch3Speed;
    }

    public void setSwitch3Speed(byte switch3Speed)
    {
        this.switch3Speed = switch3Speed;
    }

    public byte getAlarmOff()
    {
        return alarmOff;
    }

    public void setAlarmOff(byte alarmOff)
    {
        this.alarmOff = alarmOff;
    }

    public byte getBoxOff()
    {
        return boxOff;
    }

    public void setBoxOff(byte boxOff)
    {
        this.boxOff = boxOff;
    }

    public byte getSwitch3OverStep()
    {
        return switch3OverStep;
    }

    public void setSwitch3OverStep(byte switch3OverStep)
    {
        this.switch3OverStep = switch3OverStep;
    }

    public byte getMcuLinkerror()
    {
        return mcuLinkerror;
    }

    public void setMcuLinkerror(byte mcuLinkerror)
    {
        this.mcuLinkerror = mcuLinkerror;
    }

    public byte getSwitch3Rs232clusterSend()
    {
        return switch3Rs232clusterSend;
    }

    public void setSwitch3Rs232clusterSend(byte switch3Rs232clusterSend)
    {
        this.switch3Rs232clusterSend = switch3Rs232clusterSend;
    }

}
