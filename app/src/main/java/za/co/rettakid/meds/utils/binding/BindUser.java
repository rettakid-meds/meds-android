package za.co.rettakid.meds.utils.binding;

import za.co.rettakid.meds.models.vo.*;
import za.co.rettakid.meds.models.dto.*;

public class BindUser {

    public static UserVo bindUser(UserDto userDto) {
        UserVo userVo = null;
        if (userDto != null)    {
            userVo = new UserVo();
            userVo.setRealUserId(userDto.getUserId());
            userVo.setRealEmail(userDto.getEmail());
            userVo.setRealPassword(userDto.getPassword());
            userVo.setRealName(userDto.getName());
            userVo.setRealSurname(userDto.getSurname());
            userVo.setRealPhone(userDto.getPhone());
            userVo.setRealGender(userDto.getGender());
            userVo.setRealAge(userDto.getAge());
            userVo.setRealUserAllowPush(userDto.getUserAllowPush());
        }
        return userVo;
    }

    public static UserDto bindUser(UserVo userVo) {
        UserDto userDto = null;
        if (userVo != null)    {
            userDto = new UserDto();
            userDto.setUserId(userVo.getRealUserId());
            userDto.setEmail(userVo.getRealEmail());
            userDto.setPassword(userVo.getRealPassword());
            userDto.setName(userVo.getRealName());
            userDto.setSurname(userVo.getRealSurname());
            userDto.setPhone(userVo.getRealPhone());
            userDto.setGender(userVo.getRealGender());
            userDto.setAge(userVo.getRealAge());
            userDto.setUserAllowPush(userVo.getRealUserAllowPush());
        }
        return userDto;
    }

}
