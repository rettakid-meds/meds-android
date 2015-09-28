package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "userdevicelistdto")
public class UserDeviceListDto   {

    @ElementList(name = "userdevices",type = UserDeviceDto.class)
    private List<UserDeviceDto> userDevices;

    public List<UserDeviceDto> getUserDeviceList()   {
        return this.userDevices;
    }

    public void setUserDeviceList(List<UserDeviceDto> userDevices)   {
        this.userDevices = userDevices;
    }
}