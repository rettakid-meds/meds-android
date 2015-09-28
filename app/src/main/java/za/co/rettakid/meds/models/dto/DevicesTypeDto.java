package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "devicestypedto")
public class DevicesTypeDto implements Serializable    {


    @Element(name = "devicestypeid" , required = false)
    private Long devicesTypeId;

    @Element(name = "typename")
    private String typeName;

    @Element(name = "canpush")
    private Boolean canPush;


    public Long getDevicesTypeId()   {
        return this.devicesTypeId;
    }

    public void setDevicesTypeId(Long devicesTypeId)   {
        this.devicesTypeId = devicesTypeId;
    }

    public String getTypeName()   {
        return this.typeName;
    }

    public void setTypeName(String typeName)   {
        this.typeName = typeName;
    }

    public Boolean getCanPush()   {
        return this.canPush;
    }

    public void setCanPush(Boolean canPush)   {
        this.canPush = canPush;
    }

}