package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;

import java.util.Date;

@Root(name = "appointmentdto")
public class AppointmentDto implements Serializable    {


    @Element(name = "appointmentid" , required = false)
    private Long appointmentId;

    @Element(name = "practicedto")
    private PracticeDto practice;

    @Element(name = "userdto")
    private UserDto user;

    @Element(name = "notedto" , required = false)
    private DataContentDto note;

    @Element(name = "expectedfrm")
    private Date expectedFrm;

    @Element(name = "expectedto")
    private Date expectedTo;

    @Element(name = "actualfrm" , required = false)
    private Date actualFrm;

    @Element(name = "actualto" , required = false)
    private Date actualTo;


    public Long getAppointmentId()   {
        return this.appointmentId;
    }

    public void setAppointmentId(Long appointmentId)   {
        this.appointmentId = appointmentId;
    }

    public PracticeDto getPractice()   {
        return this.practice;
    }

    public void setPractice(PracticeDto practice)   {
        this.practice = practice;
    }

    public UserDto getUser()   {
        return this.user;
    }

    public void setUser(UserDto user)   {
        this.user = user;
    }

    public DataContentDto getNote()   {
        return this.note;
    }

    public void setNote(DataContentDto note)   {
        this.note = note;
    }

    public Date getExpectedFrm()   {
        return this.expectedFrm;
    }

    public void setExpectedFrm(Date expectedFrm)   {
        this.expectedFrm = expectedFrm;
    }

    public Date getExpectedTo()   {
        return this.expectedTo;
    }

    public void setExpectedTo(Date expectedTo)   {
        this.expectedTo = expectedTo;
    }

    public Date getActualFrm()   {
        return this.actualFrm;
    }

    public void setActualFrm(Date actualFrm)   {
        this.actualFrm = actualFrm;
    }

    public Date getActualTo()   {
        return this.actualTo;
    }

    public void setActualTo(Date actualTo)   {
        this.actualTo = actualTo;
    }

}