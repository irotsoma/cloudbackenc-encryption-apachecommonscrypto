/*
 * Copyright (C) 2016-2019  Irotsoma, LLC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
/*
 * Created by irotsoma on 8/26/2016.
 */
package com.irotsoma.cloudbackenc.encryption.apachecommonscrypto

import com.irotsoma.cloudbackenc.common.encryption.*


class ApacheCommonsCryptoServiceFactory: EncryptionFactory() {
    override val supportedPBKDFEncryptionAlgorithms: Array<EncryptionPBKDFEncryptionAlgorithms>
        get() = throw UnsupportedOperationException()
    override val supportedSymmetricEncryptionAlgorithms: Array<EncryptionSymmetricEncryptionAlgorithms>
        get() = throw UnsupportedOperationException()
    override val supportedAsymmetricEncryptionAlgorithms: Array<EncryptionAsymmetricEncryptionAlgorithms>
        get() = throw UnsupportedOperationException()
    override val supportedSymmetricKeyAlgorithms: Array<EncryptionSymmetricKeyAlgorithms>
        get() = throw UnsupportedOperationException()
    override val supportedAsymmetricKeyAlgorithms: Array<EncryptionAsymmetricKeyAlgorithms>
        get() = throw UnsupportedOperationException()
    override val encryptionStreamService = ApacheCommonsCryptoStreamService()
    override val encryptionKeyService = ApacheCommonsCryptoKeyService()
    override val encryptionStringService = ApacheCommonsCryptoStringService()

}