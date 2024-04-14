package com.cnr_furniture.service;

import com.cnr_furniture.domain.work.*;
import com.cnr_furniture.mapper.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j;

import java.util.List;

@Log4j
@Service
public class WorkServiceImpl implements WorkService{
    @Autowired
    private WorkMapper workMapper;

    @Override
    public List<WorkSelectCompanyVO> findCompanyList() {
        return workMapper.workSelectCompanyList();
    }

    @Override
    public List<WorkSelectItemVO> findItemList() {
        return workMapper.workSelectItemList();
    }

    @Override
    public List<WorkSelectInstructionVO> findInstructionList() {
        return workMapper.workSelectInstructionList();
    }

    @Override
    public List<WorkSelectProcessInfoVO> findProcessInfoList() {
        return workMapper.workSelectProcessInfoList();
    }

    /** 제조수행정보 조회 */
    @Override
    public List<WorkProcessInfoVO> selectWorkProcessInfo(WorkSearchVO workSearchVO) {
        return workMapper.selectWorkProcessInfo(workSearchVO);
    }
}
