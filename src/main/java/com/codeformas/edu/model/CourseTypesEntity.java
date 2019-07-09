package com.codeformas.edu.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "course_types", schema = "codeformasdb", catalog = "")
public class CourseTypesEntity {
    private int idCourseType;
    private String name;
    private String state;
    private Collection<CoursesEntity> coursesByIdCourseType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseTypesEntity that = (CourseTypesEntity) o;

        if (idCourseType != that.idCourseType) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCourseType;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "courseTypesByIdCourseType")
    public Collection<CoursesEntity> getCoursesByIdCourseType() {
        return coursesByIdCourseType;
    }

    public void setCoursesByIdCourseType(Collection<CoursesEntity> coursesByIdCourseType) {
        this.coursesByIdCourseType = coursesByIdCourseType;
    }
}
