package za.co.rettakid.meds.utils.binding;

import za.co.rettakid.meds.models.vo.*;
import za.co.rettakid.meds.models.dto.*;

public class BindUserDevice {

    public static UserDeviceVo bindUserDevice(UserDeviceDto userDeviceDto) {
        UserDeviceVo userDeviceVo = null;
        if (userDeviceDto != null)    {
            userDeviceVo = new UserDeviceVo();
            userDeviceVo.setRealUserDevicesId(userDeviceDto.getUserDevicesId());
            userDeviceVo.setRealUser(BindUser.bindUser(userDeviceDto.getUser()));
            userDeviceVo.setRealType(BindDevicesType.bindDevicesType(userDeviceDto.getType()));
            userDeviceVo.setRealName(userDeviceDto.getName());
            userDeviceVo.setRealDevicePushId(userDeviceDto.getDevicePushId());
        }
        return userDeviceVo;
    }

    public static UserDeviceDto bindUserDevice(UserDeviceVo userDeviceVo) {
        UserDeviceDto userDeviceDto = null;
        if (userDeviceVo != null)    {
            userDeviceDto = new UserDeviceDto();
            userDeviceDto.setUserDevicesId(userDeviceVo.getRealUserDevicesId());
            userDeviceDto.setUser(BindUser.bindUser(userDeviceVo.getRealUser()));
            userDeviceDto.setType(BindDevicesType.bindDevicesType(userDeviceVo.getRealType()));
            userDeviceDto.setName(userDeviceVo.getRealName());
            userDeviceDto.setDevicePushId(userDeviceVo.getRealDevicePushId());
        }
        return userDeviceDto;
    }

}
