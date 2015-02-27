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
 * The base model interface for the EtapeDemande service. Represents a row in the &quot;Viapost_EtapeDemande&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.viapost.stock.model.impl.EtapeDemandeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.viapost.stock.model.impl.EtapeDemandeImpl}.
 * </p>
 *
 * @author pif
 * @see EtapeDemande
 * @see com.viapost.stock.model.impl.EtapeDemandeImpl
 * @see com.viapost.stock.model.impl.EtapeDemandeModelImpl
 * @generated
 */
public interface EtapeDemandeModel extends BaseModel<EtapeDemande> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a etape demande model instance should use the {@link EtapeDemande} interface instead.
	 */

	/**
	 * Returns the primary key of this etape demande.
	 *
	 * @return the primary key of this etape demande
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this etape demande.
	 *
	 * @param primaryKey the primary key of this etape demande
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the etape ID of this etape demande.
	 *
	 * @return the etape ID of this etape demande
	 */
	public long getEtapeId();

	/**
	 * Sets the etape ID of this etape demande.
	 *
	 * @param etapeId the etape ID of this etape demande
	 */
	public void setEtapeId(long etapeId);

	/**
	 * Returns the demande ID of this etape demande.
	 *
	 * @return the demande ID of this etape demande
	 */
	public long getDemandeId();

	/**
	 * Sets the demande ID of this etape demande.
	 *
	 * @param demandeId the demande ID of this etape demande
	 */
	public void setDemandeId(long demandeId);

	/**
	 * Returns the decription of this etape demande.
	 *
	 * @return the decription of this etape demande
	 */
	@AutoEscape
	public String getDecription();

	/**
	 * Sets the decription of this etape demande.
	 *
	 * @param decription the decription of this etape demande
	 */
	public void setDecription(String decription);

	/**
	 * Returns the order of this etape demande.
	 *
	 * @return the order of this etape demande
	 */
	public long getOrder();

	/**
	 * Sets the order of this etape demande.
	 *
	 * @param order the order of this etape demande
	 */
	public void setOrder(long order);

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
	public int compareTo(EtapeDemande etapeDemande);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EtapeDemande> toCacheModel();

	@Override
	public EtapeDemande toEscapedModel();

	@Override
	public EtapeDemande toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}