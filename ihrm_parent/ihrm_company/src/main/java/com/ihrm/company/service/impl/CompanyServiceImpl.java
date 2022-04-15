package com.ihrm.company.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ihrm.company.mapper.CompanyMapper;
import com.ihrm.company.service.ICompanyService;
import com.ihrm.domain.company.Company;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cyf
 * @since 2022-04-15
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
