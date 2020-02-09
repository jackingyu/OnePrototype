package org.jeecg.modules.demo.com.elnido.service.impl;

import org.jeecg.modules.demo.com.elnido.entity.Company;
import org.jeecg.modules.demo.com.elnido.mapper.CompanyMapper;
import org.jeecg.modules.demo.com.elnido.service.ICompanyService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: company
 * @Author: jeecg-boot
 * @Date:   2020-02-09
 * @Version: V1.0
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
