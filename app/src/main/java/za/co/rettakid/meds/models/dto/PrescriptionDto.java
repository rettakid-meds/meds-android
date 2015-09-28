package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;

import java.util.Date;

@Root(name = "prescriptiondto")
public class PrescriptionDto implements Serializable    {


    @Element(name = "prescriptionid" , required = false)
    private Long prescriptionId;

    @Element(name = "appointmentdto")
    private AppointmentDto appointment;

    @Element(name = "doctordto")
    private DoctorDto doctor;

    @Element(name = "userdto")
    private UserDto user;

    @Element(name = "efffrm")
    private Date effFrm;

    @Element(name = "effto")
    private Date effTo;


    public Long getPrescriptionId()   {
        return this.prescriptionId;
    }

    public void setPrescriptionId(Long prescriptionId)   {
        this.prescriptionId = prescriptionId;
    }

    public AppointmentDto getAppointment()   {
        return this.appointment;
    }

    public void setAppointment(AppointmentDto appointment)   {
        this.appointment = appointment;
    }

    public DoctorDto getDoctor()   {
        return this.doctor;
    }

    public void setDoctor(DoctorDto doctor)   {
        this.doctor = doctor;
    }

    public UserDto getUser()   {
        return this.user;
    }

    public void setUser(UserDto user)   {
        this.user = user;
    }

    public Date getEffFrm()   {
        return this.effFrm;
    }

    public void setEffFrm(Date effFrm)   {
        this.effFrm = effFrm;
    }

    public Date getEffTo()   {
        return this.effTo;
    }

    public void setEffTo(Date effTo)   {
        this.effTo = effTo;
    }

}