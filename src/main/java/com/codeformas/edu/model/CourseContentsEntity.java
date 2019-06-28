package com.codeformas.edu.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "course_contents", schema = "codeformasdb", catalog = "")
public class CourseContentsEntity {
    private int idCourseContent;
    private int idCourse;
    private String description;
    private String urlFile;
    private String urlVideo;
    private Byte state;
    private Timestamp dateCreate;
    private Timestamp dateUpdate;
    private CoursesEntity coursesByIdCourse;

    @Id
    @Column(name = "id_course_content")
    public int getIdCourseContent() {
        return idCourseContent;
    }

    public void setIdCourseContent(int idCourseContent) {
        this.idCourseContent = idCourseContent;
    }

    @Basic
    @Column(name = "id_course")
    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
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
    @Column(name = "url_file")
    public String getUrlFile() {
        return urlFile;
    }

    public void setUrlFile(String urlFile) {
        this.urlFile = urlFile;
    }

    @Basic
    @Column(name = "url_video")
    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseContentsEntity that = (CourseContentsEntity) o;

        if (idCourseContent != that.idCourseContent) return false;
        if (idCourse != that.idCourse) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (urlFile != null ? !urlFile.equals(that.urlFile) : that.urlFile != null) return false;
        if (urlVideo != null ? !urlVideo.equals(that.urlVideo) : that.urlVideo != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (dateCreate != null ? !dateCreate.equals(that.dateCreate) : that.dateCreate != null) return false;
        if (dateUpdate != null ? !dateUpdate.equals(that.dateUpdate) : that.dateUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCourseContent;
        result = 31 * result + idCourse;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (urlFile != null ? urlFile.hashCode() : 0);
        result = 31 * result + (urlVideo != null ? urlVideo.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (dateCreate != null ? dateCreate.hashCode() : 0);
        result = 31 * result + (dateUpdate != null ? dateUpdate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_course", referencedColumnName = "id_course", nullable = true, insertable = false, updatable = false)
    public CoursesEntity getCoursesByIdCourse() {
        return coursesByIdCourse;
    }

    public void setCoursesByIdCourse(CoursesEntity coursesByIdCourse) {
        this.coursesByIdCourse = coursesByIdCourse;
    }
}
