package com.example.redisproject2.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
public class Student implements Serializable{
    private long id;
    private String name;
    private int age;
    private double creditScore;


}
