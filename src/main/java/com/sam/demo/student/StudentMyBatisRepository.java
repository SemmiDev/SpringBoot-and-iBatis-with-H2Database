package com.sam.demo.student;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMyBatisRepository {

    @Select("select * from student")
    public List<Student> findAll();

    @Select("SELECT * FROM student WHERE id = #{id}")
    public Student findById(long id);

    @Delete("DELETE FROM student where id = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO student(id, name, nisn) VALUES (#{id}, #{name}, #{nisn})")
    public int insert(Student student);


    @Update("Update student set name=#{name}, nisn=#{nisn} where id=#{id}")
    public int update(Student student);

}
