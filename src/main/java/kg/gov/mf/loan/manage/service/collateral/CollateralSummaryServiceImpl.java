package kg.gov.mf.loan.manage.service.collateral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.collateral.CollateralSummaryDao;
import kg.gov.mf.loan.manage.model.collateral.CollateralSummary;

@Service("collateralSummaryService")
@Transactional
public class CollateralSummaryServiceImpl implements CollateralSummaryService {
	
	@Autowired
	private CollateralSummaryDao summaryDao;

	@Override
	public CollateralSummary findById(long id) {
		return this.summaryDao.findById(id);
	}

	@Override
	public void save(CollateralSummary summary) {
		this.summaryDao.save(summary);
	}

	@Override
	public void update(CollateralSummary summary) {
		CollateralSummary entity = this.summaryDao.findById(summary.getId());
        if(entity!=null){
        	entity.setOnDate(summary.getOnDate());
        	entity.setAgreementQuantity(summary.getAgreementQuantity());
        	entity.setGuarantorQuantity(summary.getGuarantorQuantity());
        	entity.setCollateralLoanCoverRatio(summary.getCollateralLoanCoverRatio());
        	entity.setCollateralAmount(summary.getCollateralAmount());
        	entity.setLoanAmount(summary.getLoanAmount());
        	entity.setItemAverageCondition(summary.getItemAverageCondition());
        	entity.setItemWorstCondition(summary.getItemWorstCondition());
        	entity.setItemAvgConditionByCollateral(summary.getItemAvgConditionByCollateral());
        	entity.setItemAvgConditionByLoan(summary.getItemAvgConditionByLoan());
        }
	}

	@Override
	public void deleteById(long id) {
		this.summaryDao.deleteById(id);
	}

	@Override
	public List<CollateralSummary> findAll() {
		return this.summaryDao.findAll();
	}

}
