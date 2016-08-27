package com.irotsoma.cloudbackenc.encryptionservice.apachecommonscrypto

import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServiceKeyAlgorithms
import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServiceKeyService
import java.security.KeyPair
import java.security.SecureRandom
import javax.crypto.SecretKey

/**
 * Created by irotsoma on 8/26/2016.
 */
class ApacheCommonsCryptoKeyService :EncryptionServiceKeyService {
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