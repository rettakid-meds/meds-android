package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

import java.util.Date;

@Root(name = "appointmentlistdto")
public class AppointmentListDto   {

    @ElementList(name = "appointments",type = AppointmentDto.class)
    private List<AppointmentDto> appointments;

    public List<AppointmentDto> getAppointmentList()   {
        return this.appointments;
    }

    public void setAppointmentList(List<AppointmentDto> appointments)   {
        this.appointments = appointments;
    }
}