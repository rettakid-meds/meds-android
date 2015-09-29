package za.co.rettakid.meds.network;

import za.co.rettakid.meds.models.dto.*;

public class DataContentClient extends BaseClient   {

    public DataContentClient() {
        super("/datacontents");
    }

    public DataContentListDto getDataContents()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, DataContentListDto.class);
    }

    public DataContentDto getDataContents(Long dataContentId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, DataContentDto.class,dataContentId);
    }

    public DataContentDto postDataContent(DataContentDto dataContentDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, dataContentDto, DataContentDto.class);
    }

    public DataContentListDto postDataContent(DataContentListDto dataContentListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, dataContentListDto, DataContentListDto.class);
    }

    public void putDataContent(DataContentDto dataContentDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, dataContentDto, DataContentDto.class,dataContentDto.getDataContentId());
    }

    public void deleteDataContent(Long dataContentId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,dataContentId);
    }


    public PracticeListDto getPracticeBios(Long practiceId)  {
        String url = createUrl("/{id}/bios");
        return getRestTemplate().getForObject(url, PracticeListDto.class,practiceId);
    }

    public DoctorListDto getDoctorBios(Long doctorId)  {
        String url = createUrl("/{id}/bios");
        return getRestTemplate().getForObject(url, DoctorListDto.class,doctorId);
    }

    public AppointmentListDto getAppointmentNotes(Long appointmentId)  {
        String url = createUrl("/{id}/notes");
        return getRestTemplate().getForObject(url, AppointmentListDto.class,appointmentId);
    }

}