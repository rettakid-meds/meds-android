package za.co.rettakid.meds.utils.binding;

import za.co.rettakid.meds.models.vo.*;
import za.co.rettakid.meds.models.dto.*;

public class BindPractice {

    public static PracticeVo bindPractice(PracticeDto practiceDto) {
        PracticeVo practiceVo = null;
        if (practiceDto != null)    {
            practiceVo = new PracticeVo();
            practiceVo.setRealPracticeId(practiceDto.getPracticeId());
            practiceVo.setRealName(practiceDto.getName());
            practiceVo.setRealEmail(practiceDto.getEmail());
            practiceVo.setRealLongitude(practiceDto.getLongitude());
            practiceVo.setRealLatitude(practiceDto.getLatitude());
            practiceVo.setRealAddress(practiceDto.getAddress());
            practiceVo.setRealTradingDay(BindTradingDay.bindTradingDay(practiceDto.getTradingDay()));
            practiceVo.setRealPhone(practiceDto.getPhone());
            practiceVo.setRealFee(practiceDto.getFee());
            practiceVo.setRealImage(BindImage.bindImage(practiceDto.getImage()));
            practiceVo.setRealBio(BindDataContent.bindDataContent(practiceDto.getBio()));
        }
        return practiceVo;
    }

    public static PracticeDto bindPractice(PracticeVo practiceVo) {
        PracticeDto practiceDto = null;
        if (practiceVo != null)    {
            practiceDto = new PracticeDto();
            practiceDto.setPracticeId(practiceVo.getRealPracticeId());
            practiceDto.setName(practiceVo.getRealName());
            practiceDto.setEmail(practiceVo.getRealEmail());
            practiceDto.setLongitude(practiceVo.getRealLongitude());
            practiceDto.setLatitude(practiceVo.getRealLatitude());
            practiceDto.setAddress(practiceVo.getRealAddress());
            practiceDto.setTradingDay(BindTradingDay.bindTradingDay(practiceVo.getRealTradingDay()));
            practiceDto.setPhone(practiceVo.getRealPhone());
            practiceDto.setFee(practiceVo.getRealFee());
            practiceDto.setImage(BindImage.bindImage(practiceVo.getRealImage()));
            practiceDto.setBio(BindDataContent.bindDataContent(practiceVo.getRealBio()));
        }
        return practiceDto;
    }

}
