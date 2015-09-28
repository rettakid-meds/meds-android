package za.co.rettakid.meds.utils.binding;

import za.co.rettakid.meds.models.vo.*;
import za.co.rettakid.meds.models.dto.*;

public class BindDataContent {

    public static DataContentVo bindDataContent(DataContentDto dataContentDto) {
        DataContentVo dataContentVo = null;
        if (dataContentDto != null)    {
            dataContentVo = new DataContentVo();
            dataContentVo.setRealDataContentId(dataContentDto.getDataContentId());
            dataContentVo.setRealData(dataContentDto.getData());
        }
        return dataContentVo;
    }

    public static DataContentDto bindDataContent(DataContentVo dataContentVo) {
        DataContentDto dataContentDto = null;
        if (dataContentVo != null)    {
            dataContentDto = new DataContentDto();
            dataContentDto.setDataContentId(dataContentVo.getRealDataContentId());
            dataContentDto.setData(dataContentVo.getRealData());
        }
        return dataContentDto;
    }

}
