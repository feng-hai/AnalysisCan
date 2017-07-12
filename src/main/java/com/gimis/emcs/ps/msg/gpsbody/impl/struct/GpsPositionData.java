
package com.gimis.emcs.ps.msg.gpsbody.impl.struct;

import java.util.Date;

public class GpsPositionData
{
    /*
     * 经度
     */
    private int longitude;

    /*
     * 纬度
     */
    private int latitude;

    /*
     * 速度
     */
    private short speed;

    /*
     * 高度
     */
    private short height;

    /*
     * 方向角
     */
    private short forDirect;

    /**
     * 里程
     */
    private Integer distance;

    /**
     * 硬件版本号
     */
    private Short hardwareVersion;

    /**
     * 软件版本号
     */
    private String softVersion;

    /*
     * GPS模块时间
     */
    private Date gpsTime;

    public Date getGpsTime()
    {
        return gpsTime;
    }

    public void setGpsTime(Date gpsTime)
    {
        this.gpsTime = gpsTime;
    }

    public int getLongitude()
    {
        return longitude;
    }

    public void setLongitude(int longitude)
    {
        this.longitude = longitude;
    }

    public int getLatitude()
    {
        return latitude;
    }

    public void setLatitude(int latitude)
    {
        this.latitude = latitude;
    }

    public short getSpeed()
    {
        return speed;
    }

    public void setSpeed(short speed)
    {
        this.speed = speed;
    }

    public short getHeight()
    {
        return height;
    }

    public void setHeight(short height)
    {
        this.height = height;
    }

    public short getForDirect()
    {
        return forDirect;
    }

    public void setForDirect(short forDirect)
    {
        this.forDirect = forDirect;
    }

    public Integer getDistance()
    {
        return distance;
    }

    public void setDistance(Integer distance)
    {
        this.distance = distance;
    }

    public Short getHardwareVersion()
    {
        return hardwareVersion;
    }

    public void setHardwareVersion(Short hardwareVersion)
    {
        this.hardwareVersion = hardwareVersion;
    }

    public String getSoftVersion()
    {
        return softVersion;
    }

    public void setSoftVersion(String softVersion)
    {
        this.softVersion = softVersion;
    }

}
