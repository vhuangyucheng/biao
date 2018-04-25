package com.biao.controller.material;

import com.biao.common.pagination.PageUtil;
import com.biao.common.pagination.Pagination;
import com.biao.entity.material.MaterialRecordDO;
import com.biao.param.request.DataRequest;
import com.biao.param.request.material.ListMaterialRecordDTO;
import com.biao.param.response.SuccessResponse;
import com.biao.service.material.exceptionHandler.MaterialExceptionHandler;
import com.biao.service.material.service.MaterialRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author : kooing
 * @date : 2018/4/25 - 14:49
 * @desription :
 * @update by :
 */
@Slf4j
@RestController
@RequestMapping("materialRecord")
public class MaterialRecordController extends MaterialExceptionHandler{
    @Autowired
    MaterialRecordService materialRecordService;

    @PostMapping("/insertRecord")
    public SuccessResponse<Object> insertRecord(@RequestBody @Valid DataRequest<MaterialRecordDO> dataRequest) {
        materialRecordService.insertMaterialRecord(dataRequest.getBody());
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @PostMapping("/deleteMaterialRecord")
    public SuccessResponse<Object> deleteMaterialRecord(@RequestBody @Valid DataRequest<MaterialRecordDO> dataRequest) {
        materialRecordService.deleteMaterialRecord(dataRequest.getBody());
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @PostMapping("/updateMaterialRecord")
    public SuccessResponse<Object> updateMaterialRecord(@RequestBody @Valid DataRequest<MaterialRecordDO> dataRequest) {
        materialRecordService.updateMaterialRecord(dataRequest.getBody());
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @PostMapping("/listMaterialRecord")
    public SuccessResponse<List<MaterialRecordDO>> listMaterialRecord(@RequestBody @Valid DataRequest<ListMaterialRecordDTO> dataRequest) {
        PageUtil.startPage(dataRequest);
        List<MaterialRecordDO> materialRecordDOList = materialRecordService.listMaterialRecord(dataRequest.getBody());
        Pagination pagination = new Pagination(materialRecordDOList);
        return new SuccessResponse<List<MaterialRecordDO>>(pagination, materialRecordDOList);
    }
}
