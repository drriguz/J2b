package com.riguz.jb.model.core.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserToRole<M extends BaseUserToRole<M>> extends Model<M> implements IBean {

	public void setUserToRoleId(java.lang.String userToRoleId) {
		set("USER_TO_ROLE_ID", userToRoleId);
	}

	public java.lang.String getUserToRoleId() {
		return get("USER_TO_ROLE_ID");
	}

	public void setUserId(java.lang.String userId) {
		set("USER_ID", userId);
	}

	public java.lang.String getUserId() {
		return get("USER_ID");
	}

	public void setRoleId(java.lang.String roleId) {
		set("ROLE_ID", roleId);
	}

	public java.lang.String getRoleId() {
		return get("ROLE_ID");
	}

	public void setFromDate(java.util.Date fromDate) {
		set("FROM_DATE", fromDate);
	}

	public java.util.Date getFromDate() {
		return get("FROM_DATE");
	}

	public void setThruDate(java.util.Date thruDate) {
		set("THRU_DATE", thruDate);
	}

	public java.util.Date getThruDate() {
		return get("THRU_DATE");
	}

	public void setCreatedDate(java.util.Date createdDate) {
		set("CREATED_DATE", createdDate);
	}

	public java.util.Date getCreatedDate() {
		return get("CREATED_DATE");
	}

	public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
		set("LAST_UPDATED_DATE", lastUpdatedDate);
	}

	public java.util.Date getLastUpdatedDate() {
		return get("LAST_UPDATED_DATE");
	}

	public String getTableName() {
		return "user_to_role";
	}

}
