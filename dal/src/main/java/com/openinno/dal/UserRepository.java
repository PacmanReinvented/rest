package com.openinno.dal;

import com.openinno.domain.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository("UserRepository")
@RepositoryRestResource(collectionResourceRel = "results", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}