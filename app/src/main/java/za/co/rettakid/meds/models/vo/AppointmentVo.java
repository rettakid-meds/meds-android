package za.co.rettakid.meds.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import za.co.rettakid.meds.BR;

public class AppointmentVo extends BaseObservable   {

    private Long appointmentId;
    private PracticeVo practice;
    private UserVo user;
    private DataContentVo note;
    private Date expectedFrm;
    private Date expectedTo;
    private Date actualFrm;
    private Date actualTo;

    @Bindable
    public String getAppointmentId()   {
        return String.valueOf(this.appointmentId);
    }

    public void setAppointmentId(String appointmentId)   {
        this.appointmentId = Long.parseLong(appointmentId);
        notifyPropertyChanged(BR.appointmentId);
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
    @Bindable
    public DataContentVo getNote()   {
        return this.note;
    }

    public void setNote(DataContentVo note)   {
        this.note = note;
        notifyPropertyChanged(BR.note);
    }
    @Bindable
    public String getExpectedFrm()   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(this.expectedFrm);
    }

    public void setExpectedFrm(String expectedFrm)   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
            this.expectedFrm = simpleDateFormat.parse(expectedFrm);
        } catch (ParseException e) {
            Log.e("AppointmentVo","Date Parse Error");
        }
        notifyPropertyChanged(BR.expectedFrm);
    }
    @Bindable
    public String getExpectedTo()   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(this.expectedTo);
    }

    public void setExpectedTo(String expectedTo)   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
            this.expectedTo = simpleDateFormat.parse(expectedTo);
        } catch (ParseException e) {
            Log.e("AppointmentVo","Date Parse Error");
        }
        notifyPropertyChanged(BR.expectedTo);
    }
    @Bindable
    public String getActualFrm()   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(this.actualFrm);
    }

    public void setActualFrm(String actualFrm)   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
            this.actualFrm = simpleDateFormat.parse(actualFrm);
        } catch (ParseException e) {
            Log.e("AppointmentVo","Date Parse Error");
        }
        notifyPropertyChanged(BR.actualFrm);
    }
    @Bindable
    public String getActualTo()   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(this.actualTo);
    }

    public void setActualTo(String actualTo)   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
            this.actualTo = simpleDateFormat.parse(actualTo);
        } catch (ParseException e) {
            Log.e("AppointmentVo","Date Parse Error");
        }
        notifyPropertyChanged(BR.actualTo);
    }

/* real getters and setters */

    public Long getRealAppointmentId()   {
        return this.appointmentId;
    }

    public void setRealAppointmentId(Long appointmentId)   {
        this.appointmentId = appointmentId;
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
    public DataContentVo getRealNote()   {
        return this.note;
    }

    public void setRealNote(DataContentVo note)   {
        this.note = note;
    }
    public Date getRealExpectedFrm()   {
        return this.expectedFrm;
    }

    public void setRealExpectedFrm(Date expectedFrm)   {
        this.expectedFrm = expectedFrm;
    }
    public Date getRealExpectedTo()   {
        return this.expectedTo;
    }

    public void setRealExpectedTo(Date expectedTo)   {
        this.expectedTo = expectedTo;
    }
    public Date getRealActualFrm()   {
        return this.actualFrm;
    }

    public void setRealActualFrm(Date actualFrm)   {
        this.actualFrm = actualFrm;
    }
    public Date getRealActualTo()   {
        return this.actualTo;
    }

    public void setRealActualTo(Date actualTo)   {
        this.actualTo = actualTo;
    }

}