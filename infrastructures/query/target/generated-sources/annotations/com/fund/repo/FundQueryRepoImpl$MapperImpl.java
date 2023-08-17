package com.fund.repo;

import com.fund.entity.resp.FundHistoryResp;
import com.fund.entity.resp.FundOwnResp;
import com.fund.entity.resp.FundResp;
import com.fund.entity.resp.FundTransactionRecordResp;
import com.fund.infras.dao.model.FundHistoryPO;
import com.fund.infras.dao.model.FundPO;
import com.fund.infras.dao.model.FundTransactionRecordPO;
import com.fund.infras.dao.model.FundUserBalancePO;
import com.fund.repo.FundQueryRepoImpl.Mapper;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-15T10:29:28+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
class FundQueryRepoImpl$MapperImpl implements Mapper {

    @Override
    public FundResp toFundResp(FundPO po) {
        if ( po == null ) {
            return null;
        }

        FundResp fundResp = new FundResp();

        fundResp.setId( po.getId() );
        fundResp.setFundCode( po.getFundCode() );
        fundResp.setFundName( po.getFundName() );
        fundResp.setFundNav( po.getFundNav() );
        fundResp.setFundAccnav( po.getFundAccnav() );
        fundResp.setFundDate( po.getFundDate() );
        fundResp.setFundDgr( po.getFundDgr() );
        fundResp.setSubsribeState( po.getSubsribeState() );
        fundResp.setRedeemState( po.getRedeemState() );
        fundResp.setFundFee( po.getFundFee() );

        return fundResp;
    }

    @Override
    public FundHistoryResp toHisResp(FundHistoryPO po) {
        if ( po == null ) {
            return null;
        }

        FundHistoryResp fundHistoryResp = new FundHistoryResp();

        fundHistoryResp.setId( po.getId() );
        fundHistoryResp.setFundDate( po.getFundDate() );
        fundHistoryResp.setFundNav( po.getFundNav() );
        fundHistoryResp.setFundAccnav( po.getFundAccnav() );
        fundHistoryResp.setFundDgr( po.getFundDgr() );
        fundHistoryResp.setSubsribeState( po.getSubsribeState() );
        fundHistoryResp.setRedeemState( po.getRedeemState() );

        return fundHistoryResp;
    }

    @Override
    public FundOwnResp toOwnResp(FundUserBalancePO po) {
        if ( po == null ) {
            return null;
        }

        FundOwnResp fundOwnResp = new FundOwnResp();

        fundOwnResp.setId( po.getId() );
        fundOwnResp.setFundId( po.getFundId() );
        fundOwnResp.setFundDate( po.getFundDate() );
        fundOwnResp.setPurchaseAmount( po.getPurchaseAmount() );
        fundOwnResp.setBalance( po.getBalance() );

        return fundOwnResp;
    }

    @Override
    public FundTransactionRecordResp toRecordResp(FundTransactionRecordPO po) {
        if ( po == null ) {
            return null;
        }

        FundTransactionRecordResp fundTransactionRecordResp = new FundTransactionRecordResp();

        fundTransactionRecordResp.setId( po.getId() );
        fundTransactionRecordResp.setUserId( po.getUserId() );
        fundTransactionRecordResp.setFundId( po.getFundId() );
        fundTransactionRecordResp.setFundDate( po.getFundDate() );
        fundTransactionRecordResp.setTransactionAmount( po.getTransactionAmount() );

        return fundTransactionRecordResp;
    }
}
