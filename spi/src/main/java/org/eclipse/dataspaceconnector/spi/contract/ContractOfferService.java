/*
 *  Copyright (c) 2021 Daimler TSS GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Daimler TSS GmbH - Initial API and Implementation
 *
 */

package org.eclipse.dataspaceconnector.spi.contract;

import org.eclipse.dataspaceconnector.spi.types.domain.contract.ContractOffer;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

/**
 * Resolves contract offers.
 */
public interface ContractOfferService {

    /**
     * Resolves contract offers.
     */
    @NotNull
    Stream<ContractOffer> queryContractOffers(ContractOfferQuery query);

}