package za.co.rettakid.meds.utils.binding;

import za.co.rettakid.meds.models.vo.*;
import za.co.rettakid.meds.models.dto.*;

public class BindDoctor {

    public static DoctorVo bindDoctor(DoctorDto doctorDto) {
        DoctorVo doctorVo = null;
        if (doctorDto != null)    {
            doctorVo = new DoctorVo();
            doctorVo.setRealDoctorId(doctorDto.getDoctorId());
            doctorVo.setRealPractice(BindPractice.bindPractice(doctorDto.getPractice()));
            doctorVo.setRealUser(BindUser.bindUser(doctorDto.getUser()));
        }
        return doctorVo;
    }

    public static DoctorDto bindDoctor(DoctorVo doctorVo) {
        DoctorDto doctorDto = null;
        if (doctorVo != null)    {
            doctorDto = new DoctorDto();
            doctorDto.setDoctorId(doctorVo.getRealDoctorId());
            doctorDto.setPractice(BindPractice.bindPractice(doctorVo.getRealPractice()));
            doctorDto.setUser(BindUser.bindUser(doctorVo.getRealUser()));
        }
        return doctorDto;
    }

}
