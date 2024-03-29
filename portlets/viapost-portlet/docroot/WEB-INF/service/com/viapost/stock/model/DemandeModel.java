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

package com.viapost.stock.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Demande service. Represents a row in the &quot;Viapost_Demande&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.viapost.stock.model.impl.DemandeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.viapost.stock.model.impl.DemandeImpl}.
 * </p>
 *
 * @author pif
 * @see Demande
 * @see com.viapost.stock.model.impl.DemandeImpl
 * @see com.viapost.stock.model.impl.DemandeModelImpl
 * @generated
 */
public interface DemandeModel extends BaseModel<Demande> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a demande model instance should use the {@link Demande} interface instead.
	 */

	/**
	 * Returns the primary key of this demande.
	 *
	 * @return the primary key of this demande
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this demande.
	 *
	 * @param primaryKey the primary key of this demande
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the demande ID of this demande.
	 *
	 * @return the demande ID of this demande
	 */
	public long getDemandeId();

	/**
	 * Sets the demande ID of this demande.
	 *
	 * @param demandeId the demande ID of this demande
	 */
	public void setDemandeId(long demandeId);

	/**
	 * Returns the question of this demande.
	 *
	 * @return the question of this demande
	 */
	@AutoEscape
	public String getQuestion();

	/**
	 * Sets the question of this demande.
	 *
	 * @param question the question of this demande
	 */
	public void setQuestion(String question);

	/**
	 * Returns the request of this demande.
	 *
	 * @return the request of this demande
	 */
	@AutoEscape
	public String getRequest();

	/**
	 * Sets the request of this demande.
	 *
	 * @param request the request of this demande
	 */
	public void setRequest(String request);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Demande demande);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Demande> toCacheModel();

	@Override
	public Demande toEscapedModel();

	@Override
	public Demande toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}