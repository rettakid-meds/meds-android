package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "practicedto")
public class PracticeDto implements Serializable    {


    @Element(name = "practiceid" , required = false)
    private Long practiceId;

    @Element(name = "name" , required = false)
    private String name;

    @Element(name = "email")
    private String email;

    @Element(name = "longitude")
    private Float longitude;

    @Element(name = "latitude")
    private Float latitude;

    @Element(name = "address")
    private String address;

    @Element(name = "phone" , required = false)
    private String phone;

    @Element(name = "fee" , required = false)
    private Float fee;


    public Long getPracticeId()   {
        return this.practiceId;
    }

    public void setPracticeId(Long practiceId)   {
        this.practiceId = practiceId;
    }

    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

    public String getEmail()   {
        return this.email;
    }

    public void setEmail(String email)   {
        this.email = email;
    }

    public Float getLongitude()   {
        return this.longitude;
    }

    public void setLongitude(Float longitude)   {
        this.longitude = longitude;
    }

    public Float getLatitude()   {
        return this.latitude;
    }

    public void setLatitude(Float latitude)   {
        this.latitude = latitude;
    }

    public String getAddress()   {
        return this.address;
    }

    public void setAddress(String address)   {
        this.address = address;
    }

    public String getPhone()   {
        return this.phone;
    }

    public void setPhone(String phone)   {
        this.phone = phone;
    }

    public Float getFee()   {
        return this.fee;
    }

    public void setFee(Float fee)   {
        this.fee = fee;
    }

}