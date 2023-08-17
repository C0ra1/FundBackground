package com.fund.service;

import com.fund.dto.cmd.UserRegisterCmd;
import com.fund.service.UserCmdService.Mapper;
import com.fund.service.UserCmdService.UserInfo;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-15T10:29:24+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
class UserCmdService$MapperImpl implements Mapper {

    @Override
    public UserInfo toInfo(UserRegisterCmd cmd) {
        if ( cmd == null ) {
            return null;
        }

        UserInfo userInfo = new UserInfo();

        userInfo.setName( cmd.getName() );
        userInfo.setPhoneNumber( cmd.getPhoneNumber() );

        return userInfo;
    }
}
