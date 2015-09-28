package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;


@Root(name = "practicelistdto")
public class PracticeListDto   {

    @ElementList(name = "practices",type = PracticeDto.class)
    private List<PracticeDto> practices;

    public List<PracticeDto> getPracticeList()   {
        return this.practices;
    }

    public void setPracticeList(List<PracticeDto> practices)   {
        this.practices = practices;
    }
}