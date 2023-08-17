package com.fund.infras.repo.impl;

import com.fund.dto.cmd.FundPurchaseCmd;
import com.fund.infras.dao.model.FundHistoryPO;
import com.fund.infras.dao.model.FundPO;
import com.fund.infras.dao.model.FundUserBalancePO;
import com.fund.infras.dao.model.FundUserPO;
import com.fund.infras.repo.impl.FundCmdRepoImpl.Mapper;
import com.fund.service.FundCmdService.EarningsInfo;
import com.fund.service.FundCmdService.FundHisInfo;
import com.fund.service.FundCmdService.FundInfo;
import com.fund.service.FundCmdService.UserBalanceInfo;
import com.fund.service.FundCmdService.UserInfo;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-15T10:29:26+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
class FundCmdRepoImpl$MapperImpl implements Mapper {

    @Override
    public UserInfo toUserInfo(FundUserPO po) {
        if ( po == null ) {
            return null;
        }

        UserInfo userInfo = new UserInfo();

        userInfo.setUserId( po.getId() );
        userInfo.setAmount( po.getAmount() );

        return userInfo;
    }

    @Override
    public FundUserBalancePO toBalancePo(FundPurchaseCmd cmd) {
        if ( cmd == null ) {
            return null;
        }

        FundUserBalancePO fundUserBalancePO = new FundUserBalancePO();

        fundUserBalancePO.setFundId( cmd.getFundId() );
        fundUserBalancePO.setFundDate( cmd.getFundDate() );
        fundUserBalancePO.setPurchaseAmount( cmd.getPurchaseAmount() );

        return fundUserBalancePO;
    }

    @Override
    public EarningsInfo toEarningsInfo(FundUserBalancePO po) {
        if ( po == null ) {
            return null;
        }

        EarningsInfo earningsInfo = new EarningsInfo();

        earningsInfo.setFundId( po.getFundId() );
        earningsInfo.setBalance( po.getBalance() );

        return earningsInfo;
    }

    @Override
    public UserBalanceInfo toBalanceInfo(FundUserBalancePO po) {
        if ( po == null ) {
            return null;
        }

        UserBalanceInfo userBalanceInfo = new UserBalanceInfo();

        userBalanceInfo.setId( po.getId() );
        userBalanceInfo.setUserId( po.getUserId() );
        userBalanceInfo.setFundId( po.getFundId() );
        userBalanceInfo.setFundDate( po.getFundDate() );
        userBalanceInfo.setLatestDate( po.getLatestDate() );
        userBalanceInfo.setBalance( po.getBalance() );

        return userBalanceInfo;
    }

    @Override
    public FundInfo toFundInfo(FundPO po) {
        if ( po == null ) {
            return null;
        }

        FundInfo fundInfo = new FundInfo();

        fundInfo.setFundCode( po.getFundCode() );
        fundInfo.setFundDate( po.getFundDate() );

        return fundInfo;
    }

    @Override
    public FundHisInfo toFundHisInfo(FundHistoryPO po) {
        if ( po == null ) {
            return null;
        }

        FundHisInfo fundHisInfo = new FundHisInfo();

        fundHisInfo.setFundNav( po.getFundNav() );
        fundHisInfo.setFundDate( po.getFundDate() );

        return fundHisInfo;
    }
}
