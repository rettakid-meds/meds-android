package za.co.rettakid.meds.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import za.co.rettakid.meds.BR;

public class UserVo extends BaseObservable   {

    private Long userId;
    private String email;
    private String password;
    private String name;
    private String surname;
    private String phone;
    private String gender;
    private Integer age;
    private Boolean userAllowPush;

    @Bindable
    public String getUserId()   {
        return String.valueOf(this.userId);
    }

    public void setUserId(String userId)   {
        this.userId = Long.parseLong(userId);
        notifyPropertyChanged(BR.userId);
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
    public String getPassword()   {
        return String.valueOf(this.password);
    }

    public void setPassword(String password)   {
        this.password = password;
        notifyPropertyChanged(BR.password);
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
    public String getSurname()   {
        return String.valueOf(this.surname);
    }

    public void setSurname(String surname)   {
        this.surname = surname;
        notifyPropertyChanged(BR.surname);
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
    public String getGender()   {
        return String.valueOf(this.gender);
    }

    public void setGender(String gender)   {
        this.gender = gender;
        notifyPropertyChanged(BR.gender);
    }
    @Bindable
    public String getAge()   {
        return String.valueOf(this.age);
    }

    public void setAge(String age)   {
        this.age = Integer.parseInt(age);
        notifyPropertyChanged(BR.age);
    }
    @Bindable
    public String getUserAllowPush()   {
        return String.valueOf(this.userAllowPush);
    }

    public void setUserAllowPush(String userAllowPush)   {
        this.userAllowPush = Boolean.parseBoolean(userAllowPush);
        notifyPropertyChanged(BR.userAllowPush);
    }

/* real getters and setters */

    public Long getRealUserId()   {
        return this.userId;
    }

    public void setRealUserId(Long userId)   {
        this.userId = userId;
    }
    public String getRealEmail()   {
        return this.email;
    }

    public void setRealEmail(String email)   {
        this.email = email;
    }
    public String getRealPassword()   {
        return this.password;
    }

    public void setRealPassword(String password)   {
        this.password = password;
    }
    public String getRealName()   {
        return this.name;
    }

    public void setRealName(String name)   {
        this.name = name;
    }
    public String getRealSurname()   {
        return this.surname;
    }

    public void setRealSurname(String surname)   {
        this.surname = surname;
    }
    public String getRealPhone()   {
        return this.phone;
    }

    public void setRealPhone(String phone)   {
        this.phone = phone;
    }
    public String getRealGender()   {
        return this.gender;
    }

    public void setRealGender(String gender)   {
        this.gender = gender;
    }
    public Integer getRealAge()   {
        return this.age;
    }

    public void setRealAge(Integer age)   {
        this.age = age;
    }
    public Boolean getRealUserAllowPush()   {
        return this.userAllowPush;
    }

    public void setRealUserAllowPush(Boolean userAllowPush)   {
        this.userAllowPush = userAllowPush;
    }

}