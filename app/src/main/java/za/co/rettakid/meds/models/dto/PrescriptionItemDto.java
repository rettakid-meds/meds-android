package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "prescriptionitemdto")
public class PrescriptionItemDto implements Serializable    {


    @Element(name = "prescriptionitemid" , required = false)
    private Long prescriptionItemId;

    @Element(name = "prescriptiondto")
    private PrescriptionDto prescription;

    @Element(name = "name")
    private String name;


    public Long getPrescriptionItemId()   {
        return this.prescriptionItemId;
    }

    public void setPrescriptionItemId(Long prescriptionItemId)   {
        this.prescriptionItemId = prescriptionItemId;
    }

    public PrescriptionDto getPrescription()   {
        return this.prescription;
    }

    public void setPrescription(PrescriptionDto prescription)   {
        this.prescription = prescription;
    }

    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

}