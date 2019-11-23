package com.ppg.redisdemo.domain;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@DynamicUpdate //只更新修改过的字段
public class User {

    @Id
    private String userId ;

    private String username;

    private String phoneNum;


}
