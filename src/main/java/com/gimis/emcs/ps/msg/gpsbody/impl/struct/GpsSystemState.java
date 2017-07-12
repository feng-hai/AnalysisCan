/**
 * 
 */
package com.gimis.emcs.ps.msg.gpsbody.impl.struct;

/**
 * [三系列GPS系统状态]<p>
 * [功能详细描述]<p>
 * @author zjm
 * @version 1.0, 2011-8-23
 * @see
 * @since gsm-v100
 */
public class GpsSystemState
{

    /*
     * 
     */
    private byte powerSourceChange;

    /*
     * 是否由电池供电
     */
    private byte poweredByInternalBattery;

    /*
     * 继电器1控制状态
     */
    private byte relay1Close;

    /*
     * 继电器2控制状态
     */
    private byte relay2Close;

    /*
     * 继电器3控制状态
     */
    private byte relay3Close;

    /*
     * 继电器1异常状态
     */
    private byte relay1Abnormal;

    /*
     * 继电器2异常状态
     */
    private byte relay2Abnormal;

    /*
     * 继电器3异常状态
     */
    private byte relay3Abnormal;

    public byte getPowerSourceChange()
    {
        return powerSourceChange;
    }

    public void setPowerSourceChange(byte powerSourceChange)
    {
        this.powerSourceChange = powerSourceChange;
    }

    public byte getPoweredByInternalBattery()
    {
        return poweredByInternalBattery;
    }

    public void setPoweredByInternalBattery(byte poweredByInternalBattery)
    {
        this.poweredByInternalBattery = poweredByInternalBattery;
    }

    public byte getRelay1Close()
    {
        return relay1Close;
    }

    public void setRelay1Close(byte relay1Close)
    {
        this.relay1Close = relay1Close;
    }

    public byte getRelay2Close()
    {
        return relay2Close;
    }

    public void setRelay2Close(byte relay2Close)
    {
        this.relay2Close = relay2Close;
    }

    public byte getRelay3Close()
    {
        return relay3Close;
    }

    public void setRelay3Close(byte relay3Close)
    {
        this.relay3Close = relay3Close;
    }

    public byte getRelay1Abnormal()
    {
        return relay1Abnormal;
    }

    public void setRelay1Abnormal(byte relay1Abnormal)
    {
        this.relay1Abnormal = relay1Abnormal;
    }

    public byte getRelay2Abnormal()
    {
        return relay2Abnormal;
    }

    public void setRelay2Abnormal(byte relay2Abnormal)
    {
        this.relay2Abnormal = relay2Abnormal;
    }

    public byte getRelay3Abnormal()
    {
        return relay3Abnormal;
    }

    public void setRelay3Abnormal(byte relay3Abnormal)
    {
        this.relay3Abnormal = relay3Abnormal;
    }

}
