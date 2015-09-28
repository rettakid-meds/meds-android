package za.co.rettakid.meds.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import za.co.rettakid.meds.BR;

public class PracticeVo extends BaseObservable   {

    private Long practiceId;
    private String name;
    private String email;
    private Float longitude;
    private Float latitude;
    private String address;
    private String phone;
    private Float fee;

    @Bindable
    public String getPracticeId()   {
        return String.valueOf(this.practiceId);
    }

    public void setPracticeId(String practiceId)   {
        this.practiceId = Long.parseLong(practiceId);
        notifyPropertyChanged(BR.practiceId);
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
    public String getEmail()   {
        return String.valueOf(this.email);
    }

    public void setEmail(String email)   {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }
    @Bindable
    public String getLongitude()   {
        return String.valueOf(this.longitude);
    }

    public void setLongitude(String longitude)   {
        this.longitude = Float.parseFloat(longitude);
        notifyPropertyChanged(BR.longitude);
    }
    @Bindable
    public String getLatitude()   {
        return String.valueOf(this.latitude);
    }

    public void setLatitude(String latitude)   {
        this.latitude = Float.parseFloat(latitude);
        notifyPropertyChanged(BR.latitude);
    }
    @Bindable
    public String getAddress()   {
        return String.valueOf(this.address);
    }

    public void setAddress(String address)   {
        this.address = address;
        notifyPropertyChanged(BR.address);
    }
    @Bindable
    public String getPhone()   {
        return String.valueOf(this.phone);
    }

    public void setPhone(String phone)   {
        this.phone = phone;
        notifyPropertyChanged(BR.phone);
    }
    @Bindable
    public String getFee()   {
        return String.valueOf(this.fee);
    }

    public void setFee(String fee)   {
        this.fee = Float.parseFloat(fee);
        notifyPropertyChanged(BR.fee);
    }

/* real getters and setters */

    public Long getRealPracticeId()   {
        return this.practiceId;
    }

    public void setRealPracticeId(Long practiceId)   {
        this.practiceId = practiceId;
    }
    public String getRealName()   {
        return this.name;
    }

    public void setRealName(String name)   {
        this.name = name;
    }
    public String getRealEmail()   {
        return this.email;
    }

    public void setRealEmail(String email)   {
        this.email = email;
    }
    public Float getRealLongitude()   {
        return this.longitude;
    }

    public void setRealLongitude(Float longitude)   {
        this.longitude = longitude;
    }
    public Float getRealLatitude()   {
        return this.latitude;
    }

    public void setRealLatitude(Float latitude)   {
        this.latitude = latitude;
    }
    public String getRealAddress()   {
        return this.address;
    }

    public void setRealAddress(String address)   {
        this.address = address;
    }
    public String getRealPhone()   {
        return this.phone;
    }

    public void setRealPhone(String phone)   {
        this.phone = phone;
    }
    public Float getRealFee()   {
        return this.fee;
    }

    public void setRealFee(Float fee)   {
        this.fee = fee;
    }

}