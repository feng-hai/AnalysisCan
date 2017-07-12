/**
 * 
 */
package com.gimis.emcs.ps.msg.gpsbody;

import java.util.Date;

import com.gimis.emcs.ps.msg.gpsbody.GpsBody;

/**
 * [一句话功能简述]<p>
 * GPS心跳实现接口
 * [功能详细描述]<p>
 * @author zjm
 * @version 1.0, 2012-2-28
 * @see
 * @since gms-v100
 */
public interface GpsBasicInfo extends GpsBody
{

    public Byte getUploadType();

    public void setUploadType(Byte uploadType);

    public Double getLongitude();

    public void setLongitude(Integer longitude);

    public Double getLatitude();

    public void setLatitude(Integer latitude);

    public Double getSpeed();

    public void setSpeed(Short speed);

    public Short getHeight();

    public void setHeight(Short height);

    public Short getForDirect();

    public void setForDirect(Short forDirect);

    public Date getGpsTime();

    public void setGpsTime(Date gpsTime);

    public Byte getSwitch1Key();

    public void setSwitch1Key(Byte switch1Key);

    public Byte getGpsStateLocate();

    public void setGpsStateLocate(Byte gpsStateLocate);

    public Byte getGpsStateSignal();

    public void setGpsStateSignal(Byte gpsStateSignal);

    public Byte getGpsStateModule();

    public void setGpsStateModule(Byte gpsStateModule);

    public Byte getPowerBatteryState();

    public void setPowerBatteryState(Byte powerBatteryState);
    
    public Integer getDistance();

    public void setDistance(Integer distance);

    public Short getHardwareVersion();

    public void setHardwareVersion(Short hardwareVersion);

    public String getSoftVersion();

    public void setSoftVersion(String softVersion);
}
