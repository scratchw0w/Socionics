package com.socio.repository;

import com.socio.model.UserStatistics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStatisticsRepository extends MongoRepository<UserStatistics, String> {
}