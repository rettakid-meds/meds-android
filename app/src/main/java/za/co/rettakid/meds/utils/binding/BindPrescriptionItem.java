package za.co.rettakid.meds.utils.binding;

import za.co.rettakid.meds.models.vo.*;
import za.co.rettakid.meds.models.dto.*;

public class BindPrescriptionItem {

    public static PrescriptionItemVo bindPrescriptionItem(PrescriptionItemDto prescriptionItemDto) {
        PrescriptionItemVo prescriptionItemVo = null;
        if (prescriptionItemDto != null)    {
            prescriptionItemVo = new PrescriptionItemVo();
            prescriptionItemVo.setRealPrescriptionItemId(prescriptionItemDto.getPrescriptionItemId());
            prescriptionItemVo.setRealPrescription(BindPrescription.bindPrescription(prescriptionItemDto.getPrescription()));
            prescriptionItemVo.setRealName(prescriptionItemDto.getName());
        }
        return prescriptionItemVo;
    }

    public static PrescriptionItemDto bindPrescriptionItem(PrescriptionItemVo prescriptionItemVo) {
        PrescriptionItemDto prescriptionItemDto = null;
        if (prescriptionItemVo != null)    {
            prescriptionItemDto = new PrescriptionItemDto();
            prescriptionItemDto.setPrescriptionItemId(prescriptionItemVo.getRealPrescriptionItemId());
            prescriptionItemDto.setPrescription(BindPrescription.bindPrescription(prescriptionItemVo.getRealPrescription()));
            prescriptionItemDto.setName(prescriptionItemVo.getRealName());
        }
        return prescriptionItemDto;
    }

}
