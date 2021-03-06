package com.wangzifeng.mysqlboot.login.model;

import java.util.Date;

public class TbUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.idcard
     *
     * @mbggenerated
     */
    private String idcard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.psw
     *
     * @mbggenerated
     */
    private String psw;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.removed
     *
     * @mbggenerated
     */
    private String removed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.createdate
     *
     * @mbggenerated
     */
    private Date createdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated
     */
    public TbUser(String id, String name, String idcard, String psw, String removed, Date createdate) {
        this.id = id;
        this.name = name;
        this.idcard = idcard;
        this.psw = psw;
        this.removed = removed;
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.id
     *
     * @return the value of tb_user.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.name
     *
     * @return the value of tb_user.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.idcard
     *
     * @return the value of tb_user.idcard
     *
     * @mbggenerated
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.psw
     *
     * @return the value of tb_user.psw
     *
     * @mbggenerated
     */
    public String getPsw() {
        return psw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.removed
     *
     * @return the value of tb_user.removed
     *
     * @mbggenerated
     */
    public String getRemoved() {
        return removed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.createdate
     *
     * @return the value of tb_user.createdate
     *
     * @mbggenerated
     */
    public Date getCreatedate() {
        return createdate;
    }
}