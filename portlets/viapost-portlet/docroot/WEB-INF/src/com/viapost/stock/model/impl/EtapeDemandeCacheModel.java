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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.viapost.stock.model.EtapeDemande;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EtapeDemande in entity cache.
 *
 * @author pif
 * @see EtapeDemande
 * @generated
 */
public class EtapeDemandeCacheModel implements CacheModel<EtapeDemande>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{etapeId=");
		sb.append(etapeId);
		sb.append(", demandeId=");
		sb.append(demandeId);
		sb.append(", decription=");
		sb.append(decription);
		sb.append(", order=");
		sb.append(order);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EtapeDemande toEntityModel() {
		EtapeDemandeImpl etapeDemandeImpl = new EtapeDemandeImpl();

		etapeDemandeImpl.setEtapeId(etapeId);
		etapeDemandeImpl.setDemandeId(demandeId);

		if (decription == null) {
			etapeDemandeImpl.setDecription(StringPool.BLANK);
		}
		else {
			etapeDemandeImpl.setDecription(decription);
		}

		etapeDemandeImpl.setOrder(order);

		etapeDemandeImpl.resetOriginalValues();

		return etapeDemandeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		etapeId = objectInput.readLong();
		demandeId = objectInput.readLong();
		decription = objectInput.readUTF();
		order = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(etapeId);
		objectOutput.writeLong(demandeId);

		if (decription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(decription);
		}

		objectOutput.writeLong(order);
	}

	public long etapeId;
	public long demandeId;
	public String decription;
	public long order;
}