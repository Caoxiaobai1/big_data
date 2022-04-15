package com.ihrm.company.controller.api;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.domain.company.Company;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: CompanyControllerApi
 * @Description: companyapi
 * @author: caoyifei
 * @date: 2022/4/15 15:17
 */
@Tag(name = "CompanyControllerApi", description = "公司相关接口")
public interface CompanyControllerApi {

    @Operation(summary = "公司列表",
            description = "获取公司列表",
//            parameters = {
//                    @Parameter(name = "name", description = "姓名")
//            },
            responses = {
                    @ApiResponse(description = "公司列表list",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = Company.class))),
                    @ApiResponse(responseCode = "400", description = "返回400时候错误的原因")}
    )
    Result list();
}
