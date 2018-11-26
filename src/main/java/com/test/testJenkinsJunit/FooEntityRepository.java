package com.test.testJenkinsJunit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FooEntityRepository extends JpaRepository<FooEntity, Long> {

}
