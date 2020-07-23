package com.sam.demo.student;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private String id;
    private String name;
    private String nisn;

    public Student(String name, String nisn){
        super();
        this.name = name;
        this.nisn = nisn;
    }
}
