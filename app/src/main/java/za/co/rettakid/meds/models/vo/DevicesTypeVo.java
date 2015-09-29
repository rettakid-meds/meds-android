package za.co.rettakid.meds.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import za.co.rettakid.meds.BR;

public class DevicesTypeVo extends BaseObservable   {

    private Long devicesTypeId;
    private String typeName;
    private Boolean canPush;

    @Bindable
    public String getDevicesTypeId()   {
        return String.valueOf(this.devicesTypeId);
    }

    public void setDevicesTypeId(String devicesTypeId)   {
        this.devicesTypeId = Long.parseLong(devicesTypeId);
        notifyPropertyChanged(BR.devicesTypeId);
    }
    @Bindable
    public String getTypeName()   {
        return String.valueOf(this.typeName);
    }

    public void setTypeName(String typeName)   {
        this.typeName = typeName;
        notifyPropertyChanged(BR.typeName);
    }
    @Bindable
    public String getCanPush()   {
        return String.valueOf(this.canPush);
    }

    public void setCanPush(String canPush)   {
        this.canPush = Boolean.parseBoolean(canPush);
        notifyPropertyChanged(BR.canPush);
    }

/* real getters and setters */

    public Long getRealDevicesTypeId()   {
        return this.devicesTypeId;
    }

    public void setRealDevicesTypeId(Long devicesTypeId)   {
        this.devicesTypeId = devicesTypeId;
    }
    public String getRealTypeName()   {
        return this.typeName;
    }

    public void setRealTypeName(String typeName)   {
        this.typeName = typeName;
    }
    public Boolean getRealCanPush()   {
        return this.canPush;
    }

    public void setRealCanPush(Boolean canPush)   {
        this.canPush = canPush;
    }

}