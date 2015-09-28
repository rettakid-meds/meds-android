package za.co.rettakid.meds.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import za.co.rettakid.meds.BR;

public class DoctorVo extends BaseObservable   {

    private Long doctorId;
    private PracticeVo practice;
    private UserVo user;

    @Bindable
    public String getDoctorId()   {
        return String.valueOf(this.doctorId);
    }

    public void setDoctorId(String doctorId)   {
        this.doctorId = Long.parseLong(doctorId);
        notifyPropertyChanged(BR.doctorId);
    }
    @Bindable
    public PracticeVo getPractice()   {
        return this.practice;
    }

    public void setPractice(PracticeVo practice)   {
        this.practice = practice;
        notifyPropertyChanged(BR.practice);
    }
    @Bindable
    public UserVo getUser()   {
        return this.user;
    }

    public void setUser(UserVo user)   {
        this.user = user;
        notifyPropertyChanged(BR.user);
    }

/* real getters and setters */

    public Long getRealDoctorId()   {
        return this.doctorId;
    }

    public void setRealDoctorId(Long doctorId)   {
        this.doctorId = doctorId;
    }
    public PracticeVo getRealPractice()   {
        return this.practice;
    }

    public void setRealPractice(PracticeVo practice)   {
        this.practice = practice;
    }
    public UserVo getRealUser()   {
        return this.user;
    }

    public void setRealUser(UserVo user)   {
        this.user = user;
    }

}