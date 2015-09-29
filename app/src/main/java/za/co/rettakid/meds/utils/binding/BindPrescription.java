package za.co.rettakid.meds.utils.binding;

import za.co.rettakid.meds.models.vo.*;
import za.co.rettakid.meds.models.dto.*;

public class BindPrescription {

    public static PrescriptionVo bindPrescription(PrescriptionDto prescriptionDto) {
        PrescriptionVo prescriptionVo = null;
        if (prescriptionDto != null)    {
            prescriptionVo = new PrescriptionVo();
            prescriptionVo.setRealPrescriptionId(prescriptionDto.getPrescriptionId());
            prescriptionVo.setRealAppointment(BindAppointment.bindAppointment(prescriptionDto.getAppointment()));
            prescriptionVo.setRealDoctor(BindDoctor.bindDoctor(prescriptionDto.getDoctor()));
            prescriptionVo.setRealUser(BindUser.bindUser(prescriptionDto.getUser()));
            prescriptionVo.setRealFile(BindFile.bindFile(prescriptionDto.getFile()));
            prescriptionVo.setRealEffFrm(prescriptionDto.getEffFrm());
            prescriptionVo.setRealEffTo(prescriptionDto.getEffTo());
        }
        return prescriptionVo;
    }

    public static PrescriptionDto bindPrescription(PrescriptionVo prescriptionVo) {
        PrescriptionDto prescriptionDto = null;
        if (prescriptionVo != null)    {
            prescriptionDto = new PrescriptionDto();
            prescriptionDto.setPrescriptionId(prescriptionVo.getRealPrescriptionId());
            prescriptionDto.setAppointment(BindAppointment.bindAppointment(prescriptionVo.getRealAppointment()));
            prescriptionDto.setDoctor(BindDoctor.bindDoctor(prescriptionVo.getRealDoctor()));
            prescriptionDto.setUser(BindUser.bindUser(prescriptionVo.getRealUser()));
            prescriptionDto.setFile(BindFile.bindFile(prescriptionVo.getRealFile()));
            prescriptionDto.setEffFrm(prescriptionVo.getRealEffFrm());
            prescriptionDto.setEffTo(prescriptionVo.getRealEffTo());
        }
        return prescriptionDto;
    }

}
