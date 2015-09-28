package za.co.rettakid.meds.models.vo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import za.co.rettakid.meds.BR;

public class DataContentVo extends BaseObservable   {

    private Long dataContentId;
    private String data;

    @Bindable
    public String getDataContentId()   {
        return String.valueOf(this.dataContentId);
    }

    public void setDataContentId(String dataContentId)   {
        this.dataContentId = Long.parseLong(dataContentId);
        notifyPropertyChanged(BR.dataContentId);
    }
    @Bindable
    public String getData()   {
        return String.valueOf(this.data);
    }

    public void setData(String data)   {
        this.data = data;
        notifyPropertyChanged(BR.data);
    }

/* real getters and setters */

    public Long getRealDataContentId()   {
        return this.dataContentId;
    }

    public void setRealDataContentId(Long dataContentId)   {
        this.dataContentId = dataContentId;
    }
    public String getRealData()   {
        return this.data;
    }

    public void setRealData(String data)   {
        this.data = data;
    }

}