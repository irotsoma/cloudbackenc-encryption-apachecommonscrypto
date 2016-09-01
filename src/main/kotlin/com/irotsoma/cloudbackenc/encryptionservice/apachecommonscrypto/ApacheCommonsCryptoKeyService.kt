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

import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServiceKeyAlgorithms
import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServiceKeyService
import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServicePBKDFAlgorithms
import java.security.KeyPair
import java.security.SecureRandom
import javax.crypto.SecretKey

/**
 * Created by irotsoma on 8/26/2016.
 */
class ApacheCommonsCryptoKeyService :EncryptionServiceKeyService {
    override fun generatePasswordBasedKey(password: String, salt: ByteArray): SecretKey {
        throw UnsupportedOperationException("not implemented")
    }

    override fun generatePasswordBasedKey(password: String, salt: ByteArray, algorithm: EncryptionServicePBKDFAlgorithms, keySize: Int): SecretKey {
        throw UnsupportedOperationException("not implemented")
    }

    override fun generatePasswordBasedKey(password: String, salt: ByteArray, algorithm: EncryptionServicePBKDFAlgorithms, keySize: Int, iterations: Int): SecretKey {
        throw UnsupportedOperationException("not implemented")
    }

    override fun generateAsymmetricKeys(): KeyPair {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun generateAsymmetricKeys(algorithm: EncryptionServiceKeyAlgorithms, keySize: Int): KeyPair {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun generateAsymmetricKeys(algorithm: EncryptionServiceKeyAlgorithms, keySize: Int, secureRandom: SecureRandom): KeyPair {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun generateSymmetricKey(): SecretKey {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun generateSymmetricKey(algorithm: EncryptionServiceKeyAlgorithms, keySize: Int): SecretKey {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun generateSymmetricKey(algorithm: EncryptionServiceKeyAlgorithms, keySize: Int, secureRandom: SecureRandom): SecretKey {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}