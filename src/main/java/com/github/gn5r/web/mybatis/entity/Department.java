package com.github.gn5r.web.mybatis.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Database Table Remarks:
 *   部署
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table department
 */
public class Department implements Serializable {
    /**
     * Database Column Remarks:
     *   ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   部署名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   登録日
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.create_date
     *
     * @mbg.generated
     */
    private LocalDateTime createDate;

    /**
     * Database Column Remarks:
     *   更新日
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.update_date
     *
     * @mbg.generated
     */
    private LocalDateTime updateDate;

    /**
     * Database Column Remarks:
     *   削除フラグ
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.delete_flag
     *
     * @mbg.generated
     */
    private Boolean deleteFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table department
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.id
     *
     * @return the value of department.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.id
     *
     * @param id the value for department.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.name
     *
     * @return the value of department.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.name
     *
     * @param name the value for department.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.create_date
     *
     * @return the value of department.create_date
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.create_date
     *
     * @param createDate the value for department.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.update_date
     *
     * @return the value of department.update_date
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.update_date
     *
     * @param updateDate the value for department.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.delete_flag
     *
     * @return the value of department.delete_flag
     *
     * @mbg.generated
     */
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.delete_flag
     *
     * @param deleteFlag the value for department.delete_flag
     *
     * @mbg.generated
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Department other = (Department) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append("]");
        return sb.toString();
    }
}