package com.codeformas.edu.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "courses", schema = "codeformasdb", catalog = "")
public class CoursesEntity {
    private int idCourse;
    private int idCourseType;
    private String name;
    private String description;
    private double originalPrice;
    private Double newPrice;
    private Double promotion;
    private byte state;
    private Timestamp dateCreate;
    private Timestamp dateUpdate;
    private Collection<CourseContentsEntity> courseContentsByIdCourse;
    private CourseTypesEntity courseTypesByIdCourseType;
    private Collection<DetailCurseAccountsEntity> detailCurseAccountsByIdCourse;

    @Id
    @Column(name = "id_course")
    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    @Basic
    @Column(name = "id_course_type")
    public int getIdCourseType() {
        return idCourseType;
    }

    public void setIdCourseType(int idCourseType) {
        this.idCourseType = idCourseType;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "original_price")
    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    @Basic
    @Column(name = "new_price")
    public Double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Double newPrice) {
        this.newPrice = newPrice;
    }

    @Basic
    @Column(name = "promotion")
    public Double getPromotion() {
        return promotion;
    }

    public void setPromotion(Double promotion) {
        this.promotion = promotion;
    }

    @Basic
    @Column(name = "state")
    public byte getState() {
        return state;
    }

    public void setState(byte state) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoursesEntity that = (CoursesEntity) o;

        if (idCourse != that.idCourse) return false;
        if (idCourseType != that.idCourseType) return false;
        if (Double.compare(that.originalPrice, originalPrice) != 0) return false;
        if (state != that.state) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (newPrice != null ? !newPrice.equals(that.newPrice) : that.newPrice != null) return false;
        if (promotion != null ? !promotion.equals(that.promotion) : that.promotion != null) return false;
        if (dateCreate != null ? !dateCreate.equals(that.dateCreate) : that.dateCreate != null) return false;
        if (dateUpdate != null ? !dateUpdate.equals(that.dateUpdate) : that.dateUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idCourse;
        result = 31 * result + idCourseType;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(originalPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (newPrice != null ? newPrice.hashCode() : 0);
        result = 31 * result + (promotion != null ? promotion.hashCode() : 0);
        result = 31 * result + (int) state;
        result = 31 * result + (dateCreate != null ? dateCreate.hashCode() : 0);
        result = 31 * result + (dateUpdate != null ? dateUpdate.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "coursesByIdCourse")
    public Collection<CourseContentsEntity> getCourseContentsByIdCourse() {
        return courseContentsByIdCourse;
    }

    public void setCourseContentsByIdCourse(Collection<CourseContentsEntity> courseContentsByIdCourse) {
        this.courseContentsByIdCourse = courseContentsByIdCourse;
    }

    @ManyToOne
    @JoinColumn(name = "id_course_type", referencedColumnName = "id_course_type", nullable = true, insertable = false, updatable = false)
    public CourseTypesEntity getCourseTypesByIdCourseType() {
        return courseTypesByIdCourseType;
    }

    public void setCourseTypesByIdCourseType(CourseTypesEntity courseTypesByIdCourseType) {
        this.courseTypesByIdCourseType = courseTypesByIdCourseType;
    }

    @OneToMany(mappedBy = "coursesByCoursesIdCourse")
    public Collection<DetailCurseAccountsEntity> getDetailCurseAccountsByIdCourse() {
        return detailCurseAccountsByIdCourse;
    }

    public void setDetailCurseAccountsByIdCourse(Collection<DetailCurseAccountsEntity> detailCurseAccountsByIdCourse) {
        this.detailCurseAccountsByIdCourse = detailCurseAccountsByIdCourse;
    }
}
