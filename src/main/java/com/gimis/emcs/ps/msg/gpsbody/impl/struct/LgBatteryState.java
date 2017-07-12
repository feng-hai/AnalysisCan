/**
 * 
 */
package com.gimis.emcs.ps.msg.gpsbody.impl.struct;

/**
 * [三系列BatteryState]<p>
 * [功能详细描述]<p>
 * @author zjm
 * @version 1.0, 2011-8-23
 * @see
 * @since gsm-v100
 */
public class LgBatteryState
{

    /*
     * 电池状态
     * 0电池自检1,电池待机,2电池充电,3电池放电,4电池异常,5电池耗光,6电池关机
     */
    private byte batteryStatus;

    /*
     * 电池错误码
     * 0电池正常,1电池低电压,2电池高电压,3无充电电流,4充电电流低,5充电电流高,6检测无电池,7待机漏电流
     */
    private byte batteryErrorCode;

    private byte lowVoltage;

    public byte getBatteryStatus()
    {
        return batteryStatus;
    }

    public void setBatteryStatus(byte batteryStatus)
    {
        this.batteryStatus = batteryStatus;
    }

    public byte getBatteryErrorCode()
    {
        return batteryErrorCode;
    }

    public void setBatteryErrorCode(byte batteryErrorCode)
    {
        this.batteryErrorCode = batteryErrorCode;
    }

    public byte getLowVoltage()
    {
        return lowVoltage;
    }

    public void setLowVoltage(byte lowVoltage)
    {
        this.lowVoltage = lowVoltage;
    }

    

}
