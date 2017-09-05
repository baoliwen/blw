package com.blw.entity;

import javax.persistence.*;

@Table(name = "test_order")
public class TestOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "test_ordercol")
    private String testOrdercol;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
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