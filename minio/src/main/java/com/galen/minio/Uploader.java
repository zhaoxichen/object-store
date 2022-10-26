package com.galen.minio;

import io.minio.MinioClient;

/**
 * author: galen
 * date: 2022/10/26-11:29
**/
public class Uploader {

    public static void upload(){
        String endpoint = "http://10.11.34.20:9000";
        String bucket = "platform";
        MinioClient minioClient = new MinioClient(endpoint,null,null);

        if (!minioClient.bucketExists(bucket)){
            minioClient.makeBucket(bucket);
        }

    }
}
