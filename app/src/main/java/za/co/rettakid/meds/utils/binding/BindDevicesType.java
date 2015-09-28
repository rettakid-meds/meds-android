package za.co.rettakid.meds.utils.binding;

import za.co.rettakid.meds.models.vo.*;
import za.co.rettakid.meds.models.dto.*;

public class BindDevicesType {

    public static DevicesTypeVo bindDevicesType(DevicesTypeDto devicesTypeDto) {
        DevicesTypeVo devicesTypeVo = null;
        if (devicesTypeDto != null)    {
            devicesTypeVo = new DevicesTypeVo();
            devicesTypeVo.setRealDevicesTypeId(devicesTypeDto.getDevicesTypeId());
            devicesTypeVo.setRealTypeName(devicesTypeDto.getTypeName());
            devicesTypeVo.setRealCanPush(devicesTypeDto.getCanPush());
        }
        return devicesTypeVo;
    }

    public static DevicesTypeDto bindDevicesType(DevicesTypeVo devicesTypeVo) {
        DevicesTypeDto devicesTypeDto = null;
        if (devicesTypeVo != null)    {
            devicesTypeDto = new DevicesTypeDto();
            devicesTypeDto.setDevicesTypeId(devicesTypeVo.getRealDevicesTypeId());
            devicesTypeDto.setTypeName(devicesTypeVo.getRealTypeName());
            devicesTypeDto.setCanPush(devicesTypeVo.getRealCanPush());
        }
        return devicesTypeDto;
    }

}
