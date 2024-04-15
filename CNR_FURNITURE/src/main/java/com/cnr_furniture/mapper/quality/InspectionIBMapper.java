package com.cnr_furniture.mapper.quality;

import com.cnr_furniture.domain.quality.CriteriaInspIBVO;
import com.cnr_furniture.domain.quality.InspectionIBInsertVO;
import com.cnr_furniture.domain.quality.InspectionIBListVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InspectionIBMapper {
    /* [자재불량등록] - 검색 및 현황 조회 ====================================================================================================== */
    /**
     * Desc: 검색창 - 자재번호 - 조회
     */
    List<InspectionIBListVO> getMatIDList();

    /**
     * Desc: 검색창 - 계약번호 - 조회
     */
    List<InspectionIBListVO> getContractIDList();

    /**
     * Desc: 검색창 - 불량유형1 - 조회
     */
    List<InspectionIBListVO> getQsDiv1List();

    /**
     * Desc: 검색창 - 불량유형1에 따른 불량유형2 조회
     */
    List<InspectionIBListVO> getQsDiv2ListByQsDiv1(String qsDiv1);

    /**
     * Desc: 수입검사현황 목록 조회(with 검색), 자재 IB 불량 현황 조회
     */
    List<InspectionIBListVO> getInspectionIBList(CriteriaInspIBVO cri);

    /* [자재불량등록] - 모달창 ====================================================================================================== */
    /**
     * Desc: 모달창 - 계약번호 - 조회
     */
    List<InspectionIBInsertVO> getContractIDListForModal();

    /**
     * Desc: 모달창 - 불량유형1 - 조회
     */
    List<InspectionIBInsertVO> getQsDiv1ListForModal();

    /**
     * Desc: 모달창 - 불량유형1에 따른 불량유형2 조회
     */
    List<InspectionIBInsertVO> getQsDiv2ListByQsDiv1ForModal(String qsDiv1Modal);


    /**
     * Desc: 모달창 - [계약번호] 입력에 따른 [거래처명], [계약입고수량], [단위], [자재번호], [자재명], [자재용도] 자동 채우기
     */
    InspectionIBInsertVO getContractDetailsByContractIDModal(Long contractIDModal);

    /**
     * Desc: 모달창 - [품질검사 테이블] - 자재불량등록 데이터 저장
     */
    void insertQualityInspection(InspectionIBInsertVO insertVO);

    /**
     * Desc: 모달창 - [계약 테이블] - UPDATE
     */
    void updateContract(InspectionIBInsertVO insertVO);

    /**
     * Desc: 모달창 - [재고 테이블] - UPDATE 또는 INSERT
     */
    void insertOrUpdateInventory(InspectionIBInsertVO insertVO);

    /**
     * Desc: [수입검사관리]: 수정 - 특정 수입검사 항목을 가져오는 메소드
     */
    InspectionIBListVO getInspectionDetailsBySeq(Long listSeq);

    /**
     * Desc: [수입검사관리]: 수정 - 수입검사 항목을 UPDATE 하는 메소드
     */
    /*void updateInspection(InspectionIBListVO inspection);*/


}
