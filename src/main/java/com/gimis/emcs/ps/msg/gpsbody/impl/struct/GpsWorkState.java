/**
 * 
 */
package com.gimis.emcs.ps.msg.gpsbody.impl.struct;

/**
 * [5系列GPS工作状态]<p>
 * [功能详细描述]<p>
 * @author zjm
 * @version 1.0, 2011-12-2
 * @see
 * @since gms-v100
 */
public class GpsWorkState
{
    /**
     * 当前终端工作模式 0=正常、1=休眠、2=运输
     */
    private Byte workingMode;
    
    /**
     * LAC数据
     */
    private Byte lacData;
    
    /**
     * LBS数据
     */
    private Byte lbsData;
    
    /**
     * 盲区补偿
     * 0-代表正常，1-代表盲区补偿数据
     */
    private Byte msgType;
    
    /**
     * 继电器3控制状态
     */
    private Byte switch2Relay3State;
    
    /**
     * 继电器4控制状态
     */
    private Byte switch2Relay4State;

    public Byte getWorkingMode()
    {
        return workingMode;
    }

    public void setWorkingMode(Byte workingMode)
    {
        this.workingMode = workingMode;
    }

    public Byte getLacData()
    {
        return lacData;
    }

    public void setLacData(Byte lacData)
    {
        this.lacData = lacData;
    }

    public Byte getLbsData()
    {
        return lbsData;
    }

    public void setLbsData(Byte lbsData)
    {
        this.lbsData = lbsData;
    }

    public Byte getMsgType()
    {
        return msgType;
    }

    public void setMsgType(Byte msgType)
    {
        this.msgType = msgType;
    }

    public Byte getSwitch2Relay3State()
    {
        return switch2Relay3State;
    }

    public void setSwitch2Relay3State(Byte switch2Relay3State)
    {
        this.switch2Relay3State = switch2Relay3State;
    }

    public Byte getSwitch2Relay4State()
    {
        return switch2Relay4State;
    }

    public void setSwitch2Relay4State(Byte switch2Relay4State)
    {
        this.switch2Relay4State = switch2Relay4State;
    }
    
}
