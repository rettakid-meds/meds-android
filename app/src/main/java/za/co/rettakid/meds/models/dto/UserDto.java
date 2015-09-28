package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "userdto")
public class UserDto implements Serializable    {


    @Element(name = "userid" , required = false)
    private Long userId;

    @Element(name = "email")
    private String email;

    @Element(name = "password")
    private String password;

    @Element(name = "name" , required = false)
    private String name;

    @Element(name = "surname" , required = false)
    private String surname;

    @Element(name = "phone" , required = false)
    private String phone;

    @Element(name = "gender" , required = false)
    private String gender;

    @Element(name = "age" , required = false)
    private Integer age;

    @Element(name = "userallowpush")
    private Boolean userAllowPush;


    public Long getUserId()   {
        return this.userId;
    }

    public void setUserId(Long userId)   {
        this.userId = userId;
    }

    public String getEmail()   {
        return this.email;
    }

    public void setEmail(String email)   {
        this.email = email;
    }

    public String getPassword()   {
        return this.password;
    }

    public void setPassword(String password)   {
        this.password = password;
    }

    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

    public String getSurname()   {
        return this.surname;
    }

    public void setSurname(String surname)   {
        this.surname = surname;
    }

    public String getPhone()   {
        return this.phone;
    }

    public void setPhone(String phone)   {
        this.phone = phone;
    }

    public String getGender()   {
        return this.gender;
    }

    public void setGender(String gender)   {
        this.gender = gender;
    }

    public Integer getAge()   {
        return this.age;
    }

    public void setAge(Integer age)   {
        this.age = age;
    }

    public Boolean getUserAllowPush()   {
        return this.userAllowPush;
    }

    public void setUserAllowPush(Boolean userAllowPush)   {
        this.userAllowPush = userAllowPush;
    }

}