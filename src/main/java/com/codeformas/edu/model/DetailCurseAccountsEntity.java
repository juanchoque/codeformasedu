package com.codeformas.edu.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "detail_curse_accounts", schema = "codeformasdb", catalog = "")
public class DetailCurseAccountsEntity {
    private int idDetailCurseAccount;
    private Double price;
    private String details;
    private Byte state;
    private Timestamp dateCreate;
    private Timestamp dateUpdate;
    private int idCourseAccount;
    private int coursesIdCourse;
    private CourseAccountsEntity courseAccountsByIdCourseAccount;
    private CoursesEntity coursesByCoursesIdCourse;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail_curse_account")
    public int getIdDetailCurseAccount() {
        return idDetailCurseAccount;
    }

    public void setIdDetailCurseAccount(int idDetailCurseAccount) {
        this.idDetailCurseAccount = idDetailCurseAccount;
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
    @Column(name = "details")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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

    @Basic
    @Column(name = "id_course_account")
    public int getIdCourseAccount() {
        return idCourseAccount;
    }

    public void setIdCourseAccount(int idCourseAccount) {
        this.idCourseAccount = idCourseAccount;
    }

    @Basic
    @Column(name = "courses_id_course")
    public int getCoursesIdCourse() {
        return coursesIdCourse;
    }

    public void setCoursesIdCourse(int coursesIdCourse) {
        this.coursesIdCourse = coursesIdCourse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DetailCurseAccountsEntity that = (DetailCurseAccountsEntity) o;

        if (idDetailCurseAccount != that.idDetailCurseAccount) return false;
        if (idCourseAccount != that.idCourseAccount) return false;
        if (coursesIdCourse != that.coursesIdCourse) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (details != null ? !details.equals(that.details) : that.details != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (dateCreate != null ? !dateCreate.equals(that.dateCreate) : that.dateCreate != null) return false;
        if (dateUpdate != null ? !dateUpdate.equals(that.dateUpdate) : that.dateUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDetailCurseAccount;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (dateCreate != null ? dateCreate.hashCode() : 0);
        result = 31 * result + (dateUpdate != null ? dateUpdate.hashCode() : 0);
        result = 31 * result + idCourseAccount;
        result = 31 * result + coursesIdCourse;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_course_account", referencedColumnName = "id_course_account", nullable = true, insertable = false, updatable = false)
    public CourseAccountsEntity getCourseAccountsByIdCourseAccount() {
        return courseAccountsByIdCourseAccount;
    }

    public void setCourseAccountsByIdCourseAccount(CourseAccountsEntity courseAccountsByIdCourseAccount) {
        this.courseAccountsByIdCourseAccount = courseAccountsByIdCourseAccount;
    }

    @ManyToOne
    @JoinColumn(name = "courses_id_course", referencedColumnName = "id_course", nullable = true, insertable = false, updatable = false)
    public CoursesEntity getCoursesByCoursesIdCourse() {
        return coursesByCoursesIdCourse;
    }

    public void setCoursesByCoursesIdCourse(CoursesEntity coursesByCoursesIdCourse) {
        this.coursesByCoursesIdCourse = coursesByCoursesIdCourse;
    }
}
