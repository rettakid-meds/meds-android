package za.co.rettakid.meds.network;

import za.co.rettakid.meds.models.dto.*;

public class DoctorClient extends BaseClient   {

    public DoctorClient() {
        super("/doctors");
    }

    public DoctorListDto getDoctors()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, DoctorListDto.class);
    }

    public DoctorDto getDoctors(Long doctorId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, DoctorDto.class,doctorId);
    }

    public DoctorDto postDoctor(DoctorDto doctorDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, doctorDto, DoctorDto.class);
    }

    public DoctorListDto postDoctor(DoctorListDto doctorListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, doctorListDto, DoctorListDto.class);
    }

    public void putDoctor(DoctorDto doctorDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, doctorDto, DoctorDto.class,doctorDto.getDoctorId());
    }

    public void deleteDoctor(Long doctorId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,doctorId);
    }


    public PrescriptionListDto getPrescriptions(Long prescriptionId)  {
        String url = createUrl("/{id}/prescriptions");
        return getRestTemplate().getForObject(url, PrescriptionListDto.class,prescriptionId);
    }

}