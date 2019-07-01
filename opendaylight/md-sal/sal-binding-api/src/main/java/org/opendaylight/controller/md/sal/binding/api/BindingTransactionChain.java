/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.md.sal.binding.api;

import org.opendaylight.controller.md.sal.common.api.data.TransactionChain;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

/**
 * A chain of transactions.
 *
 * <p>
 * For more information about transaction chaining and transaction chains
 * see {@link TransactionChain}.
 *
 * @see TransactionChain
 *
 * @deprecated Use {@link org.opendaylight.mdsal.binding.api.TransactionChain} instead.
 */
@Deprecated
public interface BindingTransactionChain extends TransactionFactory,
        TransactionChain<InstanceIdentifier<?>, DataObject> {
    @Override
    ReadOnlyTransaction newReadOnlyTransaction();

    @Override
    ReadWriteTransaction newReadWriteTransaction();

    @Override
    WriteTransaction newWriteOnlyTransaction();
}
