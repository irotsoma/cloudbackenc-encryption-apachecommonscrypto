package com.irotsoma.cloudbackenc.encryptionservice.apachecommonscrypto

import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServiceEncryptionAlgorithms
import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServiceFactory
import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServiceKeyAlgorithms

/**
 * Created by irotsoma on 8/26/2016.
 */
class ApacheCommonsCryptoServiceFactory: EncryptionServiceFactory {
    override val encryptionServiceFileService = ApacheCommonsCryptoFileService()
    override val encryptionServiceKeyService = ApacheCommonsCryptoKeyService()
    override val encryptionServiceStringService = ApacheCommonsCryptoStringService()
    override val supportedEncryptionAlgorithms: Array<EncryptionServiceEncryptionAlgorithms>
        get() = throw UnsupportedOperationException()
    override val supportedKeyAlgorithms: Array<EncryptionServiceKeyAlgorithms>
        get() = throw UnsupportedOperationException()
}