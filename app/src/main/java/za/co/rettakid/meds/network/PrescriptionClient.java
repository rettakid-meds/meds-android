package za.co.rettakid.meds.network;

import za.co.rettakid.meds.models.dto.*;

public class PrescriptionClient extends BaseClient   {

    public PrescriptionClient() {
        super("/prescriptions");
    }

    public PrescriptionListDto getPrescriptions()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, PrescriptionListDto.class);
    }

    public PrescriptionDto getPrescriptions(Long prescriptionId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, PrescriptionDto.class,prescriptionId);
    }

    public PrescriptionDto postPrescription(PrescriptionDto prescriptionDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, prescriptionDto, PrescriptionDto.class);
    }

    public PrescriptionListDto postPrescription(PrescriptionListDto prescriptionListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, prescriptionListDto, PrescriptionListDto.class);
    }

    public void putPrescription(PrescriptionDto prescriptionDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, prescriptionDto, PrescriptionDto.class,prescriptionDto.getPrescriptionId());
    }

    public void deletePrescription(Long prescriptionId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,prescriptionId);
    }


    public PrescriptionItemListDto getPrescriptionItemPrescriptions(Long prescriptionItemId)  {
        String url = createUrl("/{id}/prescriptions");
        return getRestTemplate().getForObject(url, PrescriptionItemListDto.class,prescriptionItemId);
    }

}