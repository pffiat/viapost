/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.viapost.stock.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.viapost.stock.model.UserDemande;
import com.viapost.stock.model.UserDemandeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the UserDemande service. Represents a row in the &quot;Viapost_UserDemande&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.viapost.stock.model.UserDemandeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserDemandeImpl}.
 * </p>
 *
 * @author pif
 * @see UserDemandeImpl
 * @see com.viapost.stock.model.UserDemande
 * @see com.viapost.stock.model.UserDemandeModel
 * @generated
 */
public class UserDemandeModelImpl extends BaseModelImpl<UserDemande>
	implements UserDemandeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user demande model instance should use the {@link com.viapost.stock.model.UserDemande} interface instead.
	 */
	public static final String TABLE_NAME = "Viapost_UserDemande";
	public static final Object[][] TABLE_COLUMNS = {
			{ "userDemandeId", Types.BIGINT },
			{ "demandeId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "date_", Types.TIMESTAMP },
			{ "origine", Types.VARCHAR },
			{ "article", Types.BIGINT },
			{ "resourcePrimaryKey", Types.BIGINT },
			{ "title", Types.VARCHAR },
			{ "status", Types.INTEGER },
			{ "statusByUserId", Types.BIGINT },
			{ "statusByUserName", Types.VARCHAR },
			{ "statusByDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table Viapost_UserDemande (userDemandeId LONG not null primary key,demandeId LONG,userId LONG,companyId LONG,groupId LONG,date_ DATE null,origine VARCHAR(75) null,article LONG,resourcePrimaryKey LONG,title VARCHAR(75) null,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(75) null,statusByDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Viapost_UserDemande";
	public static final String ORDER_BY_JPQL = " ORDER BY userDemande.userDemandeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Viapost_UserDemande.userDemandeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.viapost.stock.model.UserDemande"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.viapost.stock.model.UserDemande"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.viapost.stock.model.UserDemande"),
			true);
	public static long RESOURCEPRIMARYKEY_COLUMN_BITMASK = 1L;
	public static long STATUS_COLUMN_BITMASK = 2L;
	public static long USERID_COLUMN_BITMASK = 4L;
	public static long USERDEMANDEID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.viapost.stock.model.UserDemande"));

	public UserDemandeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _userDemandeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserDemandeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userDemandeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return UserDemande.class;
	}

	@Override
	public String getModelClassName() {
		return UserDemande.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userDemandeId", getUserDemandeId());
		attributes.put("demandeId", getDemandeId());
		attributes.put("userId", getUserId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("date", getDate());
		attributes.put("origine", getOrigine());
		attributes.put("article", getArticle());
		attributes.put("resourcePrimaryKey", getResourcePrimaryKey());
		attributes.put("title", getTitle());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusByDate", getStatusByDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userDemandeId = (Long)attributes.get("userDemandeId");

		if (userDemandeId != null) {
			setUserDemandeId(userDemandeId);
		}

		Long demandeId = (Long)attributes.get("demandeId");

		if (demandeId != null) {
			setDemandeId(demandeId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String origine = (String)attributes.get("origine");

		if (origine != null) {
			setOrigine(origine);
		}

		Long article = (Long)attributes.get("article");

		if (article != null) {
			setArticle(article);
		}

		Long resourcePrimaryKey = (Long)attributes.get("resourcePrimaryKey");

		if (resourcePrimaryKey != null) {
			setResourcePrimaryKey(resourcePrimaryKey);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusByDate = (Date)attributes.get("statusByDate");

		if (statusByDate != null) {
			setStatusByDate(statusByDate);
		}
	}

	@Override
	public long getUserDemandeId() {
		return _userDemandeId;
	}

	@Override
	public void setUserDemandeId(long userDemandeId) {
		_userDemandeId = userDemandeId;
	}

	@Override
	public long getDemandeId() {
		return _demandeId;
	}

	@Override
	public void setDemandeId(long demandeId) {
		_demandeId = demandeId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public Date getDate() {
		return _date;
	}

	@Override
	public void setDate(Date date) {
		_date = date;
	}

	@Override
	public String getOrigine() {
		if (_origine == null) {
			return StringPool.BLANK;
		}
		else {
			return _origine;
		}
	}

	@Override
	public void setOrigine(String origine) {
		_origine = origine;
	}

	@Override
	public long getArticle() {
		return _article;
	}

	@Override
	public void setArticle(long article) {
		_article = article;
	}

	@Override
	public long getResourcePrimaryKey() {
		return _resourcePrimaryKey;
	}

	@Override
	public void setResourcePrimaryKey(long resourcePrimaryKey) {
		_columnBitmask |= RESOURCEPRIMARYKEY_COLUMN_BITMASK;

		if (!_setOriginalResourcePrimaryKey) {
			_setOriginalResourcePrimaryKey = true;

			_originalResourcePrimaryKey = _resourcePrimaryKey;
		}

		_resourcePrimaryKey = resourcePrimaryKey;
	}

	public long getOriginalResourcePrimaryKey() {
		return _originalResourcePrimaryKey;
	}

	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	@Override
	public String getStatusByUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getStatusByUserId(), "uuid",
			_statusByUserUuid);
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_statusByUserUuid = statusByUserUuid;
	}

	@Override
	public String getStatusByUserName() {
		if (_statusByUserName == null) {
			return StringPool.BLANK;
		}
		else {
			return _statusByUserName;
		}
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	@Override
	public Date getStatusByDate() {
		return _statusByDate;
	}

	@Override
	public void setStatusByDate(Date statusByDate) {
		_statusByDate = statusByDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			UserDemande.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public UserDemande toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (UserDemande)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserDemandeImpl userDemandeImpl = new UserDemandeImpl();

		userDemandeImpl.setUserDemandeId(getUserDemandeId());
		userDemandeImpl.setDemandeId(getDemandeId());
		userDemandeImpl.setUserId(getUserId());
		userDemandeImpl.setCompanyId(getCompanyId());
		userDemandeImpl.setGroupId(getGroupId());
		userDemandeImpl.setDate(getDate());
		userDemandeImpl.setOrigine(getOrigine());
		userDemandeImpl.setArticle(getArticle());
		userDemandeImpl.setResourcePrimaryKey(getResourcePrimaryKey());
		userDemandeImpl.setTitle(getTitle());
		userDemandeImpl.setStatus(getStatus());
		userDemandeImpl.setStatusByUserId(getStatusByUserId());
		userDemandeImpl.setStatusByUserName(getStatusByUserName());
		userDemandeImpl.setStatusByDate(getStatusByDate());

		userDemandeImpl.resetOriginalValues();

		return userDemandeImpl;
	}

	@Override
	public int compareTo(UserDemande userDemande) {
		long primaryKey = userDemande.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserDemande)) {
			return false;
		}

		UserDemande userDemande = (UserDemande)obj;

		long primaryKey = userDemande.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		UserDemandeModelImpl userDemandeModelImpl = this;

		userDemandeModelImpl._originalUserId = userDemandeModelImpl._userId;

		userDemandeModelImpl._setOriginalUserId = false;

		userDemandeModelImpl._originalResourcePrimaryKey = userDemandeModelImpl._resourcePrimaryKey;

		userDemandeModelImpl._setOriginalResourcePrimaryKey = false;

		userDemandeModelImpl._originalStatus = userDemandeModelImpl._status;

		userDemandeModelImpl._setOriginalStatus = false;

		userDemandeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<UserDemande> toCacheModel() {
		UserDemandeCacheModel userDemandeCacheModel = new UserDemandeCacheModel();

		userDemandeCacheModel.userDemandeId = getUserDemandeId();

		userDemandeCacheModel.demandeId = getDemandeId();

		userDemandeCacheModel.userId = getUserId();

		userDemandeCacheModel.companyId = getCompanyId();

		userDemandeCacheModel.groupId = getGroupId();

		Date date = getDate();

		if (date != null) {
			userDemandeCacheModel.date = date.getTime();
		}
		else {
			userDemandeCacheModel.date = Long.MIN_VALUE;
		}

		userDemandeCacheModel.origine = getOrigine();

		String origine = userDemandeCacheModel.origine;

		if ((origine != null) && (origine.length() == 0)) {
			userDemandeCacheModel.origine = null;
		}

		userDemandeCacheModel.article = getArticle();

		userDemandeCacheModel.resourcePrimaryKey = getResourcePrimaryKey();

		userDemandeCacheModel.title = getTitle();

		String title = userDemandeCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			userDemandeCacheModel.title = null;
		}

		userDemandeCacheModel.status = getStatus();

		userDemandeCacheModel.statusByUserId = getStatusByUserId();

		userDemandeCacheModel.statusByUserName = getStatusByUserName();

		String statusByUserName = userDemandeCacheModel.statusByUserName;

		if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
			userDemandeCacheModel.statusByUserName = null;
		}

		Date statusByDate = getStatusByDate();

		if (statusByDate != null) {
			userDemandeCacheModel.statusByDate = statusByDate.getTime();
		}
		else {
			userDemandeCacheModel.statusByDate = Long.MIN_VALUE;
		}

		return userDemandeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{userDemandeId=");
		sb.append(getUserDemandeId());
		sb.append(", demandeId=");
		sb.append(getDemandeId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", date=");
		sb.append(getDate());
		sb.append(", origine=");
		sb.append(getOrigine());
		sb.append(", article=");
		sb.append(getArticle());
		sb.append(", resourcePrimaryKey=");
		sb.append(getResourcePrimaryKey());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusByUserName=");
		sb.append(getStatusByUserName());
		sb.append(", statusByDate=");
		sb.append(getStatusByDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.viapost.stock.model.UserDemande");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userDemandeId</column-name><column-value><![CDATA[");
		sb.append(getUserDemandeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>demandeId</column-name><column-value><![CDATA[");
		sb.append(getDemandeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>origine</column-name><column-value><![CDATA[");
		sb.append(getOrigine());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>article</column-name><column-value><![CDATA[");
		sb.append(getArticle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resourcePrimaryKey</column-name><column-value><![CDATA[");
		sb.append(getResourcePrimaryKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByDate</column-name><column-value><![CDATA[");
		sb.append(getStatusByDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = UserDemande.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			UserDemande.class
		};
	private long _userDemandeId;
	private long _demandeId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _companyId;
	private long _groupId;
	private Date _date;
	private String _origine;
	private long _article;
	private long _resourcePrimaryKey;
	private long _originalResourcePrimaryKey;
	private boolean _setOriginalResourcePrimaryKey;
	private String _title;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _statusByUserId;
	private String _statusByUserUuid;
	private String _statusByUserName;
	private Date _statusByDate;
	private long _columnBitmask;
	private UserDemande _escapedModel;
}