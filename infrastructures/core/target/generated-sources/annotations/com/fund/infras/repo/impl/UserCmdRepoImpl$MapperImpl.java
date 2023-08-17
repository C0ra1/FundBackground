package com.fund.infras.repo.impl;

import com.fund.dto.cmd.UserUpdateCmd;
import com.fund.infras.dao.model.FundAccountPO;
import com.fund.infras.dao.model.FundUserPO;
import com.fund.infras.repo.impl.UserCmdRepoImpl.Mapper;
import com.fund.service.UserCmdService.AccountInfo;
import com.fund.service.UserCmdService.UserInfo;
import com.fund.vo.UserInfoResp;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-15T10:29:26+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
class UserCmdRepoImpl$MapperImpl implements Mapper {

    @Override
    public FundUserPO toUserPo(UserInfo userInfo) {
        if ( userInfo == null ) {
            return null;
        }

        FundUserPO fundUserPO = new FundUserPO();

        fundUserPO.setId( userInfo.getId() );
        if ( userInfo.getState() != null ) {
            fundUserPO.setState( userInfo.getState() );
        }
        fundUserPO.setName( userInfo.getName() );
        fundUserPO.setPhoneNumber( userInfo.getPhoneNumber() );
        fundUserPO.setPassword( userInfo.getPassword() );

        return fundUserPO;
    }

    @Override
    public FundAccountPO toAccPo(AccountInfo accountInfo) {
        if ( accountInfo == null ) {
            return null;
        }

        FundAccountPO fundAccountPO = new FundAccountPO();

        fundAccountPO.setId( accountInfo.getId() );
        fundAccountPO.setUserId( accountInfo.getUserId() );
        fundAccountPO.setOpenCode( accountInfo.getOpenCode() );
        fundAccountPO.setCategory( accountInfo.getCategory() );

        return fundAccountPO;
    }

    @Override
    public UserInfoResp toResp(FundUserPO po) {
        if ( po == null ) {
            return null;
        }

        UserInfoResp userInfoResp = new UserInfoResp();

        userInfoResp.setId( po.getId() );
        userInfoResp.setName( po.getName() );
        userInfoResp.setHeadImgUrl( po.getHeadImgUrl() );
        userInfoResp.setToken( po.getToken() );

        return userInfoResp;
    }

    @Override
    public FundUserPO updateCmdtoUserPo(UserUpdateCmd cmd) {
        if ( cmd == null ) {
            return null;
        }

        FundUserPO fundUserPO = new FundUserPO();

        fundUserPO.setId( cmd.getId() );
        fundUserPO.setName( cmd.getName() );
        fundUserPO.setPhoneNumber( cmd.getPhoneNumber() );

        return fundUserPO;
    }
}
