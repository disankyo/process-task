package com.tigerye.process.service.pipeline.po;

import java.util.Date;

public class ProcessLogPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_log.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_log.pid
     *
     * @mbg.generated
     */
    private Long pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_log.ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_log.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_log.is_deleted
     *
     * @mbg.generated
     */
    private Byte isDeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_log.id
     *
     * @return the value of process_log.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_log.id
     *
     * @param id the value for process_log.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_log.pid
     *
     * @return the value of process_log.pid
     *
     * @mbg.generated
     */
    public Long getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_log.pid
     *
     * @param pid the value for process_log.pid
     *
     * @mbg.generated
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_log.ip
     *
     * @return the value of process_log.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_log.ip
     *
     * @param ip the value for process_log.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_log.create_time
     *
     * @return the value of process_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_log.create_time
     *
     * @param createTime the value for process_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_log.update_time
     *
     * @return the value of process_log.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_log.update_time
     *
     * @param updateTime the value for process_log.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_log.is_deleted
     *
     * @return the value of process_log.is_deleted
     *
     * @mbg.generated
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_log.is_deleted
     *
     * @param isDeleted the value for process_log.is_deleted
     *
     * @mbg.generated
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}