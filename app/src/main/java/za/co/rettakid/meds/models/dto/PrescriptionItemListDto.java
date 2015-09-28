package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "prescriptionitemlistdto")
public class PrescriptionItemListDto   {

    @ElementList(name = "prescriptionitems",type = PrescriptionItemDto.class)
    private List<PrescriptionItemDto> prescriptionItems;

    public List<PrescriptionItemDto> getPrescriptionItemList()   {
        return this.prescriptionItems;
    }

    public void setPrescriptionItemList(List<PrescriptionItemDto> prescriptionItems)   {
        this.prescriptionItems = prescriptionItems;
    }
}