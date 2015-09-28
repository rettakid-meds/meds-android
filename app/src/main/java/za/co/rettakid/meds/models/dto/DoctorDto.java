package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "doctordto")
public class DoctorDto implements Serializable    {


    @Element(name = "doctorid" , required = false)
    private Long doctorId;

    @Element(name = "practicedto")
    private PracticeDto practice;

    @Element(name = "userdto")
    private UserDto user;


    public Long getDoctorId()   {
        return this.doctorId;
    }

    public void setDoctorId(Long doctorId)   {
        this.doctorId = doctorId;
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

}