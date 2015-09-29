package za.co.rettakid.meds.utils.binding;

import za.co.rettakid.meds.models.vo.*;
import za.co.rettakid.meds.models.dto.*;

public class BindDoctor {

    public static DoctorVo bindDoctor(DoctorDto doctorDto) {
        DoctorVo doctorVo = null;
        if (doctorDto != null)    {
            doctorVo = new DoctorVo();
            doctorVo.setRealDoctorId(doctorDto.getDoctorId());
            doctorVo.setRealUser(BindUser.bindUser(doctorDto.getUser()));
            doctorVo.setRealImage(BindImage.bindImage(doctorDto.getImage()));
            doctorVo.setRealBio(BindDataContent.bindDataContent(doctorDto.getBio()));
        }
        return doctorVo;
    }

    public static DoctorDto bindDoctor(DoctorVo doctorVo) {
        DoctorDto doctorDto = null;
        if (doctorVo != null)    {
            doctorDto = new DoctorDto();
            doctorDto.setDoctorId(doctorVo.getRealDoctorId());
            doctorDto.setUser(BindUser.bindUser(doctorVo.getRealUser()));
            doctorDto.setImage(BindImage.bindImage(doctorVo.getRealImage()));
            doctorDto.setBio(BindDataContent.bindDataContent(doctorVo.getRealBio()));
        }
        return doctorDto;
    }

}
