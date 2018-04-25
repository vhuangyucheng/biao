package com.biao.controller.accession;

import com.biao.common.pagination.PageUtil;
import com.biao.common.pagination.Pagination;
import com.biao.entity.accessories.AccessoriesRecordDO;
import com.biao.param.request.DataRequest;
import com.biao.param.request.accession.ListAccessoriesRecordDTO;
import com.biao.param.request.material.ListMaterialRecordDTO;
import com.biao.param.response.SuccessResponse;
import com.biao.service.accession.service.AccessoriesRecordService;
import com.biao.service.accession.exceptionHandler.AccessoriesExceptionHandler;
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
 * @date : 2018/4/22 - 20:57
 * @desription :
 * @update by :
 */
@Slf4j
@RestController
@RequestMapping("accessoriesRecord")
public class AccessoriesRecordController extends AccessoriesExceptionHandler{
    @Autowired
    AccessoriesRecordService accessoriesRecordService;

    @PostMapping("/insertAccessoriesRecord")
    public SuccessResponse<Object> insertAccessoriesRecord(@RequestBody @Valid DataRequest<AccessoriesRecordDO> dataRequest) {
        accessoriesRecordService.insertAccessories(dataRequest.getBody());
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @PostMapping("/deleteAccessoriesRecord")
    public SuccessResponse<Object> deleteAccessoriesRecord(@RequestBody @Valid DataRequest<AccessoriesRecordDO> dataRequest) {
        accessoriesRecordService.deleteAccessories(dataRequest.getBody());
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @PostMapping("/updateAccessoriesRecord")
    public SuccessResponse<Object> updateAccessoriesRecord(@RequestBody @Valid DataRequest<AccessoriesRecordDO> dataRequest) {
        accessoriesRecordService.updateAccessories(dataRequest.getBody());
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @PostMapping("/listAccessoriesRecord")
    public SuccessResponse<List<AccessoriesRecordDO>> listAccessoriesRecord(@RequestBody @Valid DataRequest<ListAccessoriesRecordDTO> dataRequest) {
        PageUtil.startPage(dataRequest);
        List<AccessoriesRecordDO> accessoriesDOList = accessoriesRecordService.listAccessories(dataRequest.getBody());
        Pagination pagination = new Pagination(accessoriesDOList);
        return new SuccessResponse<List<AccessoriesRecordDO>>(pagination, accessoriesDOList);
    }
}
