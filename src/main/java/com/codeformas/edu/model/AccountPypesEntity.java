package com.codeformas.edu.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "account_pypes", schema = "codeformasdb", catalog = "")
public class AccountPypesEntity {
    private int idAccountPype;
    private String name;
    private Integer code;
    private Byte state;
    private Collection<AccountsEntity> accountsByIdAccountPype;

    @Id
    @Column(name = "id_account_pype")
    public int getIdAccountPype() {
        return idAccountPype;
    }

    public void setIdAccountPype(int idAccountPype) {
        this.idAccountPype = idAccountPype;
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
    @Column(name = "code")
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Basic
    @Column(name = "state")
    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountPypesEntity that = (AccountPypesEntity) o;

        if (idAccountPype != that.idAccountPype) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAccountPype;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "accountPypesByIdAccountPype")
    public Collection<AccountsEntity> getAccountsByIdAccountPype() {
        return accountsByIdAccountPype;
    }

    public void setAccountsByIdAccountPype(Collection<AccountsEntity> accountsByIdAccountPype) {
        this.accountsByIdAccountPype = accountsByIdAccountPype;
    }
}
