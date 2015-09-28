package za.co.rettakid.meds.network;

import za.co.rettakid.meds.models.dto.*;

public class PracticeClient extends BaseClient   {

    public PracticeClient() {
        super("/practices");
    }

    public PracticeListDto getPractices()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, PracticeListDto.class);
    }

    public PracticeDto getPractices(Long practiceId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, PracticeDto.class,practiceId);
    }

    public PracticeDto postPractice(PracticeDto practiceDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, practiceDto, PracticeDto.class);
    }

    public PracticeListDto postPractice(PracticeListDto practiceListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, practiceListDto, PracticeListDto.class);
    }

    public void putPractice(PracticeDto practiceDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, practiceDto, PracticeDto.class,practiceDto.getPracticeId());
    }

    public void deletePractice(Long practiceId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,practiceId);
    }


    public DoctorListDto getDoctors(Long doctorId)  {
        String url = createUrl("/{id}/doctors");
        return getRestTemplate().getForObject(url, DoctorListDto.class,doctorId);
    }

    public AppointmentListDto getAppointments(Long appointmentId)  {
        String url = createUrl("/{id}/appointments");
        return getRestTemplate().getForObject(url, AppointmentListDto.class,appointmentId);
    }

}