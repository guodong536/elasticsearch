package com.pingan.solo.domain.vo;

import java.io.Serializable;
import java.util.Date;


public class HasVo implements Serializable {

    private String userName;

    private Integer age;

    private String roleCode;

    private Date createDate;

    public HasVo() {
    }

    public HasVo(Integer age, String roleCode) {
        this.age = age;
        this.roleCode = roleCode;
    }
}
