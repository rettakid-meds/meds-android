package za.co.rettakid.meds.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import za.co.rettakid.meds.BR;

public class PrescriptionVo extends BaseObservable   {

    private Long prescriptionId;
    private AppointmentVo appointment;
    private DoctorVo doctor;
    private UserVo user;
    private Date effFrm;
    private Date effTo;

    @Bindable
    public String getPrescriptionId()   {
        return String.valueOf(this.prescriptionId);
    }

    public void setPrescriptionId(String prescriptionId)   {
        this.prescriptionId = Long.parseLong(prescriptionId);
        notifyPropertyChanged(BR.prescriptionId);
    }
    @Bindable
    public AppointmentVo getAppointment()   {
        return this.appointment;
    }

    public void setAppointment(AppointmentVo appointment)   {
        this.appointment = appointment;
        notifyPropertyChanged(BR.appointment);
    }
    @Bindable
    public DoctorVo getDoctor()   {
        return this.doctor;
    }

    public void setDoctor(DoctorVo doctor)   {
        this.doctor = doctor;
        notifyPropertyChanged(BR.doctor);
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
    public String getEffFrm()   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(this.effFrm);
    }

    public void setEffFrm(String effFrm)   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
            this.effFrm = simpleDateFormat.parse(effFrm);
        } catch (ParseException e) {
            Log.e("PrescriptionVo","Date Parse Error");
        }
        notifyPropertyChanged(BR.effFrm);
    }
    @Bindable
    public String getEffTo()   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(this.effTo);
    }

    public void setEffTo(String effTo)   {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
            this.effTo = simpleDateFormat.parse(effTo);
        } catch (ParseException e) {
            Log.e("PrescriptionVo","Date Parse Error");
        }
        notifyPropertyChanged(BR.effTo);
    }

/* real getters and setters */

    public Long getRealPrescriptionId()   {
        return this.prescriptionId;
    }

    public void setRealPrescriptionId(Long prescriptionId)   {
        this.prescriptionId = prescriptionId;
    }
    public AppointmentVo getRealAppointment()   {
        return this.appointment;
    }

    public void setRealAppointment(AppointmentVo appointment)   {
        this.appointment = appointment;
    }
    public DoctorVo getRealDoctor()   {
        return this.doctor;
    }

    public void setRealDoctor(DoctorVo doctor)   {
        this.doctor = doctor;
    }
    public UserVo getRealUser()   {
        return this.user;
    }

    public void setRealUser(UserVo user)   {
        this.user = user;
    }
    public Date getRealEffFrm()   {
        return this.effFrm;
    }

    public void setRealEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }
    public Date getRealEffTo()   {
        return this.effTo;
    }

    public void setRealEffTo(Date effTo)   {
        this.effTo = effTo;
    }

}