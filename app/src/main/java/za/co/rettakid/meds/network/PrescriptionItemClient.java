package za.co.rettakid.meds.network;

import za.co.rettakid.meds.models.dto.*;

public class PrescriptionItemClient extends BaseClient   {

    public PrescriptionItemClient() {
        super("/prescriptionitems");
    }

    public PrescriptionItemListDto getPrescriptionItems()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, PrescriptionItemListDto.class);
    }

    public PrescriptionItemDto getPrescriptionItems(Long prescriptionItemId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, PrescriptionItemDto.class,prescriptionItemId);
    }

    public PrescriptionItemDto postPrescriptionItem(PrescriptionItemDto prescriptionItemDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, prescriptionItemDto, PrescriptionItemDto.class);
    }

    public PrescriptionItemListDto postPrescriptionItem(PrescriptionItemListDto prescriptionItemListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, prescriptionItemListDto, PrescriptionItemListDto.class);
    }

    public void putPrescriptionItem(PrescriptionItemDto prescriptionItemDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, prescriptionItemDto, PrescriptionItemDto.class,prescriptionItemDto.getPrescriptionItemId());
    }

    public void deletePrescriptionItem(Long prescriptionItemId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,prescriptionItemId);
    }


}