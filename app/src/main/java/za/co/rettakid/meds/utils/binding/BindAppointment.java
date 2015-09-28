package za.co.rettakid.meds.utils.binding;

import za.co.rettakid.meds.models.vo.*;
import za.co.rettakid.meds.models.dto.*;

public class BindAppointment {

    public static AppointmentVo bindAppointment(AppointmentDto appointmentDto) {
        AppointmentVo appointmentVo = null;
        if (appointmentDto != null)    {
            appointmentVo = new AppointmentVo();
            appointmentVo.setRealAppointmentId(appointmentDto.getAppointmentId());
            appointmentVo.setRealPractice(BindPractice.bindPractice(appointmentDto.getPractice()));
            appointmentVo.setRealUser(BindUser.bindUser(appointmentDto.getUser()));
            appointmentVo.setRealExpectedFrm(appointmentDto.getExpectedFrm());
            appointmentVo.setRealExpectedTo(appointmentDto.getExpectedTo());
            appointmentVo.setRealActualFrm(appointmentDto.getActualFrm());
            appointmentVo.setRealActualTo(appointmentDto.getActualTo());
        }
        return appointmentVo;
    }

    public static AppointmentDto bindAppointment(AppointmentVo appointmentVo) {
        AppointmentDto appointmentDto = null;
        if (appointmentVo != null)    {
            appointmentDto = new AppointmentDto();
            appointmentDto.setAppointmentId(appointmentVo.getRealAppointmentId());
            appointmentDto.setPractice(BindPractice.bindPractice(appointmentVo.getRealPractice()));
            appointmentDto.setUser(BindUser.bindUser(appointmentVo.getRealUser()));
            appointmentDto.setExpectedFrm(appointmentVo.getRealExpectedFrm());
            appointmentDto.setExpectedTo(appointmentVo.getRealExpectedTo());
            appointmentDto.setActualFrm(appointmentVo.getRealActualFrm());
            appointmentDto.setActualTo(appointmentVo.getRealActualTo());
        }
        return appointmentDto;
    }

}
