/*
 * Copyright (C) 2016  Irotsoma, LLC
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
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.irotsoma.cloudbackenc.encryptionservice.apachecommonscrypto

import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServiceEncryptionAlgorithms
import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServiceFactory
import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServiceKeyAlgorithms
import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServicePBKDFAlgorithms

/**
 * Created by irotsoma on 8/26/2016.
 */
class ApacheCommonsCryptoServiceFactory: EncryptionServiceFactory {
    override val supportedPBKDFAlgorithms: Array<EncryptionServicePBKDFAlgorithms>
        get() = throw UnsupportedOperationException()
    override val supportedEncryptionAlgorithms: Array<EncryptionServiceEncryptionAlgorithms>
        get() = throw UnsupportedOperationException()
    override val supportedKeyAlgorithms: Array<EncryptionServiceKeyAlgorithms>
        get() = throw UnsupportedOperationException()
    override val encryptionServiceFileService = ApacheCommonsCryptoFileService()
    override val encryptionServiceKeyService = ApacheCommonsCryptoKeyService()
    override val encryptionServiceStringService = ApacheCommonsCryptoStringService()

}