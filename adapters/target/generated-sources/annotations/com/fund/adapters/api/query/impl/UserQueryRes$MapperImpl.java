package com.fund.adapters.api.query.impl;

import com.fund.adapters.api.query.impl.UserQueryRes.Mapper;
import com.fund.infras.dao.entity.resp.UserResp;
import com.fund.infras.dao.model.FundUserPO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-15T10:29:30+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
class UserQueryRes$MapperImpl implements Mapper {

    @Override
    public UserResp toResp(FundUserPO po) {
        if ( po == null ) {
            return null;
        }

        UserResp userResp = new UserResp();

        userResp.setId( po.getId() );
        userResp.setName( po.getName() );
        userResp.setHeadImgUrl( po.getHeadImgUrl() );
        userResp.setPhoneNumber( po.getPhoneNumber() );
        userResp.setUtcCreate( po.getUtcCreate() );
        userResp.setAmount( po.getAmount() );

        return userResp;
    }
}
