package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "doctorlistdto")
public class DoctorListDto   {

    @ElementList(name = "doctors",type = DoctorDto.class)
    private List<DoctorDto> doctors;

    public List<DoctorDto> getDoctorList()   {
        return this.doctors;
    }

    public void setDoctorList(List<DoctorDto> doctors)   {
        this.doctors = doctors;
    }
}