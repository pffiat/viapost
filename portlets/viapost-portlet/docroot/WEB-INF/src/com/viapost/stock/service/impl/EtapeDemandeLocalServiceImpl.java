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

package com.viapost.stock.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.viapost.stock.model.EtapeDemande;
import com.viapost.stock.service.base.EtapeDemandeLocalServiceBaseImpl;

/**
 * The implementation of the etape demande local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.viapost.stock.service.EtapeDemandeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author pif
 * @see com.viapost.stock.service.base.EtapeDemandeLocalServiceBaseImpl
 * @see com.viapost.stock.service.EtapeDemandeLocalServiceUtil
 */
public class EtapeDemandeLocalServiceImpl
	extends EtapeDemandeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.viapost.stock.service.EtapeDemandeLocalServiceUtil} to access the etape demande local service.
	 */
	
	public List<EtapeDemande> findByDemandeId(final long demandeId) throws SystemException {
		return etapeDemandePersistence.findByDemandeId(demandeId);
	}
}