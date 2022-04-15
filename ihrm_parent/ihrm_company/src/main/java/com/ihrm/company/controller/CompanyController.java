package com.ihrm.company.controller;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.company.controller.api.CompanyControllerApi;
import com.ihrm.company.service.ICompanyService;
import com.ihrm.domain.company.Company;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cyf
 * @since 2022-04-15
 */
@Controller
@RequestMapping("/company")
public class CompanyController implements CompanyControllerApi {

    @Autowired
    private ICompanyService companyService;

    @Override
    public Result list(){
        return new Result(ResultCode.SUCCESS, companyService.list());
    }
}
