package com.mountain.mountain.domain.community.dao;


import com.mountain.mountain.domain.community.model.Community;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;



@Repository
public interface CommunityRepository extends JpaRepository<Community, Long> , JpaSpecificationExecutor<Community> {

}