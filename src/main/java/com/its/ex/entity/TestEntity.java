package com.its.ex.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "test_table")
public class TestEntity {
    @Id// pk 로지정하는 어노테이션
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment 를 준다.
    @Column(name = "test_id") // 컬럼의 이름을 지정해줄수있다.
    private Long id;

    @Column(name = "test_column1", length = 50) // 일반컬럼을 정의 길이지정가능
    private String Column1;

    @Column(unique = true) // unique 를 줄수있다.
    private String testColumn2;

}
