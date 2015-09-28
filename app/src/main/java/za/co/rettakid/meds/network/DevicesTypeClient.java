package za.co.rettakid.meds.network;

import za.co.rettakid.meds.models.dto.*;

public class DevicesTypeClient extends BaseClient   {

    public DevicesTypeClient() {
        super("/devicestypes");
    }

    public DevicesTypeListDto getDevicesTypes()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, DevicesTypeListDto.class);
    }

    public DevicesTypeDto getDevicesTypes(Long devicesTypeId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, DevicesTypeDto.class,devicesTypeId);
    }

    public DevicesTypeDto postDevicesType(DevicesTypeDto devicesTypeDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, devicesTypeDto, DevicesTypeDto.class);
    }

    public DevicesTypeListDto postDevicesType(DevicesTypeListDto devicesTypeListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, devicesTypeListDto, DevicesTypeListDto.class);
    }

    public void putDevicesType(DevicesTypeDto devicesTypeDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, devicesTypeDto, DevicesTypeDto.class,devicesTypeDto.getDevicesTypeId());
    }

    public void deleteDevicesType(Long devicesTypeId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,devicesTypeId);
    }


    public UserDeviceListDto getUserDevices(Long userDevicesId)  {
        String url = createUrl("/{id}/userdevices");
        return getRestTemplate().getForObject(url, UserDeviceListDto.class,userDevicesId);
    }

}