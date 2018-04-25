package com.biao.controller.accession;

import com.biao.common.pagination.PageUtil;
import com.biao.common.pagination.Pagination;
import com.biao.entity.accessories.AccessoriesDO;
import com.biao.param.request.DataRequest;
import com.biao.param.response.SuccessResponse;
import com.biao.service.accession.service.AccessoriesService;
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
 * @date : 2018/4/22 - 14:04
 * @desription :
 * @update by :
 */
@Slf4j
@RestController
@RequestMapping("accessories")
public class AccessoriesController {
    @Autowired
    AccessoriesService accessoriesService;

    @PostMapping("/insertAccessories")
    public SuccessResponse<Object> insertAccessories(@RequestBody @Valid DataRequest<AccessoriesDO> dataRequest) {
        accessoriesService.insertAccessories(dataRequest.getBody());
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @PostMapping("/deleteAccessories")
    public SuccessResponse<Object> deleteAccessories(@RequestBody @Valid DataRequest<AccessoriesDO> dataRequest) {
        accessoriesService.deleteAccessories(dataRequest.getBody());
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @PostMapping("/updateAccessories")
    public SuccessResponse<Object> updateAccessories(@RequestBody @Valid DataRequest<AccessoriesDO> dataRequest) {
        accessoriesService.updateAccessories(dataRequest.getBody());
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @PostMapping("/listAccessories")
    public SuccessResponse<List<AccessoriesDO>> listAccessories(@RequestBody @Valid DataRequest<AccessoriesDO> dataRequest) {
        PageUtil.startPage(dataRequest);
        List<AccessoriesDO> accessoriesDOList = accessoriesService.listAccessories(dataRequest.getBody());
        Pagination pagination = new Pagination(accessoriesDOList);
        return new SuccessResponse<List<AccessoriesDO>>(pagination, accessoriesDOList);
    }
}
