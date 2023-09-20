package com.group.letscoding.Domain.StudyPost;

import javax.persistence.*;
import java.util.Date;

@Entity
public class StudyPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column
    private String topic;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String user_id;

    @Column
    private Date start_date;

    @Column
    private Date end_date;

    @Column(nullable = false)
    private Date createDate;
}
