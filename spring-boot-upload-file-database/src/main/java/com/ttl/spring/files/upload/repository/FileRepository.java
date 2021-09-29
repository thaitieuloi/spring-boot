package com.ttl.spring.files.upload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ttl.spring.files.upload.entity.FileEntity;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, String> {

}
