package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

import java.util.Date;

@Root(name = "prescriptionlistdto")
public class PrescriptionListDto   {

    @ElementList(name = "prescriptions",type = PrescriptionDto.class)
    private List<PrescriptionDto> prescriptions;

    public List<PrescriptionDto> getPrescriptionList()   {
        return this.prescriptions;
    }

    public void setPrescriptionList(List<PrescriptionDto> prescriptions)   {
        this.prescriptions = prescriptions;
    }
}