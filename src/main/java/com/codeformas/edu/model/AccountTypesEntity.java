package com.codeformas.edu.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "account_types", schema = "codeformasdb", catalog = "")
public class AccountTypesEntity {
    private int idAccountType = 2;
    private String name;
    private Integer code;
    private Byte state;

    @ApiModelProperty(required = false, hidden = true)
    private Collection<AccountsEntity> accountsByIdAccountType;

    @Id
    @Column(name = "id_account_type", updatable = false, nullable = false)
    public int getIdAccountType() {
        return idAccountType;
    }

    public void setIdAccountType(int idAccountType) {
        this.idAccountType = idAccountType;
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

        AccountTypesEntity that = (AccountTypesEntity) o;

        if (idAccountType != that.idAccountType) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAccountType;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "accountTypesByIdAccountType", cascade = {CascadeType.ALL},fetch= FetchType.EAGER)
    public Collection<AccountsEntity> getAccountsByIdAccountType() {
        return accountsByIdAccountType;
    }

    public void setAccountsByIdAccountType(Collection<AccountsEntity> accountsByIdAccountType) {
        this.accountsByIdAccountType = accountsByIdAccountType;
    }
}
