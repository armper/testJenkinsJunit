package com.test.testJenkinsJunit;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJenkinsJunitApplicationTests {

	@Autowired
	public FooEntityRepository repo;

	@Test
	public void theTest() {

		FooEntity entity = new FooEntity();

		entity.setId(1L);
		entity.setName("foo");

		repo.save(entity);

		Optional<FooEntity> foundEntity = repo.findById(1L);

		foundEntity.ifPresent(e -> {
			System.out.println("found entity" + e);
		});
	}

}
