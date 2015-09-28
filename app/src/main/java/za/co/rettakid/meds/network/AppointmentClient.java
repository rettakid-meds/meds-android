package za.co.rettakid.meds.network;

import za.co.rettakid.meds.models.dto.*;

public class AppointmentClient extends BaseClient   {

    public AppointmentClient() {
        super("/appointments");
    }

    public AppointmentListDto getAppointments()  {
        String url = createUrl();
        return getRestTemplate().getForObject(url, AppointmentListDto.class);
    }

    public AppointmentDto getAppointments(Long appointmentId)  {
        String url = createUrl("/{id}");
        return getRestTemplate().getForObject(url, AppointmentDto.class,appointmentId);
    }

    public AppointmentDto postAppointment(AppointmentDto appointmentDto)  {
        String url = createUrl();
        return getRestTemplate().postForObject(url, appointmentDto, AppointmentDto.class);
    }

    public AppointmentListDto postAppointment(AppointmentListDto appointmentListDto)  {
        String url = createUrl("/list");
        return getRestTemplate().postForObject(url, appointmentListDto, AppointmentListDto.class);
    }

    public void putAppointment(AppointmentDto appointmentDto)  {
        String url = createUrl("/{id}");
        getRestTemplate().put(url, appointmentDto, AppointmentDto.class,appointmentDto.getAppointmentId());
    }

    public void deleteAppointment(Long appointmentId)  {
        String url = createUrl("/{id}");
        getRestTemplate().delete(url,appointmentId);
    }


    public PrescriptionListDto getPrescriptions(Long prescriptionId)  {
        String url = createUrl("/{id}/prescriptions");
        return getRestTemplate().getForObject(url, PrescriptionListDto.class,prescriptionId);
    }

}