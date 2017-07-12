
package com.gimis.emcs.ps.msg.gpsbody.impl.struct;

public class GprsState
{
    private byte gsmStateCpin;

    private byte gsmStateGprs;

    private byte gsmStateCgatt;

    private byte gsmStateSignal;

    public byte getGsmStateCpin()
    {
        return gsmStateCpin;
    }

    public void setGsmStateCpin(byte gsmStateCpin)
    {
        this.gsmStateCpin = gsmStateCpin;
    }

    public byte getGsmStateGprs()
    {
        return gsmStateGprs;
    }

    public void setGsmStateGprs(byte gsmStateGprs)
    {
        this.gsmStateGprs = gsmStateGprs;
    }

    public byte getGsmStateCgatt()
    {
        return gsmStateCgatt;
    }

    public void setGsmStateCgatt(byte gsmStateCgatt)
    {
        this.gsmStateCgatt = gsmStateCgatt;
    }

    public byte getGsmStateSignal()
    {
        return gsmStateSignal;
    }

    public void setGsmStateSignal(byte gsmStateSignal)
    {
        this.gsmStateSignal = gsmStateSignal;
    }

}
