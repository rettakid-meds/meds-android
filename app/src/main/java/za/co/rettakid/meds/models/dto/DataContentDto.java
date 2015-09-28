package za.co.rettakid.meds.models.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import java.io.Serializable;


@Root(name = "datacontentdto")
public class DataContentDto implements Serializable    {


    @Element(name = "datacontentid" , required = false)
    private Long dataContentId;

    @Element(name = "data")
    private String data;


    public Long getDataContentId()   {
        return this.dataContentId;
    }

    public void setDataContentId(Long dataContentId)   {
        this.dataContentId = dataContentId;
    }

    public String getData()   {
        return this.data;
    }

    public void setData(String data)   {
        this.data = data;
    }

}