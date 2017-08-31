package com.blw.entity;

import javax.persistence.*;

@Table(name = "test_order")
public class TestOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "test_ordercol")
    private String testOrdercol;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return test_ordercol
     */
    public String getTestOrdercol() {
        return testOrdercol;
    }

    /**
     * @param testOrdercol
     */
    public void setTestOrdercol(String testOrdercol) {
        this.testOrdercol = testOrdercol == null ? null : testOrdercol.trim();
    }
}