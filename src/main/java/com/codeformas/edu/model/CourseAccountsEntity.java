package com.codeformas.edu.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "course_accounts", schema = "codeformasdb", catalog = "")
public class CourseAccountsEntity {
    private int idCourseAccount;
    private Double price;
    private Byte state;
    private int idAccount;
    private Timestamp dateCreate;
    private Timestamp dateUpdate;
    private AccountsEntity accountsByIdAccount;
    private Collection<DetailCurseAccountsEntity> detailCurseAccountsByIdCourseAccount;
    private Collection<WayPaysEntity> wayPaysByIdCourseAccount;

    @Id
    @Column(name = "id_course_account")
    public int getIdCourseAccount() {
        return idCourseAccount;
    }

    public void setIdCourseAccount(int idCourseAccount) {
        this.idCourseAccount = idCourseAccount;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "state")
    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Basic
    @Column(name = "id_account")
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
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

        CourseAccountsEntity that = (CourseAccountsEntity) o;

        if (idCourseAccount != that.idCourseAccount) return false;
        if (idAccount != that.idAccount) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (dateCreate != null ? !dateCreate.equals(that.dateCreate) : that.dateCreate != null) return false;
        if (dateUpdate != null ? !dateUpdate.equals(that.dateUpdate) : that.dateUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCourseAccount;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + idAccount;
        result = 31 * result + (dateCreate != null ? dateCreate.hashCode() : 0);
        result = 31 * result + (dateUpdate != null ? dateUpdate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_account", referencedColumnName = "id_account", nullable = false, insertable = false, updatable = false)
    public AccountsEntity getAccountsByIdAccount() {
        return accountsByIdAccount;
    }

    public void setAccountsByIdAccount(AccountsEntity accountsByIdAccount) {
        this.accountsByIdAccount = accountsByIdAccount;
    }

    @OneToMany(mappedBy = "courseAccountsByIdCourseAccount")
    public Collection<DetailCurseAccountsEntity> getDetailCurseAccountsByIdCourseAccount() {
        return detailCurseAccountsByIdCourseAccount;
    }

    public void setDetailCurseAccountsByIdCourseAccount(Collection<DetailCurseAccountsEntity> detailCurseAccountsByIdCourseAccount) {
        this.detailCurseAccountsByIdCourseAccount = detailCurseAccountsByIdCourseAccount;
    }

    @OneToMany(mappedBy = "courseAccountsByIdCourseAccount")
    public Collection<WayPaysEntity> getWayPaysByIdCourseAccount() {
        return wayPaysByIdCourseAccount;
    }

    public void setWayPaysByIdCourseAccount(Collection<WayPaysEntity> wayPaysByIdCourseAccount) {
        this.wayPaysByIdCourseAccount = wayPaysByIdCourseAccount;
    }
}
