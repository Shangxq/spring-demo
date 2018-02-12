package com.shang.spring.learn.resource;

import org.springframework.core.io.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ResourceLoader resourceLoader=new DefaultResourceLoader();
        Resource fakeFileResource = resourceLoader.getResource("file:F:/果壳 - 副本.jpg");
        System.out.println(fakeFileResource instanceof ClassPathResource);
        System.out.println(fakeFileResource.contentLength());
        ResourceLoader resourceLoader1= new FileSystemResourceLoader();
        Resource fakeFileResource1 = resourceLoader1.getResource("F:/果壳 - 副本.jpg");
        System.out.println(fakeFileResource1 instanceof ClassPathResource);
    }
}
