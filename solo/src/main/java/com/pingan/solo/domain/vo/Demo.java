package com.pingan.solo.domain.vo;

import org.springframework.stereotype.Component;

import java.io.Serializable;


@Component
public class Demo implements Serializable  {

    private String sex;

    private String name;

    private HasVo hasVo;
}
