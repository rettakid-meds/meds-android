package za.co.rettakid.meds.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import za.co.rettakid.meds.BR;

public class DoctorVo extends BaseObservable   {

    private Long doctorId;
    private UserVo user;
    private ImageVo image;
    private DataContentVo bio;

    @Bindable
    public String getDoctorId()   {
        return String.valueOf(this.doctorId);
    }

    public void setDoctorId(String doctorId)   {
        this.doctorId = Long.parseLong(doctorId);
        notifyPropertyChanged(BR.doctorId);
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
    public ImageVo getImage()   {
        return this.image;
    }

    public void setImage(ImageVo image)   {
        this.image = image;
        notifyPropertyChanged(BR.image);
    }
    @Bindable
    public DataContentVo getBio()   {
        return this.bio;
    }

    public void setBio(DataContentVo bio)   {
        this.bio = bio;
        notifyPropertyChanged(BR.bio);
    }

/* real getters and setters */

    public Long getRealDoctorId()   {
        return this.doctorId;
    }

    public void setRealDoctorId(Long doctorId)   {
        this.doctorId = doctorId;
    }
    public UserVo getRealUser()   {
        return this.user;
    }

    public void setRealUser(UserVo user)   {
        this.user = user;
    }
    public ImageVo getRealImage()   {
        return this.image;
    }

    public void setRealImage(ImageVo image)   {
        this.image = image;
    }
    public DataContentVo getRealBio()   {
        return this.bio;
    }

    public void setRealBio(DataContentVo bio)   {
        this.bio = bio;
    }

}