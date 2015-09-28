package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "userdevicedto")
public class UserDeviceDto implements Serializable    {


    @Element(name = "userdevicesid" , required = false)
    private Long userDevicesId;

    @Element(name = "userdto")
    private UserDto user;

    @Element(name = "devicestypedto")
    private DevicesTypeDto devicesType;

    @Element(name = "name")
    private String name;

    @Element(name = "devicepushid")
    private String devicePushId;


    public Long getUserDevicesId()   {
        return this.userDevicesId;
    }

    public void setUserDevicesId(Long userDevicesId)   {
        this.userDevicesId = userDevicesId;
    }

    public UserDto getUser()   {
        return this.user;
    }

    public void setUser(UserDto user)   {
        this.user = user;
    }

    public DevicesTypeDto getDevicesType()   {
        return this.devicesType;
    }

    public void setDevicesType(DevicesTypeDto devicesType)   {
        this.devicesType = devicesType;
    }

    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

    public String getDevicePushId()   {
        return this.devicePushId;
    }

    public void setDevicePushId(String devicePushId)   {
        this.devicePushId = devicePushId;
    }

}