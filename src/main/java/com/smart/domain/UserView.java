package com.smart.domain;

public class UserView {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_view.user_id
     *
     * @mbg.generated Wed Oct 23 15:03:05 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_view.view_id
     *
     * @mbg.generated Wed Oct 23 15:03:05 CST 2019
     */
    private Long viewId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_view.user_id
     *
     * @return the value of user_view.user_id
     *
     * @mbg.generated Wed Oct 23 15:03:05 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_view.user_id
     *
     * @param userId the value for user_view.user_id
     *
     * @mbg.generated Wed Oct 23 15:03:05 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_view.view_id
     *
     * @return the value of user_view.view_id
     *
     * @mbg.generated Wed Oct 23 15:03:05 CST 2019
     */
    public Long getViewId() {
        return viewId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_view.view_id
     *
     * @param viewId the value for user_view.view_id
     *
     * @mbg.generated Wed Oct 23 15:03:05 CST 2019
     */
    public void setViewId(Long viewId) {
        this.viewId = viewId;
    }
}