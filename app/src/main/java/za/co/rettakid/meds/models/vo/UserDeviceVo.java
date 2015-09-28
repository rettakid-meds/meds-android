package za.co.rettakid.meds.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import za.co.rettakid.meds.BR;

public class UserDeviceVo extends BaseObservable   {

    private Long userDevicesId;
    private UserVo user;
    private DevicesTypeVo devicesType;
    private String name;
    private String devicePushId;

    @Bindable
    public String getUserDevicesId()   {
        return String.valueOf(this.userDevicesId);
    }

    public void setUserDevicesId(String userDevicesId)   {
        this.userDevicesId = Long.parseLong(userDevicesId);
        notifyPropertyChanged(BR.userDevicesId);
    }
    @Bindable
    public UserVo getUser()   {
        return this.user;
    }

    public void setUser(UserVo user)   {
        this.user = user;
        notifyPropertyChanged(BR.user);
    }
    @Bindable
    public DevicesTypeVo getDevicesType()   {
        return this.devicesType;
    }

    public void setDevicesType(DevicesTypeVo devicesType)   {
        this.devicesType = devicesType;
        notifyPropertyChanged(BR.devicesType);
    }
    @Bindable
    public String getName()   {
        return String.valueOf(this.name);
    }

    public void setName(String name)   {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public String getDevicePushId()   {
        return String.valueOf(this.devicePushId);
    }

    public void setDevicePushId(String devicePushId)   {
        this.devicePushId = devicePushId;
        notifyPropertyChanged(BR.devicePushId);
    }

/* real getters and setters */

    public Long getRealUserDevicesId()   {
        return this.userDevicesId;
    }

    public void setRealUserDevicesId(Long userDevicesId)   {
        this.userDevicesId = userDevicesId;
    }
    public UserVo getRealUser()   {
        return this.user;
    }

    public void setRealUser(UserVo user)   {
        this.user = user;
    }
    public DevicesTypeVo getRealDevicesType()   {
        return this.devicesType;
    }

    public void setRealDevicesType(DevicesTypeVo devicesType)   {
        this.devicesType = devicesType;
    }
    public String getRealName()   {
        return this.name;
    }

    public void setRealName(String name)   {
        this.name = name;
    }
    public String getRealDevicePushId()   {
        return this.devicePushId;
    }

    public void setRealDevicePushId(String devicePushId)   {
        this.devicePushId = devicePushId;
    }

}