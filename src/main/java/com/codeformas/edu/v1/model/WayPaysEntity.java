package com.codeformas.edu.v1.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "way_pays", schema = "codeformasdb", catalog = "")
public class WayPaysEntity {
    private int idWayPay;
    private String creditCard;
    private int idCourseAccount;
    private Timestamp dateCreate;
    private Timestamp dateUpdate;
    private CourseAccountsEntity courseAccountsByIdCourseAccount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_way_pay")
    public int getIdWayPay() {
        return idWayPay;
    }

    public void setIdWayPay(int idWayPay) {
        this.idWayPay = idWayPay;
    }

    @Basic
    @Column(name = "credit_card")
    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @Basic
    @Column(name = "id_course_account")
    public int getIdCourseAccount() {
        return idCourseAccount;
    }

    public void setIdCourseAccount(int idCourseAccount) {
        this.idCourseAccount = idCourseAccount;
    }

    @Basic
    @Column(name = "date_create")
    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Basic
    @Column(name = "date_update")
    public Timestamp getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Timestamp dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WayPaysEntity that = (WayPaysEntity) o;

        if (idWayPay != that.idWayPay) return false;
        if (idCourseAccount != that.idCourseAccount) return false;
        if (creditCard != null ? !creditCard.equals(that.creditCard) : that.creditCard != null) return false;
        if (dateCreate != null ? !dateCreate.equals(that.dateCreate) : that.dateCreate != null) return false;
        if (dateUpdate != null ? !dateUpdate.equals(that.dateUpdate) : that.dateUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idWayPay;
        result = 31 * result + (creditCard != null ? creditCard.hashCode() : 0);
        result = 31 * result + idCourseAccount;
        result = 31 * result + (dateCreate != null ? dateCreate.hashCode() : 0);
        result = 31 * result + (dateUpdate != null ? dateUpdate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_course_account", referencedColumnName = "id_course_account", nullable = false, insertable = false, updatable = false)
    public CourseAccountsEntity getCourseAccountsByIdCourseAccount() {
        return courseAccountsByIdCourseAccount;
    }

    public void setCourseAccountsByIdCourseAccount(CourseAccountsEntity courseAccountsByIdCourseAccount) {
        this.courseAccountsByIdCourseAccount = courseAccountsByIdCourseAccount;
    }
}
