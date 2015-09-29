package za.co.rettakid.meds.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import za.co.rettakid.meds.BR;

public class PrescriptionItemVo extends BaseObservable   {

    private Long prescriptionItemId;
    private PrescriptionVo prescription;
    private String name;

    @Bindable
    public String getPrescriptionItemId()   {
        return String.valueOf(this.prescriptionItemId);
    }

    public void setPrescriptionItemId(String prescriptionItemId)   {
        this.prescriptionItemId = Long.parseLong(prescriptionItemId);
        notifyPropertyChanged(BR.prescriptionItemId);
    }
    @Bindable
    public PrescriptionVo getPrescription()   {
        return this.prescription;
    }

    public void setPrescription(PrescriptionVo prescription)   {
        this.prescription = prescription;
        notifyPropertyChanged(BR.prescription);
    }
    @Bindable
    public String getName()   {
        return String.valueOf(this.name);
    }

    public void setName(String name)   {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

/* real getters and setters */

    public Long getRealPrescriptionItemId()   {
        return this.prescriptionItemId;
    }

    public void setRealPrescriptionItemId(Long prescriptionItemId)   {
        this.prescriptionItemId = prescriptionItemId;
    }
    public PrescriptionVo getRealPrescription()   {
        return this.prescription;
    }

    public void setRealPrescription(PrescriptionVo prescription)   {
        this.prescription = prescription;
    }
    public String getRealName()   {
        return this.name;
    }

    public void setRealName(String name)   {
        this.name = name;
    }

}