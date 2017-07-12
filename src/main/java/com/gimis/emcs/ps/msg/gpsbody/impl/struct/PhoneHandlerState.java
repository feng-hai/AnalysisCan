/**
 * 
 */
package com.gimis.emcs.ps.msg.gpsbody.impl.struct;

/**
 * [一句话功能简述]<p>
 * 通话手柄设备状态数据查询
 * [功能详细描述]<p>
 * @author zjm
 * @version 1.0, 2012-6-21
 * @see
 * @since gms-v100
 */
public class PhoneHandlerState
{
    /**
     * 外电源状态
     */
    private Byte externalPowerState;
    
    /**
     * ACC状态
     */
    private Byte accState;
    
    /**
     * 电池充电状态
     */
    private Byte batteryChargeState;
    
    /**
     * RS232通讯状态
     */
    private Byte rs232State;
    
    /**
     * CAN通讯状态
     */
    private Byte canState;

    public Byte getExternalPowerState()
    {
        return externalPowerState;
    }

    public void setExternalPowerState(Byte externalPowerState)
    {
        this.externalPowerState = externalPowerState;
    }

    public Byte getAccState()
    {
        return accState;
    }

    public void setAccState(Byte accState)
    {
        this.accState = accState;
    }

    public Byte getBatteryChargeState()
    {
        return batteryChargeState;
    }

    public void setBatteryChargeState(Byte batteryChargeState)
    {
        this.batteryChargeState = batteryChargeState;
    }

    public Byte getRs232State()
    {
        return rs232State;
    }

    public void setRs232State(Byte rs232State)
    {
        this.rs232State = rs232State;
    }

    public Byte getCanState()
    {
        return canState;
    }

    public void setCanState(Byte canState)
    {
        this.canState = canState;
    }
    
    
}
