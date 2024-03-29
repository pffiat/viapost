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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author pif
 * @generated
 */
public class EtapeDemandeSoap implements Serializable {
	public static EtapeDemandeSoap toSoapModel(EtapeDemande model) {
		EtapeDemandeSoap soapModel = new EtapeDemandeSoap();

		soapModel.setEtapeId(model.getEtapeId());
		soapModel.setDemandeId(model.getDemandeId());
		soapModel.setDecription(model.getDecription());
		soapModel.setOrder(model.getOrder());

		return soapModel;
	}

	public static EtapeDemandeSoap[] toSoapModels(EtapeDemande[] models) {
		EtapeDemandeSoap[] soapModels = new EtapeDemandeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EtapeDemandeSoap[][] toSoapModels(EtapeDemande[][] models) {
		EtapeDemandeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EtapeDemandeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EtapeDemandeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EtapeDemandeSoap[] toSoapModels(List<EtapeDemande> models) {
		List<EtapeDemandeSoap> soapModels = new ArrayList<EtapeDemandeSoap>(models.size());

		for (EtapeDemande model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EtapeDemandeSoap[soapModels.size()]);
	}

	public EtapeDemandeSoap() {
	}

	public long getPrimaryKey() {
		return _etapeId;
	}

	public void setPrimaryKey(long pk) {
		setEtapeId(pk);
	}

	public long getEtapeId() {
		return _etapeId;
	}

	public void setEtapeId(long etapeId) {
		_etapeId = etapeId;
	}

	public long getDemandeId() {
		return _demandeId;
	}

	public void setDemandeId(long demandeId) {
		_demandeId = demandeId;
	}

	public String getDecription() {
		return _decription;
	}

	public void setDecription(String decription) {
		_decription = decription;
	}

	public long getOrder() {
		return _order;
	}

	public void setOrder(long order) {
		_order = order;
	}

	private long _etapeId;
	private long _demandeId;
	private String _decription;
	private long _order;
}