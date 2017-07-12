/**
 * 
 */
package com.gimis.emcs.ps.msg.gpsbody.impl.struct;

/**
 * [三系列GPS开关量状态]<p>
 * [功能详细描述]<p>
 * @author zjm
 * @version 1.0, 2011-8-23
 * @see
 * @since gsm-v100
 */
public class LgSwitchState
{

    private byte switch1StateChange;

    /*
     * 报警开关 true-报警
     */
    private byte switch1High;

    private byte switch2StateChange;

    private byte switch2High;

    private byte switch3StateChange;

    private byte switch3High;

    private byte switch4StateChange;

    private byte switch4High;

    public byte getSwitch1StateChange()
    {
        return switch1StateChange;
    }

    public void setSwitch1StateChange(byte switch1StateChange)
    {
        this.switch1StateChange = switch1StateChange;
    }

    public byte getSwitch1High()
    {
        return switch1High;
    }

    public void setSwitch1High(byte switch1High)
    {
        this.switch1High = switch1High;
    }

    public byte getSwitch2StateChange()
    {
        return switch2StateChange;
    }

    public void setSwitch2StateChange(byte switch2StateChange)
    {
        this.switch2StateChange = switch2StateChange;
    }

    public byte getSwitch2High()
    {
        return switch2High;
    }

    public void setSwitch2High(byte switch2High)
    {
        this.switch2High = switch2High;
    }

    public byte getSwitch3StateChange()
    {
        return switch3StateChange;
    }

    public void setSwitch3StateChange(byte switch3StateChange)
    {
        this.switch3StateChange = switch3StateChange;
    }

    public byte getSwitch3High()
    {
        return switch3High;
    }

    public void setSwitch3High(byte switch3High)
    {
        this.switch3High = switch3High;
    }

    public byte getSwitch4StateChange()
    {
        return switch4StateChange;
    }

    public void setSwitch4StateChange(byte switch4StateChange)
    {
        this.switch4StateChange = switch4StateChange;
    }

    public byte getSwitch4High()
    {
        return switch4High;
    }

    public void setSwitch4High(byte switch4High)
    {
        this.switch4High = switch4High;
    }

}
