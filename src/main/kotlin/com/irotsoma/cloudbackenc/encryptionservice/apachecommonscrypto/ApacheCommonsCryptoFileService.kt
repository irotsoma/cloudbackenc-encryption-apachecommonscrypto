package com.irotsoma.cloudbackenc.encryptionservice.apachecommonscrypto

import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServiceEncryptionAlgorithms
import com.irotsoma.cloudbackenc.encryptionservice.EncryptionServiceFileService
import java.io.InputStream
import java.io.OutputStream
import java.security.PrivateKey
import java.security.PublicKey
import java.security.SecureRandom
import javax.crypto.SecretKey
import javax.crypto.spec.IvParameterSpec

/**
 * Created by irotsoma on 8/26/2016.
 */
class ApacheCommonsCryptoFileService :EncryptionServiceFileService {
    override fun decrypt(inputStream: InputStream, outputStream: OutputStream, key: PrivateKey, algorithm: EncryptionServiceEncryptionAlgorithms, ivParameterSpec: IvParameterSpec?, secureRandom: SecureRandom?) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun decrypt(inputStream: InputStream, outputStream: OutputStream, key: SecretKey, algorithm: EncryptionServiceEncryptionAlgorithms, ivParameterSpec: IvParameterSpec?, secureRandom: SecureRandom?) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun encrypt(inputStream: InputStream, outputStream: OutputStream, key: PublicKey, algorithm: EncryptionServiceEncryptionAlgorithms, ivParameterSpec: IvParameterSpec?, secureRandom: SecureRandom?) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun encrypt(inputStream: InputStream, outputStream: OutputStream, key: SecretKey, algorithm: EncryptionServiceEncryptionAlgorithms, ivParameterSpec: IvParameterSpec?, secureRandom: SecureRandom?) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}