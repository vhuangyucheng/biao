package com.biao.controller.material;

import com.biao.common.pagination.PageUtil;
import com.biao.common.pagination.Pagination;
import com.biao.entity.accessories.AccessoriesDO;
import com.biao.entity.material.MaterialDO;
import com.biao.param.request.DataRequest;
import com.biao.param.response.SuccessResponse;
import com.biao.service.accession.service.AccessoriesService;
import com.biao.service.material.service.MaterialService;
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
 * @date : 2018/4/24 - 12:41
 * @desription :
 * @update by :
 */
@Slf4j
@RestController
@RequestMapping("material")
public class MaterialController {
    @Autowired
    MaterialService materialService;

    @PostMapping("/insertMaterial")
    public SuccessResponse<Object> insertMaterial(@RequestBody @Valid DataRequest<MaterialDO> dataRequest) {
        materialService.insertMaterial(dataRequest.getBody());
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @PostMapping("/deleteMaterial")
    public SuccessResponse<Object> deleteMaterial(@RequestBody @Valid DataRequest<MaterialDO> dataRequest) {
        materialService.deleteMaterial(dataRequest.getBody());
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @PostMapping("/updateMaterial")
    public SuccessResponse<Object> updateMaterial(@RequestBody @Valid DataRequest<MaterialDO> dataRequest) {
        materialService.updateMaterial(dataRequest.getBody());
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @PostMapping("/listMaterial")
    public SuccessResponse<Object> listMaterial(@RequestBody @Valid DataRequest<MaterialDO> dataRequest) {
        PageUtil.startPage(dataRequest);
        List<MaterialDO> materialDOList = materialService.listMaterial(dataRequest.getBody());
        Pagination pagination = new Pagination(materialDOList);
        return new SuccessResponse<Object>(pagination, materialDOList);
    }
}
