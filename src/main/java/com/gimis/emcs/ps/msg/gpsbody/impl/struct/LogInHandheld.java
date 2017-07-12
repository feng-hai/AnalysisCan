/**
 * 
 */
package com.gimis.emcs.ps.msg.gpsbody.impl.struct;

/**
 * [一句话功能简述]<p>
 * [功能详细描述]<p>
 * @author zjm
 * @version 1.0, 2011-8-26
 * @see
 * @since gsm-v100
 */
public class LogInHandheld
{

    private Byte allowIncomingCall;

    private Byte allowOutgoingCall;

    private Byte allowIncomingSms;

    private Byte allowOutgoingSms;

    private Byte allowIncomingGprsMsg;

    private Byte allowOutgoingGprsMsg;

    public Byte getAllowIncomingCall()
    {
        return allowIncomingCall;
    }

    public void setAllowIncomingCall(Byte allowIncomingCall)
    {
        this.allowIncomingCall = allowIncomingCall;
    }

    public Byte getAllowOutgoingCall()
    {
        return allowOutgoingCall;
    }

    public void setAllowOutgoingCall(Byte allowOutgoingCall)
    {
        this.allowOutgoingCall = allowOutgoingCall;
    }

    public Byte getAllowIncomingSms()
    {
        return allowIncomingSms;
    }

    public void setAllowIncomingSms(Byte allowIncomingSms)
    {
        this.allowIncomingSms = allowIncomingSms;
    }

    public Byte getAllowOutgoingSms()
    {
        return allowOutgoingSms;
    }

    public void setAllowOutgoingSms(Byte allowOutgoingSms)
    {
        this.allowOutgoingSms = allowOutgoingSms;
    }

    public Byte getAllowIncomingGprsMsg()
    {
        return allowIncomingGprsMsg;
    }

    public void setAllowIncomingGprsMsg(Byte allowIncomingGprsMsg)
    {
        this.allowIncomingGprsMsg = allowIncomingGprsMsg;
    }

    public Byte getAllowOutgoingGprsMsg()
    {
        return allowOutgoingGprsMsg;
    }

    public void setAllowOutgoingGprsMsg(Byte allowOutgoingGprsMsg)
    {
        this.allowOutgoingGprsMsg = allowOutgoingGprsMsg;
    }

}
