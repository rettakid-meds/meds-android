package za.co.rettakid.meds.network;

import za.co.rettakid.meds.models.dto.*;

public class UserDeviceClient extends BaseClient   {

    public UserDeviceClient() {
        super("/userdevices");
    }

    public UserDeviceListDto getUserDevices()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, UserDeviceListDto.class);
    }

    public UserDeviceDto getUserDevices(Long userDevicesId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, UserDeviceDto.class,userDevicesId);
    }

    public UserDeviceDto postUserDevice(UserDeviceDto userDeviceDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, userDeviceDto, UserDeviceDto.class);
    }

    public UserDeviceListDto postUserDevice(UserDeviceListDto userDeviceListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, userDeviceListDto, UserDeviceListDto.class);
    }

    public void putUserDevice(UserDeviceDto userDeviceDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, userDeviceDto, UserDeviceDto.class,userDeviceDto.getUserDevicesId());
    }

    public void deleteUserDevice(Long userDevicesId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,userDevicesId);
    }


}