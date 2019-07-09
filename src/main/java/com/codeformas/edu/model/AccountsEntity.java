package com.codeformas.edu.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "Accounts", schema = "codeformasdb", catalog = "")
public class AccountsEntity {
    private int idAccount;
    private String name;
    private String email;
    private String phone;
    private String celPhone;
    private String user;
    private String password;
    private Timestamp dateCreate;
    private Timestamp dateUpdate;
    private byte state;
    private int idAccountType;
    private AccountTypesEntity accountTypesByIdAccountType;
    private Collection<CourseAccountsEntity> courseAccountsByIdAccount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
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
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "cel_phone")
    public String getCelPhone() {
        return celPhone;
    }

    public void setCelPhone(String celPhone) {
        this.celPhone = celPhone;
    }

    @Basic
    @Column(name = "user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    @Column(name = "state")
    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    @Basic
    @Column(name = "id_account_type")
    public int getIdAccountType() {
        return idAccountType;
    }

    public void setIdAccountType(int idAccountType) {
        this.idAccountType = idAccountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountsEntity that = (AccountsEntity) o;

        if (idAccount != that.idAccount) return false;
        if (state != that.state) return false;
        if (idAccountType != that.idAccountType) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (celPhone != null ? !celPhone.equals(that.celPhone) : that.celPhone != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (dateCreate != null ? !dateCreate.equals(that.dateCreate) : that.dateCreate != null) return false;
        if (dateUpdate != null ? !dateUpdate.equals(that.dateUpdate) : that.dateUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAccount;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (celPhone != null ? celPhone.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (dateCreate != null ? dateCreate.hashCode() : 0);
        result = 31 * result + (dateUpdate != null ? dateUpdate.hashCode() : 0);
        result = 31 * result + (int) state;
        result = 31 * result + idAccountType;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_account_type", referencedColumnName = "id_account_type", nullable = true, insertable = false, updatable = false)
    public AccountTypesEntity getAccountTypesByIdAccountType() {
        return accountTypesByIdAccountType;
    }

    public void setAccountTypesByIdAccountType(AccountTypesEntity accountTypesByIdAccountType) {
        this.accountTypesByIdAccountType = accountTypesByIdAccountType;
    }

    @OneToMany(mappedBy = "accountsByIdAccount")
    public Collection<CourseAccountsEntity> getCourseAccountsByIdAccount() {
        return courseAccountsByIdAccount;
    }

    public void setCourseAccountsByIdAccount(Collection<CourseAccountsEntity> courseAccountsByIdAccount) {
        this.courseAccountsByIdAccount = courseAccountsByIdAccount;
    }
}
