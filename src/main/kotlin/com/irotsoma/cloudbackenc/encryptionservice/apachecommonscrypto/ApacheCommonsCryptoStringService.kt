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
/*
 * Created by irotsoma on 8/26/2016.
 */
package com.irotsoma.cloudbackenc.encryptionservice.apachecommonscrypto

import com.irotsoma.cloudbackenc.common.encryptionservice.EncryptionServiceEncryptionAlgorithms
import com.irotsoma.cloudbackenc.common.encryptionservice.EncryptionServiceStringService
import java.security.PrivateKey
import java.security.PublicKey
import java.security.SecureRandom
import javax.crypto.SecretKey
import javax.crypto.spec.IvParameterSpec


class ApacheCommonsCryptoStringService: EncryptionServiceStringService {
    override fun decrypt(input: String, key: PrivateKey, algorithm: EncryptionServiceEncryptionAlgorithms, ivParameterSpec: IvParameterSpec?, secureRandom: SecureRandom?): String {
        throw UnsupportedOperationException("not implemented")
    }

    override fun decrypt(input: String, key: SecretKey, algorithm: EncryptionServiceEncryptionAlgorithms, ivParameterSpec: IvParameterSpec?, secureRandom: SecureRandom?): String {
        throw UnsupportedOperationException("not implemented")
    }

    override fun encrypt(input: String, key: PublicKey, algorithm: EncryptionServiceEncryptionAlgorithms, ivParameterSpec: IvParameterSpec?, secureRandom: SecureRandom?): String {
        throw UnsupportedOperationException("not implemented")
    }

    override fun encrypt(input: String, key: SecretKey, algorithm: EncryptionServiceEncryptionAlgorithms, ivParameterSpec: IvParameterSpec?, secureRandom: SecureRandom?): String {
        throw UnsupportedOperationException("not implemented")
    }
}