package com.atguigu.spring5.config;

import com.atguigu.spring5.bean.User;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
//        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
//        Resource resource = metadataReader.getResource();


        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        System.out.println("MyTypeFilter："+classMetadata.getClassName());

//        if(classMetadata.getClassName().contains("er")){
//            return true;
//        }


        return false;
    }
}
