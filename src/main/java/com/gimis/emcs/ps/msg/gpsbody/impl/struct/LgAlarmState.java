/**
 * 
 */
package com.gimis.emcs.ps.msg.gpsbody.impl.struct;

/**
 * [三系列AlarmState]<p>
 * [功能详细描述]<p>
 * @author zjm
 * @version 1.0, 2011-8-23
 * @see
 * @since gsm-v100
 */
public class LgAlarmState
{

    /*
     * 报警开关报警
     */
    private byte switch1Alarm;

    /*
     * 开关一报警
     */
    private byte switch2Alarm;

    /*
     * 开关二报警
     */
    private byte switch3Alarm;

    /*
     * 工程机械拆除报警
     */
    private byte switch4Alarm;

    /*
     * 电源低压报警
     */
    private byte switch5Alarm;

    /*
     * 超速报警
     */
    private byte switch6Alarm;

    /*
     * 越界报警
     */
    private byte switch7Alarm;

    /*
     * 拖吊报警
     */
    private byte switch8Alarm;

    public byte getSwitch1Alarm()
    {
        return switch1Alarm;
    }

    public void setSwitch1Alarm(byte switch1Alarm)
    {
        this.switch1Alarm = switch1Alarm;
    }

    public byte getSwitch2Alarm()
    {
        return switch2Alarm;
    }

    public void setSwitch2Alarm(byte switch2Alarm)
    {
        this.switch2Alarm = switch2Alarm;
    }

    public byte getSwitch3Alarm()
    {
        return switch3Alarm;
    }

    public void setSwitch3Alarm(byte switch3Alarm)
    {
        this.switch3Alarm = switch3Alarm;
    }

    public byte getSwitch4Alarm()
    {
        return switch4Alarm;
    }

    public void setSwitch4Alarm(byte switch4Alarm)
    {
        this.switch4Alarm = switch4Alarm;
    }

    public byte getSwitch5Alarm()
    {
        return switch5Alarm;
    }

    public void setSwitch5Alarm(byte switch5Alarm)
    {
        this.switch5Alarm = switch5Alarm;
    }

    public byte getSwitch6Alarm()
    {
        return switch6Alarm;
    }

    public void setSwitch6Alarm(byte switch6Alarm)
    {
        this.switch6Alarm = switch6Alarm;
    }

    public byte getSwitch7Alarm()
    {
        return switch7Alarm;
    }

    public void setSwitch7Alarm(byte switch7Alarm)
    {
        this.switch7Alarm = switch7Alarm;
    }

    public byte getSwitch8Alarm()
    {
        return switch8Alarm;
    }

    public void setSwitch8Alarm(byte switch8Alarm)
    {
        this.switch8Alarm = switch8Alarm;
    }

}
