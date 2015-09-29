package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "doctordto")
public class DoctorDto implements Serializable    {


    @Element(name = "doctorid" , required = false)
    private Long doctorId;

    @Element(name = "userdto")
    private UserDto user;

    @Element(name = "imagedto")
    private ImageDto image;

    @Element(name = "biodto")
    private DataContentDto bio;


    public Long getDoctorId()   {
        return this.doctorId;
    }

    public void setDoctorId(Long doctorId)   {
        this.doctorId = doctorId;
    }

    public UserDto getUser()   {
        return this.user;
    }

    public void setUser(UserDto user)   {
        this.user = user;
    }

    public ImageDto getImage()   {
        return this.image;
    }

    public void setImage(ImageDto image)   {
        this.image = image;
    }

    public DataContentDto getBio()   {
        return this.bio;
    }

    public void setBio(DataContentDto bio)   {
        this.bio = bio;
    }

}